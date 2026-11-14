package part16;

public class Human {
    // stores the Human's information
    String name;
    int age;
    double weight;
    // Assigns the given values to the human
    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
    // Prints what the human is doing
    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking *burp*");
    }
}
