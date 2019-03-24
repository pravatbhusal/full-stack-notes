# By convention, class names are always capitalized
class Sample():
    pass  # the pass keyword means that the class will not do anything


x = Sample()
print(type(x))  # prints: <class '__main__.Sample'>


# Creating a new class named "Dog"
class Dog():
    # all methods inside of a Python class need the self parameter
    # constructor, or initalization method (function)
    def __init__(self, breed, name):
        self.breed = breed  # setting the class's property of breed to the breed parameter
        self.name = name

    # we can also have other methods and return values
    def getName(self):
        return self.name  # the self keyword is available throughout the class's scope


myDog = Dog(breed="Lab", name="Rob")
otherDog = Dog(breed="Husky", name="Bob")
print(myDog.breed)  # prints: "Lab"
print(otherDog.breed)  # prints: "Husky"
print(myDog.name)  # prints: "Rob"
print(otherDog.name)  # prints: "Bob"
print(myDog.getName())  # prints: "Rob"
print(otherDog.getName())  # prints: "Bob"


# Inheritance, allows classes to inherit methods from another class
class Animal():

    def __init__(self):
        print("Animal Created!")

    def whoAmI(self):
        print("Animal")

    def eat(self):
        print("Eating")


# inherting the animal class onto the Cat class
class Cat(Animal):

    def __init__(self):
        print("Cat Created!")

    # overwriting the Animal's eat() method
    def eat(self):
        print("Cat Eating")


myCat = Cat()
myCat.whoAmI()  # prints: "Animal"
myCat.eat()  # prints: "Cat Eating"


# Special Methods, these can be identified through double underscores __NAME__
class Book():

    def __init__(self, title, author, pages):
        self.title = title
        self.author = author
        self.pages = pages

    # String representation of the class object
    def __str__(self):
        return "Title: {}, Author: {}, Pages: {}".format(self.title, self.author, self.pages)

    # Length representation of the class
    def __len__(self):
        return self.pages

    # Deleting the class from memory
    def __del__(self):
        print("The book was destroyed!")


myBook = Book("Python", "Pravat", 200)
print(myBook)  # prints: "Title: Python, Author: Pravat, Pages: 200"
print(len(myBook))  # prints: 200
del myBook  # deletes the book from memory space, optional to put paranthesis around the object
