import mysql.connector

myDatabase = mysql.connector.connect(
    host="localhost",
    user="user",
    passwd="password",
    database="myDatabase"
)

dbCursor = myDatabase.cursor()

# updates all customers which have an address of "Valley 345" to "Canyon 123"
dbCursor.execute("UPDATE customers SET address = 'Canyon 123' WHERE address = 'Valley 345'")

myDatabase.commit()

# prints the record(s) updated
print(dbCursor.rowcount, " record(s) affected")
