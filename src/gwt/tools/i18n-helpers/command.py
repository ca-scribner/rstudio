from i18n_gwt_interface import I18NGwtConstantsInterfaceGenerator, \
    I18NGwtPropertiesGenerator, Constant, Property, Text
import xml.etree.ElementTree as ET

TRANSLATABLE_FIELDS = ["label", "buttonLabel", "menuLabel", "desc"]


class Command:
    def __init__(self, xml_element: ET, prefix: str = ""):
        """
        Parsing structure to convert a Command in Commands.cmd.xml format to translatable Java constant statements

        :param xml_element: XML ElementTree describing a Command
        """
        self.id = None

        # Fields that could be translated
        self.label = None
        self.buttonLabel = None
        self.menuLabel = None
        self.desc = None

        # Ensure these match the fields in TRANSLATABLE_FIELDS
        # (these could instead be defined dynamically from TRANSLATABLE_FIELDS,
        # but that feels more opaque...)
        self._ensure_translatable_fields_exist(TRANSLATABLE_FIELDS)

        self.parse(xml_element)

    def _ensure_translatable_fields_exist(self, translatable_fields):
        for field_name in translatable_fields:
            if not hasattr(self, field_name):
                raise ValueError("Object missing attribute '{f}' that is called as required translatable field.  "
                                 "Did you add a field to TRANSLATABLE_FIELDS without adding the attribute?")

    def parse(self, xml_element):
        self.id = xml_element.get('id', None)
        for field_name in TRANSLATABLE_FIELDS:
            setattr(self, field_name, xml_element.get(field_name, None))

    @property
    def translatable_fields(self):
        for field_name in TRANSLATABLE_FIELDS:
            if getattr(self, field_name) is not None:
                yield field_name

    def to_constants(self, prefix: str = "", include_header: bool = True):
        """
        Returns this Command described by Java constant statements definition

        For example:
            [
                "@DefaultStringValue("Some default label")",
                "String someCommandLabel();",
            ]

        :param prefix: (optional) Text prefix to add to the default value on all translatable fields.  Useful for
                       highlighting default values against their true English text (to see if English text is picked up)
        :param include_header: If true, output lines will include a header line stating command name
        :return: List of string Java statements for the translatable constants defining this command
        """
        constants = []
        if include_header:
            constants.append(Text(f"// Command: {self.id}"))
        for field_name in self.translatable_fields:
            constant_name = generate_name(self.id, field_name.capitalize())
            default_value = getattr(self, field_name)
            constants.append(Constant(constant_name, prefix + default_value))
        return constants

    def to_properties(self, prefix: str = "", include_header: bool = True):
        properties = []
        if include_header:
            properties.append(Text(f"# Command: {self.id}"))
        for field_name in self.translatable_fields:
            full_field_name = generate_name(self.id, field_name.capitalize())
            properties.append(Property(name=full_field_name, value=prefix + getattr(self, field_name)))
        return properties


def generate_name(this_id, field_name):
    """Helper to generate a name from id and field_name"""
    return f"{this_id}{field_name.capitalize()}"



INTERFACE_NAME = "CommandConstants"


def xml_to_commands_interface(root_element, prefix: str = ""):
    interface = I18NGwtConstantsInterfaceGenerator(INTERFACE_NAME)

    print("WARNING: Add package?")

    # Get cmd's that are direct children of root element
    for cmd_xml in root_element.findall("cmd"):
        cmd = Command(cmd_xml)
        for constant in cmd.to_constants(prefix=prefix):
            interface.add_constant(constant)
        interface.add_constant(Text(""))  # Newline to separate groups
    return interface


def xml_to_commands_properties(root_element, prefix: str = ""):
    # TODO: Add descriptive header
    properties = I18NGwtPropertiesGenerator(header="# Auto generated file - do not change manually")

    # Get cmd's that are direct children of root element
    for cmd_xml in root_element.findall("cmd"):
        cmd = Command(cmd_xml)
        for prop in cmd.to_properties(prefix=prefix):
            properties.add_property(prop)
        properties.add_property(Text(""))  # Newline to separate groups

    return properties
