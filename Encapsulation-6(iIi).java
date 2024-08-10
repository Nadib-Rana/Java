// Definition: The process of wrapping code and data together into a single unit.
// Usage: Achieved by using private variables and providing public getter and setter methods.
public class Person {
    // Private variable
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Nadib Rana");
        System.out.println(person.getName()); // Output: Nadib Rana
    }
}
