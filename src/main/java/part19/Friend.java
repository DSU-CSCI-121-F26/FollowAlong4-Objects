package part19;

public class Friend {
    // gives each friend their own place to store a name
    String name;
    // keeps one shared count for the whole class starting at 0
    static int numberOfFriends;
    // takes in a name whenever a new friend is created
    Friend(String name) {
        // saves the given name in this friend's name field
        this.name = name;
        // adds 1 to the shared count for the new friend
        numberOfFriends++;
    }
    // lets us show the shared total without needing a specific friend object
    static void displayFriends() {
        // prints a message with the current shared friend count
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
