cmake_minimum_required(VERSION 3.15)
project(Niukewang)

set(CMAKE_CXX_STANDARD 14)

add_executable(Niukewang GetCubeRoot/main.cpp StringReverse/main.cpp main.cpp GetCubeRoot/getCubeRoot.h)