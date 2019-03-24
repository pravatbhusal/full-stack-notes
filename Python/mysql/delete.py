import mysql.connector

myDatabase = mysql.connector.connect(
    host="localhost",
    user="user",
    passwd="password",
    database="myDatabase"
)

dbCursor = myDatabase.cursor()

# deletes all customers where the address is equal to "Stonecrest Dr."
dbCursor.execute("DELETE FROM customers WHERE address = 'Stonecrest Dr.'")

myDatabase.commit()

# prints the record(s) deleted
print(dbCursor.rowcount, " record(s) deleted")
