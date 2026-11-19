package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13121s
//        starts at about 3:38:40 — stop at about 3:44:15, at "that's the basics of arrays of objects"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 18, topic 1 — an array of objects
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayOfObjects.
//    Leave the "package part18;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Food. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Food.java too.

public class ArrayOfObjects {
    public static void main(String[] args) {

        // makes three empty spots for food objects
        Food[] refrigerator = new Food[3];
        // creates a food object named pizza
        Food food1 = new Food("pizza");
        // creates a separate food object named hamburger
        Food food2 = new Food("hamburger");
        // creates another food object named hot dog
        Food food3 = new Food("hot dog");
        // puts the pizza in the first spot at index 0
        refrigerator[0] = food1;
        // puts the hamburger in the second spot
        refrigerator[1] = food2;
        // puts the hot dog in the third spot
        refrigerator[2] = food3;
        // gets the first food's name and prints pizza
        System.out.println(refrigerator[0].name);
        // gets the second food's name and prints hamburger
        System.out.println(refrigerator[1].name);
        // gets the third food's name and prints hot dog
        System.out.println(refrigerator[2].name);


    }
}
