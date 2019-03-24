# Regular Expressions allow us to search for patterns in Strings

import re  # importing the re module for regular expressions

myPatterns = ["Term1", "Term2"]
myText = "This is a string with Term1, but not the other!"

for pattern in myPatterns:
    print("I'm searching for: " + pattern)

    # the regular expression for searching if text contains
    if re.search(pattern, myText):
        print("Match found!")
    else:
        print("No match found!")

# re.search() method
match = re.search("Term1", "Term1")  # looks for index when the search is found
print(match.start())  # prints: 0

# re.split() method
match = re.split("@", "user@gmail.com")  # splits at the first parameter into two arrays
print(match)  # prints: ['user', 'gmail.com']

# re.findall() method
match = re.findall("Match", "Test phrase Match in Match middle")  # gets list of match
print(match)
