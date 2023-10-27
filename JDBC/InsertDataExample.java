import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataExample {
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

            // SQL statement to insert data
            String insertSQL = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";

            // Create a prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);

            // Set values for the placeholders in the SQL statement
            preparedStatement.setString(1, "surajsahani");
            preparedStatement.setString(2, "surajsahani@gmail.com");
            preparedStatement.setString(3, "root");

            // Execute the SQL statement to insert the data
            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println(rowsAffected + " row(s) inserted successfully.");
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
