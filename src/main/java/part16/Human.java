package part16;

public class Human {
    // gives each human their own name so the methods can use it later
    String name;
    // holds this human's age in whole years
    int age;
    // uses a double so this human's weight can have a decimal
    double weight;

    public Human(String name, int age, double weight) {
        // keeps the name you passed in on this human so we can use it later
        this.name = name;
        // saves the age on this human so each one can have a different age
        this.age = age;
        // saves the weight on this human so it stays with the right person
        this.weight = weight;
    }
    // lets any human print an eating message when you call this method
    void eat() {
        // grabs this human's name so you can tell who's eating
        System.out.println(this.name + " is eating");
    }
    // lets any human print a drinking message when you call this method
    void drink() {
        // adds the burp to the message and uses this human's name to show who did it
        System.out.println(this.name + " is drinking *burp*");
    }
}
