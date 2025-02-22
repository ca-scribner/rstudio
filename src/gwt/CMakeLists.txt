#
# CMakeLists.txt
#
# Copyright (C) 2021 by RStudio, PBC
#
# Unless you have received this program directly from RStudio pursuant
# to the terms of a commercial license agreement with RStudio, then
# this program is licensed to you under the terms of version 3 of the
# GNU Affero General Public License. This program is distributed WITHOUT
# ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
# MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
# AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
#
#

cmake_minimum_required(VERSION 3.4.3)
project (RSTUDIO_GWT)

set(GWT_LIB_DIR "lib")

# define output dirs
if("${GWT_BIN_DIR}" STREQUAL "")
   set(GWT_BIN_DIR "bin")
endif()
if("${GWT_WWW_DIR}" STREQUAL "")
   set(GWT_WWW_DIR "www")
endif()
if("${GWT_EXTRAS_DIR}" STREQUAL "")
   set(GWT_EXTRAS_DIR "extras")
endif()

# allow opt in / out of GWT build
# mainly for faster iteration in builds
if(NOT DEFINED GWT_BUILD)
   set(GWT_BUILD Yes)
endif()

if(DEFINED ENV{GWT_BUILD})
   set(GWT_BUILD $ENV{GWT_BUILD})
endif()

# set main module (allow override from envvar)
set(GWT_MAIN_MODULE "RStudio")
if(DEFINED ENV{GWT_MAIN_MODULE})
   set(GWT_MAIN_MODULE $ENV{GWT_MAIN_MODULE})
endif()

# memory settings (allow override from env)
set (GWT_XMX "-Xmx1536M")
if(DEFINED ENV{GWT_XMX})
   set(GWT_XMX $ENV{GWT_XMX})
endif()
set (GWT_XSS "-Xss16M")
if(DEFINED ENV{GWT_XSS})
   set(GWT_XSS $ENV{GWT_XSS})
endif()

if(GWT_BUILD)
   message(STATUS "Configured to build GWT")
   set(GWT_COPY Yes)

   find_program(ANT
      NAMES ant
      PATHS "$ENV{HOME}/opt/bin" "$ENV{HOME}/homebrew/${UNAME_M}/bin")

   if(ANT)
      message(STATUS "Using ant: ${ANT}")
   else()
      message(FATAL_ERROR "ant not found (required to build GWT)")
   endif()

   # invoke ant to build
   add_custom_target(gwt_build ALL)

   # wait for major C++ work to complete before running the GWT build;
   # the Java compiler often runs out of resources when a parallel C++
   # is happening: https://github.com/rstudio/rstudio/issues/7660
   if (TARGET rserver)
      add_dependencies(gwt_build rsession rserver)
   elseif(TARGET desktop)
      add_dependencies(gwt_build rsession desktop)
   else()
      add_dependencies(gwt_build rsession)
   endif()

   add_custom_command(
      TARGET gwt_build
      WORKING_DIRECTORY "${CMAKE_CURRENT_SOURCE_DIR}"
      COMMAND
         ${ANT}
         -Dbuild.dir="${GWT_BIN_DIR}"
         -Dwww.dir="${GWT_WWW_DIR}"
         -Dextras.dir="${GWT_EXTRAS_DIR}"
         -Dlib.dir="${GWT_LIB_DIR}"
         -Dgwt.xmx="${GWT_XMX}"
         -Dgwt.xss="${GWT_XSS}"
         -Dgwt.main.module="org.rstudio.studio.${GWT_MAIN_MODULE}")
endif()

if(NOT DEFINED GWT_COPY)
   set(GWT_COPY Yes)
endif()

if(GWT_COPY)
   message(STATUS "Configured to install GWT")

   # create test script and copy to binary directory with executable permissions
   configure_file(${CMAKE_CURRENT_SOURCE_DIR}/gwt-unit-tests.sh.in
                  ${CMAKE_CURRENT_BINARY_DIR}${CMAKE_FILES_DIRECTORY}/gwt-unit-tests.sh)
   file(COPY ${CMAKE_CURRENT_BINARY_DIR}${CMAKE_FILES_DIRECTORY}/gwt-unit-tests.sh
             DESTINATION ${CMAKE_CURRENT_BINARY_DIR}
             FILE_PERMISSIONS OWNER_READ OWNER_WRITE OWNER_EXECUTE GROUP_READ
             GROUP_EXECUTE WORLD_READ WORLD_EXECUTE)
   
   # installation rules
   install(DIRECTORY www DESTINATION ${RSTUDIO_INSTALL_SUPPORTING})
   install(DIRECTORY "${GWT_WWW_DIR}" DESTINATION ${RSTUDIO_INSTALL_SUPPORTING})
   install(DIRECTORY "${GWT_EXTRAS_DIR}/rstudio/symbolMaps/"
           DESTINATION ${RSTUDIO_INSTALL_SUPPORTING}/www-symbolmaps)

endif()

