# Python's scope follows the LEGB Rule: Local, Enclosing Functions, Global, Built-in

x = 50


def func():
    # currently the function uses the global x value of 50
    x = 1000  # sets local x
    return x  # (returns local x) returns: 1000


print("Before function call, x is: ", x)
x = func()
print("After function call, x is: ", x)

# Modifying global inside of a scope
y = 25


def modify_func():
    global y  # now it sets the global y to equal to the local y inside this scope
    y = 50
    print(y)  # prints: 50


modify_func()
print(y)  # prints: 50, since we set the global in the modify_func() function


# locals() and globals() functions
def scope_func():
    print(locals())  # prints the local() objects
    print(globals())  # prints the global() objects


scope_func()
