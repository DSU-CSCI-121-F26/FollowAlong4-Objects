package part17;

public class Car {
    // stores the brand of the car
    String make = "Ford";
    // stores the specific model of the car
    String model = "Mustang";
    // gives the car a default color of red
    String color = "red";
    // holds the year the car was made as a whole number
    int year = 2021;

    Car() {
    }

    Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String toString() {
        // combines all the car info and uses \n to put everything on separate lines
        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        // sends all the information back whenever the method is called
        return myString;
    }
}
