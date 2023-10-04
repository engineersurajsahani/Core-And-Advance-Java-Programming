public class Calculator {
    // Method to add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to add three integers
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Method to add two double numbers
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to multiply two integers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to multiply three integers
    public int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    // Method to multiply two double numbers
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Method overloading - adding integers
        int sum1 = calculator.add(5, 10);
        int sum2 = calculator.add(5, 10, 15);

        // Method overloading - adding doubles
        double sum3 = calculator.add(3.5, 2.5);

        // Method overloading - multiplying integers
        int product1 = calculator.multiply(2, 3);
        int product2 = calculator.multiply(2, 3, 4);

        // Method overloading - multiplying doubles
        double product3 = calculator.multiply(2.5, 1.5);

        // Display results
        System.out.println("Sum of two integers: " + sum1);
        System.out.println("Sum of three integers: " + sum2);
        System.out.println("Sum of two double numbers: " + sum3);
        System.out.println("Product of two integers: " + product1);
        System.out.println("Product of three integers: " + product2);
        System.out.println("Product of two double numbers: " + product3);
    }
}
