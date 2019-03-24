# Comparision Operators
1 > 2  # Greater Than (False)
1 < 2  # Less Than (True)
1 >= 2  # Greater Than or Equal (False)
1 <= 2  # Less Than or Equal (True)
1 == 1  # Equals to (True)
1 == "1"  # Equals to, mismatched type (False)
1 != 1  # Does not Equal to (False)

# Logical Operators
(1 > 2) and (2 < 3)  # And operator, all statements must be true (False)
(1 > 2) or (2 < 3)  # Or operator, only one must be true (True)

# If statements (requires a tab for statements after the if colon)
if 1 < 2:
    print("1 is less than 2!")
    print("Now let's test a nested if!")
    if 20 < 3:
        print("Second Block")

# If-Else statements
if 1 > 2:
    print("We're running the if statement")
else:
    print("We're running the else statement")

# Else-if statements
if 1 > 2:
    print("We're running the if statement")
elif 3 == 3:
    print("We're running the else if (elif) statement")
else:
    print("We're running the else statement")

# For Loops (requires a tab for statements after the for colon)
sequenceList = [1, 2, 3, 4, 5]
for item in sequenceList:
    print(item)  # prints: 1,2,3,4,5 each in new lines

# For Loops (with multiple lists/tuples)
myTuples = [(1, 2), (3, 4), (5, 6)]
for (tup1, tup2) in myTuples:
    print(tup1)  # prints: 1,3,5 each in new lines
    print(tup2)  # prints: 2,4,6 each in new lines

# While Loops (requires a tab for statements after the while colon)
i = 0
while i < 5:
    print("i is: {}".format(i))
    i += 1

# Lists and Range
list(range(0, 5))  # [1,2,3,4] slice notation, does not include last digit
list(range(0, 20, 2))  # [0,2,4,6,8,10,12,14,16,18] skips by 2

# For Loops and Range
for item in range(10):
    print(item)  # prints: 0,1,2,3,4,5,6,7,8,9
