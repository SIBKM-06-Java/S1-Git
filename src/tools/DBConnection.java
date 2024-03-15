package tools;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private Connection connection;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sibkm_jdbc_06", 
                "root", 
                "");
        } catch (Exception e) {
            System.out.println("Error connection= " + e.getMessage());
        }
        return connection;
    }
}