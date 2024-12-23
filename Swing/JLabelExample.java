import javax.swing.*;

public class JLabelExample {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("JLabel Example");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Set layout to null for absolute positioning

        // Create a JLabel for text
        JLabel textLabel = new JLabel("Hello, Welcome to Swing!");
        textLabel.setBounds(50, 50, 300, 30); // Set position and size

        // Create a JLabel for an image
        ImageIcon icon = new ImageIcon("java.png"); // Replace with your image path
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setBounds(50, 100, 600, 400); // Set position and size

        // Add the labels to the frame
        frame.add(textLabel);
        frame.add(imageLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
