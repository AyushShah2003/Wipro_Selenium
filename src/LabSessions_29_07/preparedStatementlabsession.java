package LabSessions_29_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class preparedStatementlabsession {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/wiprodb2607"; 
        String username = "root"; 
        String password = "mayank@12910";
        // imp things connecting to jdbc
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dbURL, username, password);
        Statement st = con.createStatement();
        
        // Queries 
        String query1 = "INSERT INTO Employees(EmployeeID, FirstName, LastName, Department, Location) VALUES(121, 'Alice','Jam' ,'HR', 'US'),"
        		+ " (125, 'Bob', 'John', 'IT', 'UK'), (128, 'Charlie', 'Rayes', 'HR', 'Berlin');";  // Insert Values
        String query2 = "Select * from Employees";
        String query3 = "Select * from Employees where EmployeeID = 125;";
        String query4 = "Select * from Employees where Department = 'HR';";
//        int rowsAffected = st.executeUpdate(query1);
        ResultSet rs = st.executeQuery(query3);
//        System.out.println(rowsAffected);
        while(rs.next()) {
        	System.out.println("Id :"+rs.getString(1)+" Name :"+rs.getString(2)+" "+rs.getString(3) +" Department :"+rs.getString(4)+" Location :"+rs.getString(5));
        }
	}

}
