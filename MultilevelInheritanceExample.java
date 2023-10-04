// Superclass (Parent Class)
class Animal {
    // Field
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Intermediate Subclass
class Mammal extends Animal {
    // Constructor
    public Mammal(String name) {
        super(name); // Call the superclass constructor
    }

    // Additional Method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass (Child Class)
class Dog extends Mammal {
    // Constructor
    public Dog(String name) {
        super(name); // Call the intermediate class constructor
    }

    // Additional Method
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog("Buddy");

        // Access methods from the superclass (Animal)
        System.out.println("Name of the dog: " + myDog.name);
        myDog.eat();

        // Access methods from the intermediate class (Mammal)
        myDog.sleep();

        // Call the subclass method
        myDog.bark();
    }
}
