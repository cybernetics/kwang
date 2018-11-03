#!/bin/sh

if [[ ! -d "lwan" ]]; then
    echo "Cloning lwan"
    git submodule update --init --recursive
fi
echo "Building Lwan"
cd lwan
rm -rf build
mkdir build && cd build
cmake .. && make