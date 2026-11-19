package part17;

public class Pizza {
    // holds whatever type of bread is chosen
    String bread;
    // holds the sauce chosen for the pizza
    String sauce;
    // stores the type of cheese being used
    String cheese;
    // holds whatever topping gets added
    String topping;
    // runs when all four ingredients are given to make a pizza
    Pizza(String bread, String sauce, String cheese, String topping) {
        // saves the bread that was passed in to this specific pizza
        this.bread = bread;
        // saves the sauce so each pizza can have its own
        this.sauce = sauce;
        // keeps track of the cheese chosen for this pizza
        this.cheese = cheese;
        // saves whatever topping was passed in
        this.topping = topping;


        }
    // runs when we only give the pizza bread and sauce so the other ingredients stay null
    Pizza(String bread, String sauce) {
        // saves the bread for this pizza
        this.bread = bread;
        // saves the sauce without needing any other ingredients
        this.sauce = sauce;

    }
}

