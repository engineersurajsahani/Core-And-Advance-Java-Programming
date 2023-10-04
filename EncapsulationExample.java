class Person {
    // Private data fields (attributes)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public methods to access and modify the data (getters and setters)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Data validation can be performed here
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Data validation can be performed here
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age value.");
        }
    }

    // Public method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 30);

        // Access and display information using public methods
        person.displayInfo();

        // Modify data using public methods
        person.setName("Bob");
        person.setAge(25);

        // Access and display updated information
        person.displayInfo();
    }
}
