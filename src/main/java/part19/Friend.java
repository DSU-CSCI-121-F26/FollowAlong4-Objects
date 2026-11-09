package part19;

public class Friend {
    String name;
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;// Counts each new friend
    }
    static void displayFriends() {
        // Displays the total number of friends
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
