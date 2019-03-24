# Strings, or in simpler terms "text", in Python

myString = 'abcdefg'

# indexing a string
print(myString)  # prints: "abcedfg"
print(myString[0])  # (indexing a String) prints: a
print(myString[-1])  # (-1 means last index in Python) prints: g

# slicing a string
print(myString[2:])  # (grabs from index 2 to the end) prints: "cdefg"
print(myString[:3])  # (grabs up to index 3 but not including) prints: "abc"
print(myString[2:5])  # (grabs from index 2 up to but not including 5) prints: "cde"
print(myString[:])  # (grabs entire string) prints: "abcdefg"
print(myString[::2])  # (step size of 2, or skipping every other) prints: "aceg"

# casing a string
print(myString.upper())  # (prints uppercase) prints: "ABCDEFG"
print(myString.lower())  # (prints lowercase) prints: "abcdefg"
print(myString.capitalize())  # (first letter capitalize) prints: "Abcedfg"

# splitting strings
print(myString.split('e'))  # (splits a string on each e, and removes the e) prints: ['H', 'llo World']

# contains, if a value is within a set of data
print("x" in "This is a string!")  # prints: false
print("x" in [1, 2, 3, 4, "x"])  # prints: true

# string print formatting
formatString1 = "Insert another string here: {}".format(
    "INSERTED!")  # (inserts a String to the {}) prints: "Insert another string here: INSERTED"
formatString2 = "Test 1: {} and Test 2: {}".format("x", "y")  # prints: "Test 1: x and Test 2: y"
formatString3 = "Test 1: {x} Test 2: {y}".format(x="x", y="y")  # prints: "Test 1: x and Test 2: y"
