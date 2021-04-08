import pytest
import xml.etree.ElementTree as ET
from command import Command, TRANSLATABLE_FIELDS


# @pytest.fixture()
# def sample_commands_cmd_xml():
#     xml_file = "./sample_commands.cmd.xml"
#     tree = ET.parse(xml_file)
#     return tree


@pytest.fixture()
def sample_command():
    cmd_xml = """
    <cmd id="cmdId"
     label="cmdLabel"
     buttonLabel="cmdButtonlabel"
     menuLabel="cmd_MenuLabel"
     desc="cmdDesc"
     checkable="false"
     radio="false"
     visible="false"
     windowMode="main"
     rebindable="false"/>
    """
    return ET.fromstring(cmd_xml)


def test_Command_parse(sample_command):
    c = Command(sample_command)

    fields_to_compare = ['id'] + TRANSLATABLE_FIELDS
    for fieldname in fields_to_compare:
        assert getattr(c, fieldname) == sample_command.get(fieldname)
