package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s
//        starts at about 2:59:30 — stop at about 3:09:48, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 15, video 2 — objects (object-oriented programming)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called ObjectOriented.
//    Leave the "package part15;" line and the "public class ObjectOriented" line alone.
//    He also makes a second class called Car. YOU make that file too:
//    right-click the part15 folder -> New -> Java Class -> type Car -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Car.java, saying in YOUR OWN WORDS what that line does.

public class ObjectOriented {
    public static void main(String[] args) {
       //these call object car
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        /* these lines outpint the models of car one
        and 2 both cars are corvettes so will out print Corvette twice
         */
        System.out.println(myCar1.model);
        System.out.println(myCar2.model);

        myCar1.drive();// calls the drive method that belongs to car 1
        myCar1.brake();// runs the brake method that belongs to car 1
        System.out.println(myCar2.Make); // this out prints the Make of Car 2 being Chevrolete
    }

    public static class Car {// here this class defines the object Car
        // here are the attributes of object car
        String Make = "Chevrolete";
        String model = "Corvette";
        String year = "2023";
        String color = "blue";
        String price = "50000.00";

        void drive() {
            System.out.println("You drive the car");
        }

        void brake() {
            System.out.println("You step on the brakes");
        }
    }
}


