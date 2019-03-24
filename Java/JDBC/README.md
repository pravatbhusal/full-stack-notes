# JDBC (Java Database Connection)
This folder is a reference to connecting to a database using JDBC, particularly with MySQL.

# MySQL DB Installation and Setup
- Install the MySQL Community here: https://dev.mysql.com/downloads/mysql/
- The MySQL Community product also downloads MySQL workbench, a GUI application to manage MySQL databases
- For this reference, you need to create a MySQL user of "student" with password "student" under localhost
- Select "database.sql" file onto MySQL workbench (File -> Open SQL script) to initiate the schema (database) for this reference

# JDBC Library Setup
- Download the JDBC Driver here: https://dev.mysql.com/downloads/connector/j/
- Create a "lib" folder in your Java Project
- Place the JDBC .zip file into your Project's lib folder, then extract the JDBC .zip file
- On the Eclipse IDE, right click your Java Project, then click Properties, then click Java Build Path, then click Libraries, then click "Add External Jars" and select the .jar file inside the jdbc extracted folder
- "Apply and Close" the Java Build Path

# MySQL Workbench Database Dump (Backup)
- On MySQL Workbench, click the "Server" tab, then click the "Data Export" tab
- Choose the Schema you wish to export, the tables, and whether you want to export stored procedures, events, and triggers
- "Start Export" onto a selected directory to backup the database as a .sql file

# Not Covered in This JDBC Reference, but Helpful to Know
- Stored Procedures: A prepared SQL code that you can save, so the code can be reused over and over again.
- BLOB: Alarge object data type in the database system (such as a file)
- CLOB: Stores large variable-length character data in the database character set that can be single-byte or multibyte