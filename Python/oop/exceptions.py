# Exception handling allows us to deal with errors and debug

# Sample try, except, and else statements
try:
    file = open("file.txt", "r")  # attempting to read file.txt
    file.write("Writing this line on file.txt")
except:
    print("Error, did not have permission to open file.txt or no file exists!")
else:
    print("Success! Opened and wrote on file.txt")
    file.close()  # the file object can be accessed in the else statement

# Sample finally statement, which run even if the try statement fails
try:
    file = open("file.txt", "r")  # attempting to read file.txt
    file.write("Writing this line on file.txt")
except:
    print("Error, did not have permission to open file.txt or no file exists!")
finally:
    print("Finally statements always run, even if it fails!")
