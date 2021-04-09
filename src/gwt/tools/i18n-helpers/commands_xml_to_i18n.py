import xml.etree.ElementTree as ET
import argparse
from xml_to_i18n import xml_to_interface, xml_to_properties

ELEM_PARSERS = {}
COMMAND_CONSTANTS_DEFAULT_FILENAME = None
COMMAND_PROPERTIES_DEFAULT_FILENAME = None
COMMAND_INTERFACE_NAME = "CommandConstants"
COMMAND_ELEMENT_TYPE = "cmd"


def parse_args():
    parser = argparse.ArgumentParser(
        description="Helper to translate commands.cmd.xml to Java/GWT interface and properties file"
    )

    parser.add_argument("xmlfile", type=str)
    parser.add_argument("--command_constant_file",
                        type=str,
                        default=COMMAND_CONSTANTS_DEFAULT_FILENAME,
                        help=f"Filename to output constants for Commands (if omitted, file will not be written)"
                        )
    parser.add_argument("--command_constant_prefix",
                        type=str,
                        default="",
                        help=f"Text prefix for all default command values in the java interface.  Useful to visually "
                             f"highlight when a default text statement is used vs a translated one during debugging")
    parser.add_argument("--command_properties_file",
                        type=str,
                        default=COMMAND_PROPERTIES_DEFAULT_FILENAME,
                        help=f"Filename to output properties for Commands (if omitted, file will not be written)"
                        )
    parser.add_argument("--command_properties_prefix",
                        type=str,
                        default="",
                        help=f"Text prefix for all entries in the emitted properties file.  Useful to visually "
                             f"highlight when a string from this property file is used during debugging")
    parser.add_argument("--packages", "--package",
                        default=[],
                        action='append',
                        help="Add one or more package calls to the top of the Constants.java file.  For multiple "
                             "packages, invoke this multiple times.")

    return parser.parse_args()


if __name__ == "__main__":
    args = parse_args()

    tree = ET.parse(args.xmlfile)
    root = tree.getroot()

    if args.command_constant_file is not None:
        constants = xml_to_interface(COMMAND_INTERFACE_NAME, root, element_type=COMMAND_ELEMENT_TYPE, prefix=args.command_constant_prefix)
        for package in args.packages:
            constants.add_package(package)
        constants.write(args.command_constant_file)

    if args.command_properties_file is not None:
        properties = xml_to_properties(root, element_type=COMMAND_ELEMENT_TYPE, prefix=args.command_properties_prefix)
        properties.write(args.command_properties_file)
