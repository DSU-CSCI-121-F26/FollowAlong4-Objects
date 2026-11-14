package part17;

public class Pizza {
    // Pizza ingredients
    String bread;
    String sauce;
    String cheese;
    String topping;
    // Sets all 4 ingredients
    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
    //sets 3 ingredients without a topping
    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    // sets 2 ingredients
    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }
    // pizza with just one ingredient
    Pizza(String bread) {
        this.bread = bread;
    }
    //pizza with nothing at all
    Pizza() {

    }
    @Override
    public String toString() {
        return "pizza with " + bread + ", " + sauce + ", " + cheese + " and " + topping;
    }
}
