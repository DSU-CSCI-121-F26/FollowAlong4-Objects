package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        starts at about 3:50:00 — stop at about 3:57:15, at "that's the basics of the static keyword"
// Guide: GUIDE.md in this folder, steps 1–9
//
// Part 19 — the static keyword
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StaticKeyword.
//    Leave the "package part19;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Friend. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Friend.java too.

public class StaticKeyword {
    public static void main(String[] args) {
        // prints 0 because no friends have been created yet
        System.out.println(Friend.numberOfFriends);
        // creates SpongeBob and brings the shared count to 1
        Friend friend1 = new Friend("SpongeBob");
        // prints the shared count which is now 1
        System.out.println(Friend.numberOfFriends);
        // creates Patrick and brings the shared count to 2
        Friend friend2 = new Friend("Patrick");
        // prints the shared count which is now 2
        System.out.println(Friend.numberOfFriends);
        // creates Squidward and brings the shared count to 3
        Friend friend3 = new Friend("Squidward");
        // prints the shared count which is now 3
        System.out.println(Friend.numberOfFriends);
        // calls the class method to show that there are 3 friends
        Friend.displayFriends();
        // creates Sandy and brings the shared count to 4
        Friend friend4 = new Friend("Sandy");
        // calls the same method again to show the updated total of 4
        Friend.displayFriends();
    }

}
