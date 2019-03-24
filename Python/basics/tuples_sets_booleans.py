# Tuples are immutable sequences (cannot change unlike a List)
# Sets are unordered collections of unique elements
# Booleans are true or false statements

# Tuples (works exactly like a List, but cannot change Tuple values)
myTuple = (1, 2, 3)
print(myTuple[0])  # prints: 1

# Sets (works exactly like a List, but do not define the Set beforehand)
mySet = set()
mySet.add(1)
mySet.add(2)
print(mySet)  # prints: {1,2}
mySet.remove(2)
print(mySet)  # prints: {1}
mySet.add(1)  # sets can ONLY add UNIQUE elements, so this won't be added since 1 is already there
print(mySet)  # prints: {1}

# Booleans
a = True
b = False
c = 0  # equals to False
d = 1  # equals to True
