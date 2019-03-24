# Functions use the "def" keyword, python uses snake case for identifier names

# A classic function with a default parameter
def my_func(param1="Default"):
    print("My First Python Function!")
    print(param1)


my_func()


# A documented function
def my_doc_func():
    """
    THIS IS THE DOCUMENTATION STRING FOR THE FUNCTION
    """
    print("A python function")


my_doc_func()


# A return function, can only return once
def return_hello():
    return "Hello"


result = return_hello()
print(result)  # prints: Hello

# Filter Function, returns the items in a sequence that is true in a function
myList = [1, 2, 3, 4, 5, 6, 7, 8]


def even_bool(num):
    return num % 2 == 0  # returns true if the number is even, or false if odd


evens = filter(even_bool, myList)
print(list(evens))  # cast it as a list, prints: [2,4,6,8]

# Lambda Expression, a one line function (like arrow functions in JS)
evens = filter(lambda num: num % 2 == 0, myList)
print(list(evens))  # cast it as a list, prints: [2,4,6,8]


# single asterisk parameter (tuples)
def single_asterisk(param1, *param2):
    print(param1)
    print(param2)  # prints a tuple


# double asterisk parameter (dictionaries)
def double_asterisk(param1, **param2):
    print(param1)
    print(param2)  # prints a dictionary


single_asterisk(1, 2, 3, 4, 5)  # prints: 1 (2, 3, 4, 5)
double_asterisk(1, a=2, b=3)  # prints: 1 {'a': 2, 'b': 3}
