import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabaseExample {
    public static void main(String[] args) {
        // JDBC database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/"; // Change this URL to match your database system
        String username = "your_username";
        String password = "your_password";
        
        // Database name you want to create
        String dbName = "mydatabase";

        // JDBC connection object
        Connection connection = null;
        
        try {
            // Register the JDBC driver (This step may not be required depending on your JDBC driver)
            Class.forName("com.mysql.cj.jdbc.Driver"); // Change this to match your database driver

            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // SQL statement to create the database
            String createDBSQL = "CREATE DATABASE " + dbName;

            // Execute the SQL statement to create the database
            statement.executeUpdate(createDBSQL);
            
            System.out.println("Database '" + dbName + "' created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the connection in a finally block to ensure it's always closed
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
