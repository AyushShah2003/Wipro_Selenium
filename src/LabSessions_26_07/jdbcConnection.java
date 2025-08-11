package LabSessions_26_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class jdbcConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/wiprodb2607"; 
        String username = "root"; 
        String password = "mayank@12910";
        
        // Step 1: Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish connection to the database
        Connection con = DriverManager.getConnection(dbURL, username, password);
        
        // Step 3: Create a Statement object to send SQL queries
        Statement st = con.createStatement();
        
        // Step 4: Execute the query and store the result in ResultSet
        String query = "SELECT * FROM Employees;";
        ResultSet rs = st.executeQuery(query);
        
        // we can also use for loop but by use of metadata
        /*
        ResultSetMetaData mt = rs.getMetaData();
        int colomncount = mt.getColumnCount();
        while(rs.next()) {
        	for(int i=1;i<=colomncount;i++) {
        		System.out.println("Name :"+rs.getString(i));
        	}
        }
        */
        // Iterate through the result set and display data
        while (rs.next()) {
            // Assuming Employee table has id, name, and position columns
            int id = rs.getInt("EmployeeID");
            String firstname = rs.getString("FirstName");
            String lastname = rs.getString("LastName");
            String s = rs.getString(1); //coloumn number
            System.out.println(s);
            // Print the retrieved data
            System.out.println("ID: " + id + ", Name: " + firstname+" "+lastname);
        }
        con.close();
        st.close();
        rs.close();
 
        
	}

}