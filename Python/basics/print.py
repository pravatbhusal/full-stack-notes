# comments in python use hashtags
__author__ = 'shadowsych'  # specifying the author of the file
# in python, it's not standard practice to use semi-colons
print("Hello World!")  # prints: "Hello World!"
print(3 * 5)  # an example of mathematical operation, prints: 15
name = "Pravat"  # a variable, python is a non-strict type language
print("Hello " + name)  # an example of concatenation, prints: "Hello Pravat"
print('Hello "Becky"')  # an example of using quotes inside of a string

# this is an example of new line strings in Python, using \n
newLineString = "This string has been \nsplit over\nseveral\nlines"
print(newLineString)

# this is an example of new line strings in python, using """
anotherNewLineString = """This string has been
split over
several lines"""
print(anotherNewLineString)

# this is an example of tab strings in Python, use \t
tabbedString = "1\t2\t3\t4\t5"
print(tabbedString)

# both print: 'The pet shop owner said "No, no, 'e's uh... he\s resting'
print('The pet shop owner said "No, no, \'e\'s uh... he\s resting"')
print("The pet shop owner said \"No, no, \'e\'s uh... he\s resting\"")

# (using triple quotes) both print: The pet shop owner said "No, no, 'e's' uh,...he's resting"
print('''The pet shop owner said "No, no, 'e's' uh,...he's resting"''')
print("""The pet shop owner said "No, no, 'e's' uh,...he's resting" """)
