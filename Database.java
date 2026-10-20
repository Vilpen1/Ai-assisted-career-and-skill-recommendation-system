import java.sql.*;
/// I made this to test the connection on my laptop which is failing
/// try yours and see if it works

public class Database {
    private static String dbURL = "jdbc:postgresql://localhost:5432/postgres";
    private static String username = "kafka";
    private static String password = "kafka123";
    private static Connection db;


    /*public Database(String dbURL, String username, String password) {
        this.dbURL = dbURL;
        this.username = username;
        this.password = password;
    }

     */

    public void getConnected() {

        try {
            this.db = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connected to database successfully");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
        }
    }


}



