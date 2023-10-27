import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {
    public static void main(String[] args) {
        // JDBC database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/mydatabase?useSSL=false"; // Replace with your database name
        String username = "root";
        String password = "Sayali@123";

        // JDBC connection object
        Connection connection = null;

        try {
            // Establish the database connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // SQL statement to create a table
            String createTableSQL = "CREATE TABLE users ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "username VARCHAR(255) NOT NULL,"
                    + "email VARCHAR(255) NOT NULL,"
                    + "password VARCHAR(255) NOT NULL)";

            // Execute the SQL statement to create the table
            statement.executeUpdate(createTableSQL);

            System.out.println("Table 'users' created successfully.");
        } catch (SQLException e) {
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
