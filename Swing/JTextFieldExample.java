import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldExample {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("JTextField Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Set layout to null for absolute positioning

        // Create a JLabel for instructions
        JLabel label = new JLabel("Enter your name:");
        label.setBounds(50, 50, 150, 30);

        // Create a JTextField for user input
        JTextField textField = new JTextField();
        textField.setBounds(200, 50, 150, 30);

        // Create a JButton to handle input
        JButton button = new JButton("Submit");
        button.setBounds(150, 100, 100, 30);

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get text from the JTextField
                String name = textField.getText();
                
                // Display a message dialog
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
