import mysql.connector

myDatabase = mysql.connector.connect(
    host="localhost",
    user="user",
    passwd="password",
    database="myDatabase"
)

dbCursor = myDatabase.cursor()

# create the MySQL query using prepared statements to prevent MySQL injections
query = "INSERT INTO customers (name, address) VALUES (%s, %s)"

# the values to insert into the %s prepared statements, in order
values = ("Pravat", "Stonecrest Dr.")

# execute the query with the values
dbCursor.execute(query, values)

# it is required to commit the MySQL database whenever updating it
myDatabase.commit()

# get the id of the last row that was inserted
print("1 record inserted, ID: ", dbCursor.lastrowid)

# create an array of multiple values to insert into the %s prepared statements, in order
values = [
    ('Peter', 'Lowstreet 4'),
    ('Amy', 'Apple st 652'),
    ('Hannah', 'Mountain 21'),
    ('Michael', 'Valley 345'),
    ('Sandy', 'Ocean blvd 2'),
    ('Betty', 'Green Grass 1'),
    ('Richard', 'Sky st 331'),
    ('Susan', 'One way 98'),
    ('Vicky', 'Yellow Garden 2'),
    ('Ben', 'Park Lane 38'),
    ('William', 'Central st 954'),
    ('Chuck', 'Main Road 989'),
    ('Viola', 'Sideway 1633')
]

# executemany (accepts an array) the query within the values
dbCursor.executemany(query, values)

# commit the changes to the database
myDatabase.commit()
