// Abstract class (Parent Class)
abstract class Shape {
    // Abstract method to calculate the area (to be implemented by subclasses)
    public abstract double calculateArea();
}

// Subclass (Child Class) 1
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the abstract method calculateArea() for Circle
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

    // Implement the abstract method calculateArea() for Rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Create an array of shapes
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 3.0);

        // Calculate and display the areas of different shapes
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}
