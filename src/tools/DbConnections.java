package tools;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnections {
    private Connection connection = null;


    public Connection getConnection(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_hr","root", "");

            if (connection != null){
                System.out.println("Koneksi DB berhasil..!"); 
            } else {
                System.out.println("Tidak dapat terhubung ke Database!");
            };
        } catch (Exception e) {
            System.out.println("Error + " + e.getMessage() );
        }
        return connection;
    }


    public void close() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }
}

