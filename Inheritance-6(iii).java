// Definition: The mechanism in Java by which one class is allowed to inherit the features (fields and methods) of another class.
// Usage: Achieved by using the extends keyword.

// Base class
public class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
public class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Output: This animal eats food.
        dog.bark(); // Output: The dog barks. 
    }
}

