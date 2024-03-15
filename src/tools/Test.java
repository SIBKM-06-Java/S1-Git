package tools;

public class Test {
    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        System.out.println(dbConnection.getConnection());
    }
    
}
