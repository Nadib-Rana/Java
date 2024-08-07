// Definition: The ability of an object to take on many forms.
// Usage: Achieved by method overriding and method overloading.


public class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
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
    }
}
