# variables in python do not require a declaration of type

# all numbers are now considered either an integer or float in Python 3.0+
# in terms of Python mathematics, it follows the PEMDAS rule
a = 12
b = 3
print(a + b)  # (addition operator) prints: 15
print(a - b)  # (subtraction operator) prints: 9
print(a * b)  # (multiplication operator) prints: 36
print(a / b)  # (float division operator) prints: 4.0
print(a // b)  # (integer division operator) prints: 4
print(a % b)  # (modulus operator) prints: 0

# Extra Mathematical Operators
2 ** 2  # Exponent (2^2 = 4)
i = 0;
i += 1  # i now equals to 1, this equal operation can be used by all math operators

# Number Typing
c = 3.0
print(a + c)  # (if there's a float type, then it always overrides the operation) prints: 15.0
print(type(3.0))  # prints: <class 'float'>
print(type(3))  # prints: <class 'int'>
