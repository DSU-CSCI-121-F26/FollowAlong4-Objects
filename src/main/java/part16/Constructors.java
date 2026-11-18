package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        starts at about 3:10:07 — stop at about 3:19:32, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 16, video 1 — constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called Constructors.
//    Leave the "package part16;" line and the "public class Constructors" line alone.
//    He also has a second class called Human. YOU make that file too:
//    right-click the part16 folder -> New -> Java Class -> type Human -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Human.java, saying in YOUR OWN WORDS what that line does.

public class Constructors {
    public static void main(String[] args) {
        // makes rick with his own info and saves him as human1 so we can use him later
        Human human1 = new Human("Rick", 65, 70);
        // makes morty as a separate human so he can have his own name, age, and weight
        Human human2 = new Human("Morty", 16, 50);
        // prints the first human's name to check that rick got saved
        System.out.println(human1.name);
        // prints the second human's name to check that morty has his own name
        System.out.println(human2.name);
        // calls eat on human1 so the message uses Rick's name
        human1.eat();
        // calls drink on human2 so the message uses morty's name
        human2.drink();

    }

}
