package part17;

public class Car {
    // Car information
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    // Combines the car information into one String
    public String myString() {
        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;
    }
}
