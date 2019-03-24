# Lists are the Python version of Arrays

myList = [1, 2, 3, 'a', 'b', 'c']

print(len(myList))  # (gets list length) prints: 6
print(myList[0])  # (gets the 0th index of list) prints: 1
print(myList[:])  # (prints the entire list)

# updating list
myList[0] = 1.5  # updates 0th index of list
print(myList[0])  # prints: 1.5

# appending list
myList.append("NEW ITEM")  # appends to last index of list
print(myList[-1])  # (gets last index of list) prints: "NEW ITEM"

# extending list
myList.extend(["x", "y"])  # extends the list by implementing array into it
print(myList[-1])  # prints: "y"

# popping list
item = myList.pop(0)  # remove item in the list, and return it
print(myList[0])  # prints: 2
print(item)  # prints: 1.5

# reversing list
myList.reverse()  # reverses the entire list

# sorts list by using the best sort, not supported for different data-types
mySortedList = [3, 2, 5, 7]
mySortedList.sort()  # prints: 2,3,5,7

# nested lists
myNestedList = [1, 2, ["x", "y", "z"]]
print(myNestedList[2][1])  # prints: "y"

# complex matrix list (multi-dimensional lists)
matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
# LIST COMPREHENSION (similar to for loop, getting the first column)
first_column = [row[0] for row in matrix]
print(first_column)  # prints: [1,4,7]
