# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.15

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake

# The command to remove a file.
RM = /Applications/CLion.app/Contents/bin/cmake/mac/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/mac/Documents/Niukewang/Candy_allocate

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/mac/Documents/Niukewang/Candy_allocate/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/Candy_allocate.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Candy_allocate.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Candy_allocate.dir/flags.make

CMakeFiles/Candy_allocate.dir/main.cpp.o: CMakeFiles/Candy_allocate.dir/flags.make
CMakeFiles/Candy_allocate.dir/main.cpp.o: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/mac/Documents/Niukewang/Candy_allocate/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/Candy_allocate.dir/main.cpp.o"
	/Library/Developer/CommandLineTools/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/Candy_allocate.dir/main.cpp.o -c /Users/mac/Documents/Niukewang/Candy_allocate/main.cpp

CMakeFiles/Candy_allocate.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/Candy_allocate.dir/main.cpp.i"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/mac/Documents/Niukewang/Candy_allocate/main.cpp > CMakeFiles/Candy_allocate.dir/main.cpp.i

CMakeFiles/Candy_allocate.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/Candy_allocate.dir/main.cpp.s"
	/Library/Developer/CommandLineTools/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/mac/Documents/Niukewang/Candy_allocate/main.cpp -o CMakeFiles/Candy_allocate.dir/main.cpp.s

# Object files for target Candy_allocate
Candy_allocate_OBJECTS = \
"CMakeFiles/Candy_allocate.dir/main.cpp.o"

# External object files for target Candy_allocate
Candy_allocate_EXTERNAL_OBJECTS =

Candy_allocate: CMakeFiles/Candy_allocate.dir/main.cpp.o
Candy_allocate: CMakeFiles/Candy_allocate.dir/build.make
Candy_allocate: CMakeFiles/Candy_allocate.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/mac/Documents/Niukewang/Candy_allocate/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable Candy_allocate"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Candy_allocate.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Candy_allocate.dir/build: Candy_allocate

.PHONY : CMakeFiles/Candy_allocate.dir/build

CMakeFiles/Candy_allocate.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/Candy_allocate.dir/cmake_clean.cmake
.PHONY : CMakeFiles/Candy_allocate.dir/clean

CMakeFiles/Candy_allocate.dir/depend:
	cd /Users/mac/Documents/Niukewang/Candy_allocate/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/mac/Documents/Niukewang/Candy_allocate /Users/mac/Documents/Niukewang/Candy_allocate /Users/mac/Documents/Niukewang/Candy_allocate/cmake-build-debug /Users/mac/Documents/Niukewang/Candy_allocate/cmake-build-debug /Users/mac/Documents/Niukewang/Candy_allocate/cmake-build-debug/CMakeFiles/Candy_allocate.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/Candy_allocate.dir/depend
