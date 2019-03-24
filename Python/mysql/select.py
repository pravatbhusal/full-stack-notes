import mysql.connector

myDatabase = mysql.connector.connect(
    host="localhost",
    user="user",
    passwd="password",
    database="myDatabase"
)

dbCursor = myDatabase.cursor()

# get all row values from the "customers" table
dbCursor.execute("SELECT * FROM customers")

# get the first row value from the query into an array
myResult = dbCursor.fetchone()
print(myResult)

# get the entire row values from the query into an array
myEntireResult = dbCursor.fetchall()

# print out each individual row of the result array, each as an array of each column value
for row in myEntireResult:
    print(row)
