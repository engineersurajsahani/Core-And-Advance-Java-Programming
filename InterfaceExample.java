// Interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Class implementing the Shape interface (Circle)
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the calculateArea() method for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implement the calculatePerimeter() method for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Class implementing the Shape interface (Rectangle)
class Rectangle implements Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implement the calculateArea() method for Rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }

    // Implement the calculatePerimeter() method for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Create objects of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 3.0);

        // Calculate and display area and perimeter for both shapes
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
