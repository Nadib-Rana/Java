// Definition: The concept of hiding the complex implementation details and showing only the necessary features of an object.
// Usage: Achieved using abstract classes and interfaces


// Example of Abstract Class:
abstract class Animal {
    // Abstract method
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("This animal sleeps");
    }
}

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Dog barks
        myDog.sleep(); // Output: This animal sleeps
    }
}



// Example of Interface:
interface Animal {
    void makeSound();
}

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Dog barks
    }
}
