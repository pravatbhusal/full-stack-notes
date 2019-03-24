# Decorators modify the functionality of another function
# We can better understand this by knowing that everything in Python is an Object

# Running functions inside of functions
def my_func():
    print("The my_func() function has been ran")

    def inside_func():
        return "This string can only be accessed inside my_func()"

    print(inside_func())  # prints: "This string can only be accessed inside my_func()"
    return "The return value"


my_func()  # runs only the my_func() function, and my_func() only runs its functions

myFunc = my_func  # myFunc equals to the function of my_func, not the return value
print(myFunc())  # prints: "The return value"


# Passing functions inside of functions as parameters
def child_func():
    return "This is ran by the child function"


def parent_func(func):
    print(func())  # prints: "This is ran by thr child function"


parent_func(child_func)  # passes the child_func as a parameter to parent_func


# Adding a decorator with the @ symbol
def new_decorator(func):
    func()


@new_decorator  # assigns the decorator_func() to the new_decorator() func parameter, then runs new_decorator()
def decorator_func():
    print("This function is ran by a decorator!")
