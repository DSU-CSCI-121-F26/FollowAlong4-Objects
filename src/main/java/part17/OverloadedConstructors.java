package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12340s
//        starts at about 3:25:40 — stop at about 3:32:05, before "the toString method"
// Guide: GUIDE.md in this folder, steps 1–7
//
// Part 17, topic 1 — overloaded constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedConstructors.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Pizza. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Pizza.java too.

public class OverloadedConstructors {
    public static void main(String[] args) {
        // makes a new pizza and passes in all four ingredients
        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
        // lets us know what information is about to be printed
        System.out.println("Here are the ingredients of your pizza: ");
        // shows what type of bread the pizza was made with
        System.out.println(pizza.bread);
        // shows what sauce was chosen for the pizza
        System.out.println(pizza.sauce);
        // displays the cheese saved to this pizza
        System.out.println(pizza.cheese);
        // displays whatever topping was added to the pizza
        System.out.println(pizza.topping);



    }

}
