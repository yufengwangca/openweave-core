#!/bin/sh

#
#    Copyright 2018 Google LLC All Rights Reserved.
#
#    Licensed under the Apache License, Version 2.0 (the "License");
#    you may not use this file except in compliance with the License.
#    You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
#    Unless required by applicable law or agreed to in writing, software
#    distributed under the License is distributed on an "AS IS" BASIS,
#    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#    See the License for the specific language governing permissions and
#    limitations under the License.
#

#
#    Description:
#      This file is the script for Travis CI hosted, distributed continuous 
#      integration 'script' step.
#

die()
{
    echo " *** ERROR: " ${*}
    exit 1
}


case "${BUILD_TARGET}" in

    linux-auto-*-distcheck)
        ./configure && make distcheck
        ;;

    linux-auto-*-lint)
        ./configure && make pretty-check
        ;;

    linux-auto-clang)
        ./configure && make && make check
        ;;

    linux-auto-gcc)
        ./configure --enable-coverage && make && make check
        ;;

    osx-auto-clang)
        ./configure && make
        ;;

    esp32)
        .travis/build_esp32.sh
        ;;

    *)
        die "Unknown build target \"${BUILD_TARGET}\"."
        ;;
        
esac
