package Date_26_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConnection {
    public jdbcConnection() {
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String dbURL = "jdbc:mysql://localhost:3306/wiprodb2607";
        String username = "root";
        String password = "mayank@12910";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dbURL, username, password);
        Statement st = con.createStatement();
        String query = "SELECT * FROM Employees;";
        ResultSet rs = st.executeQuery(query);

        while(rs.next()) {
            int id = rs.getInt("EmployeeID");
            String firstname = rs.getString("FirstName");
            String lastname = rs.getString("LastName");
            String s = rs.getString(1);
            System.out.println(s);
            System.out.println("ID: " + id + ", Name: " + firstname + " " + lastname);
        }

        con.close();
        st.close();
        rs.close();
    }
}