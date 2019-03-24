# Deleting a file requires the OS module
import os

# Removing (Deleting) a file
os.remove("file.txt")

# Checking if a file exists
if os.path.exists("file.txt"):
    print("The file exists")
else:
    print("The file does not exist!")

# Removing (Deleting) an entire folder
os.rmdir("folder")
