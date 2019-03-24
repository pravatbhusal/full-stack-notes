"""
There are four different methods (modes) for opening a file:
"r" - Read - Default value. Opens a file for reading, error if the file does not exist

"a" - Append - Opens a file for appending, creates the file if it does not exist

"w" - Write - Opens a file for writing, creates the file if it does not exist

"x" - Create - Creates the specified file, returns an error if the file exists

In addition you can specify if the file should be handled as binary or text mode:
"t" - Text - Default value. Text mode

"b" - Binary - Binary mode (e.g. images)
"""

# open() function opens a file, if the file does not exist then it will throw an error
file = open("file.txt")
file = open("file.txt", "rt")  # same as the code above, since "rt" are both defaults
