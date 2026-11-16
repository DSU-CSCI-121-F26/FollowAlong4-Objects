package part15;

public class Car {
    // gives each new car this starting brand
    String make = "Mercedes-Benz";
    // gives each new car this starting model
    String model = "AMG CLS 53";
    // stores the car's year as a whole number
    int year = 2023;
    // gives each new car this starting color
    String color = "matte black";
    // stores the car's price and allows decimals
    double price = 40000.00;
    // sets up a driving action that returns no value
    void drive() {
        // shows a driving message when this method is called
        System.out.println("You drive the car");
    }
    // sets up a braking action that returns no value
    void brake() {
        // shows a braking message when this method is called
        System.out.println("You step on the brakes");
    }
}

