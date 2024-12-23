import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegistrationForm {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Computer Class Registration Form");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create Labels and TextFields
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 100, 100, 30);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 100, 200, 30);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(50, 150, 100, 30);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 150, 200, 30);

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(50, 200, 100, 30);
        JTextField courseField = new JTextField();
        courseField.setBounds(150, 200, 200, 30);

        // Create Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 250, 100, 30);

        // Add ActionListener to the Button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String course = courseField.getText();

                // Save to MySQL database
                try {
                    // Database connection
                    Connection connection = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/computer_classes", // Replace with your database URL
                            "root", // Replace with your database username
                            "root" // Replace with your database password
                    );

                    // Insert query
                    String query = "INSERT INTO students (name, email, phone, course) VALUES (?, ?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, name);
                    preparedStatement.setString(2, email);
                    preparedStatement.setString(3, phone);
                    preparedStatement.setString(4, course);

                    // Execute query
                    int rowsInserted = preparedStatement.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(frame, "Registration Successful!");
                    }

                    // Close connection
                    preparedStatement.close();
                    connection.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
                }
            }
        });

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(courseLabel);
        frame.add(courseField);
        frame.add(submitButton);

        // Make the frame visible
        frame.setVisible(true);
    }
}
