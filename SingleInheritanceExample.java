// Superclass (Parent Class)
class Animal {
    // Field
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Getter
    public String getName() {
        return name;
    }
}

// Subclass (Child Class)
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Call the superclass constructor
    }

    // Additional Method
    public void bark() {
        System.out.println(getName() + " is barking.");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog("Buddy");

        // Access methods from the superclass
        System.out.println("Name of the dog: " + dog.getName());
        dog.eat();

        // Call the subclass method
        dog.bark();
    }
}
