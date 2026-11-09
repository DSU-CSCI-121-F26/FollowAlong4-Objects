package part17;

public class Car {
    // Car information
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    Car(){

    }
    Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

        // Combines the car information into one String
        @Override
        public String toString () {
            String myString = make + "\n" + model + "\n" + color + "\n" + year;
            return myString;

        }
    }
