import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadDataExample {
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

            // SQL statement to retrieve data
            String selectSQL = "SELECT username, email FROM users WHERE id = ?";

            // Create a prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);

            // Set the parameter value for the placeholder in the SQL statement
            preparedStatement.setInt(1, 1); // Assuming you want to retrieve data for the user with ID 1

            // Execute the SQL statement and retrieve the result set
            ResultSet resultSet = preparedStatement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                String usernameValue = resultSet.getString("username");
                String emailValue = resultSet.getString("email");

                System.out.println("Username: " + usernameValue);
                System.out.println("Email: " + emailValue);
            }
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
