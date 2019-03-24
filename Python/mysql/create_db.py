# Creating a database with MySQL/Python

# import the mysql.connector module
import mysql.connector

# creating a database connection
myDatabase = mysql.connector.connect(
    host="localhost",
    user="user",
    passwd="password"
)

# creating a database cursor to manage queries
dbCursor = myDatabase.cursor()

# executing a create database query
dbCursor.execute("CREATE DATABASE myDatabase")

# updating the myDatabase connection to include the database's name
myDatabase = mysql.connector.connect(
    host="localhost",
    user="user",
    passwd="password",
    database="myDatabase"
)
