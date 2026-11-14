package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12528s
//        rewatch from about 3:28:50 if you forget how overloaded constructors work,
//        and from about 3:35:20 for toString
// Guide: GUIDE.md in this folder, steps 4–12
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 and B3 also change your Pizza and Car classes.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        Pizza a = new Pizza("flatbread", "pesto");
        Pizza b = new Pizza("thin crust", "tomato", "cheddar", "olives");
        Pizza c = new Pizza();
        System.out.println(a.cheese);
        System.out.println(b.topping);
        System.out.println(c.bread);
        Car car = new Car();
        System.out.println(car);
        /*
        null
        olives
        null
        car identity
         */
        String make = "Honda";
        String model = "Civic";
        int year = 2019;
        String description = year + " " + make + " " + model;
        System.out.println(description);
        Pizza mine = new Pizza("thin crust", "tomato", "cheddar", "olives");
        System.out.println(mine);
        Car other = new Car("Toyota", "Corolla", "blue", 2018);
        System.out.println(other);
    }
}


