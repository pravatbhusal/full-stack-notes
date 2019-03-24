# We will open the file
file = open("file.txt", "r")

# Reading the contents of the file
print(file.read())  # prints the entire file

# Read only characters of a file
print(file.read(5))  # prints only the first 5 characters

# Reading lines of a file
print(file.readline())  # prints the first line
print(file.readline())  # prints the second line

# Looping through all lines of a file
for line in file:
    print(line)  # prints each line
