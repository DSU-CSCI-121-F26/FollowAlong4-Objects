package part19;

public class Friend {
    String name;
    static int numberOfFriends;
    static String newestFriend;
    Friend(String name) {
        this.name = name;
        numberOfFriends++;// Counts each new friend
        newestFriend = name;
    }
    static void displayFriends() {
        // Displays the total number of friends
        System.out.println("You have " + numberOfFriends + " friends");
    }

}
