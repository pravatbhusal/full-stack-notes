import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ConnectionManager {
	
	public static Connection myConn;
	public static Statement myStmt;

	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		// load the database credentials properties from the demo.properties file
		Properties dbProps = new Properties();
		dbProps.load(new FileInputStream("demo.properties"));
		String dbURL = dbProps.getProperty("dbURL");
		String user = dbProps.getProperty("user");
		String pass = dbProps.getProperty("pass");
		
		// establish a connection to the MySQL database
		myConn = DriverManager.getConnection(dbURL, user, pass);
		
		// create a connection statement to execute queries
		myStmt = myConn.createStatement();
		
		// various methods to demonstrate JDBC
		insertTeacher();
		preparedStatementInsertTeacher();
		updateTeacher();
		deleteTeacher();
		selectAllTeachers();
	}
	
	public static void insertTeacher() throws SQLException {
		// execute a INSERT query (used for INSERT, UPDATE, and DELETE) to insert Harry Koel into the "teachers" table
		int rowsAffected = myStmt.executeUpdate("INSERT INTO teachers (first_name, last_name) VALUES ('Harry', 'Koel')");
		System.out.println("Inserted a new teacher named Harry Koel");
	}
	
	public static void preparedStatementInsertTeacher() throws SQLException {
		// prepared statements prevent SQL injections since it pre-compiles the SQL queries and uses place-holders as question marks (?)
		// below is a prepared statement example of the insertTeacher() method, but it can be used in any case scenario
		PreparedStatement pMyStmt = myConn.prepareStatement("INSERT INTO teachers (first_name, last_name) VALUES (?, ?)");
		pMyStmt.setString(1, "Harry");
		pMyStmt.setString(2, "Koel");
		int rowsAffected = pMyStmt.executeUpdate();
		System.out.println("Inserted a new teacher named Harry Koel using Prepared Statements");
	}
	
	public static void updateTeacher() throws SQLException {
		// execute an UPDATE query to update the row with id of 3 and first_name of Harry in the "teachers" table
		int rowsAffected = myStmt.executeUpdate("UPDATE teachers SET first_name='Ben' WHERE id=3 AND first_name='Harry'");
		System.out.println("Updated teacher of Harry within id 3 with the first name of Ben");
	}
	
	public static void deleteTeacher() throws SQLException {
		// execute a DELETE query to delete the row with the id of 3 in the "teachers" table
		int rowsAffected = myStmt.executeUpdate("DELETE from teachers WHERE id=7");
		System.out.println("Deleted the teacher with an id of 3");
	}
	
	public static void selectAllTeachers() throws SQLException {
		// execute a SELECT query to get all teachers in the "teachers" table
		ResultSet myRs = myStmt.executeQuery("SELECT * FROM teachers");
		
		// get the data from each row from the query
		while (myRs.next()) {
			int id = myRs.getInt("id");
			String firstName = myRs.getString("first_name");
			String lastName = myRs.getString("last_name");
			System.out.println(id + ". " + firstName + " " + lastName);
		}
	}
}
