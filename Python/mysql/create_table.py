import mysql.connector

myDatabase = mysql.connector.connect(
    host="localhost",
    user="user",
    passwd="password",
    database="myDatabase"
)

dbCursor = mydb.cursor()

# creating a table named "customers" with "name" and "address" columns as type VARCHAR(255)
dbCursor.execute("CREATE TABLE customers (name VARCHAR(255), address VARCHAR(255))")

# altering a table named "customers" by adding column "id" INT AUTOINCREMENT as a PRIMARY KEY
mycursor.execute("ALTER TABLE customers ADD COLUMN id INT AUTO_INCREMENT PRIMARY KEY")
