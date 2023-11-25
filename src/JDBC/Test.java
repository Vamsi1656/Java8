package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		//Load the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish the connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		// Create statement:For DDL commands
		// Prepared statement: For remaining commands
		
		Statement st=con.createStatement();
		String s="create table Studentsection(id int,name varchar(32))";
		
		// Execute the statement
		
		st.executeUpdate(s);
		
		System.out.println("Table created");
		
		con.close();
		
	
	}

}
