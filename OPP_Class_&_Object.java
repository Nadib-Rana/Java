// Class: A blueprint for creating objects. It defines a datatype by bundling data and methods that work on the data into one single unit.
public class Car {
    // Attributes
    String color;
    String model;

    // Method
    void display() {
        System.out.println("Color: " + color + ", Model: " + model);
    }
}

//Object create into the main class.
public class Main {
    public static void main(String[] args) {
        // Creating an object
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Tesla Model S";
        myCar.display(); // Output: Color: Red, Model: Tesla Model S
    }
}
