public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Division by zero will throw an ArithmeticException
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: Division by zero is not allowed.");
        } finally {
            System.out.println("This block always gets executed.");
        }

        System.out.println("Program continues after exception handling.");
    }

    // A method that can throw an exception
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
