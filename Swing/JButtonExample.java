import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonExample {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("JButton Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Set layout to null for absolute positioning

        // Create a JButton
        JButton button = new JButton("Click Me!");
        button.setBounds(100, 100, 200, 50); // Set position and size

        // Add ActionListener to handle button click
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
