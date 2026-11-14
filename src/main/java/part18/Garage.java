package part18;

public class Garage {
    void park(Car car) {
        System.out.println("The " + car.name + " is parked in the garage"); // prints out parked car
    }
    void leave(Car car){
        System.out.println("The " + car.name + " left the garage");

    }
}
