package part18;

public class Garage {
    // takes in a car to use in the parking message
    void park(Car car) {
        // uses the given car's name to print that it's parked
        System.out.println("The " + car.name + " is parked in the garage");
    }
}
