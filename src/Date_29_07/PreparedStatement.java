package Date_29_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatement {

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
        String query1 = "SELECT * FROM Employees where FirstName = ?;";  // select query
        String query2 = "INSERT INTO Employees(EmployeeID, FirstName, LastName, Department, Location) VALUES(?,?,?,?,?)"; //insert query
        String query3 = "Select * from employees where FirstName = 'Mayank';"; //select
        
        java.sql.PreparedStatement pst = con.prepareStatement(query2);
        pst.setInt(1,120);
        pst.setString(2,"Mayank");
        pst.setString(3, "Dahiya");
        pst.setString(4, "CSE");
        pst.setString(5, "Haryana");
        ResultSet rs = st.executeQuery(query3);
        int rowsAffected = pst.executeUpdate();
        System.out.println(rowsAffected);
        while(rs.next()) {
        	System.out.println("Id :"+rs.getString(1)+" Name :"+rs.getString(2)+" "+rs.getString(3) +" Department :"+rs.getString(4)+" Location :"+rs.getString(5));
        }
	}

}