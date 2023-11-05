import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    private JFrame frame;
    private JTextField display;
    private double firstNumber = 0;
    private String operator = "";
    private boolean isNewCalculation = true;

    public SimpleCalculator() {
        frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        display = new JTextField();
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        frame.add(buttonPanel, BorderLayout.CENTER);

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            buttonPanel.add(button);
            button.addActionListener(new ButtonClickListener());
        }

        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.matches("[0-9]")) {
                if (isNewCalculation) {
                    display.setText(command);
                    isNewCalculation = false;
                } else {
                    display.setText(display.getText() + command);
                }
            } else if (command.equals("C")) {
                display.setText("");
                firstNumber = 0;
                operator = "";
                isNewCalculation = true;
            } else if (command.equals("=")) {
                double secondNumber = Double.parseDouble(display.getText());
                double result = performOperation(firstNumber, secondNumber, operator);
                display.setText(String.valueOf(result));
                firstNumber = result;
                operator = "";
                isNewCalculation = true;
            } else if (command.matches("[+\\-*/]")) {
                if (!operator.isEmpty()) {
                    double secondNumber = Double.parseDouble(display.getText());
                    firstNumber = performOperation(firstNumber, secondNumber, operator);
                    display.setText(String.valueOf(firstNumber));
                } else {
                    firstNumber = Double.parseDouble(display.getText());
                }
                operator = command;
                isNewCalculation = true;
            }
        }
    }

    private double performOperation(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN; // Handle division by zero
                }
            default:
                return num2;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCalculator());
    }
}
