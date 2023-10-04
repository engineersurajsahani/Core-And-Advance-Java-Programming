// Superclass (Parent Class)
class Shape {
    // Method to calculate the area (to be overridden by subclasses)
    public double calculateArea() {
        return 0.0;
    }
}

// Subclass (Child Class) 1
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the calculateArea() method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass (Child Class) 2
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override the calculateArea() method
    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Create an array of shapes
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 3.0);
        shapes[2] = new Circle(3.0);

        // Calculate and display the areas of different shapes
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle Area: " + shape.calculateArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("Rectangle Area: " + shape.calculateArea());
            } else {
                System.out.println("Unknown Shape");
            }
        }
    }
}
