# We will open the file, and give the "a"" parameter
file = open("file.txt", "a")

# Writing a new line onto the file
file.write("Now the file has one more line!")

# Overwriting the entire file, using the "w"" parameter
file = open("file.txt", "w")
file.write("Whoops! I have dleted the content!")

# Creating a new file, using the "x" parameter
file = open("newfile.txt", "x")

# Creating a new file if it does not exist, using the "w" parameter
file = open("newfile.txt", "w")
