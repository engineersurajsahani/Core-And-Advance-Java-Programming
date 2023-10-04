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

// Subclass (Child Class) 1
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Call the superclass constructor
    }

    // Additional Method
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Subclass (Child Class) 2
class Cat extends Animal {
    // Constructor
    public Cat(String name) {
        super(name); // Call the superclass constructor
    }

    // Additional Method
    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog("Buddy");

        // Access methods from the superclass (Animal)
        System.out.println("Name of the dog: " + myDog.name);
        myDog.eat();

        // Call the subclass method
        myDog.bark();

        // Create a Cat object
        Cat myCat = new Cat("Whiskers");

        // Access methods from the superclass (Animal)
        System.out.println("\nName of the cat: " + myCat.name);
        myCat.eat();

        // Call the subclass method
        myCat.meow();
    }
}
