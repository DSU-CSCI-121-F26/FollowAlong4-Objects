package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Receiver needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Receiver { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).
public class Receiver {

    // stores the receiver's name where other classes can't change it directly
    private String name;
    // stores the receiver's jersey number
    private int number;
    // tracks catches and starts at 0
    private int catches;
    // tracks receiving yards and starts at 0
    private int yards;

    // takes in the name and jersey number for a new receiver
    public Receiver(String name, int number) {
        // saves the given name in this receiver
        this.name = name;
        // saves the given jersey number in this receiver
        this.number = number;
    }
    // lets other classes ask for the receiver's name
    public String getName() {
        // gives back this receiver's name
        return name;
    }
    // lets other classes ask for the jersey number
    public int getNumber() {
        // gives back this receiver's jersey number
        return number;
    }
    // lets other classes check the catch total
    public int getCatches() {
        // gives back how many catches this receiver has
        return catches;
    }
    // lets other classes check the receiving yards
    public int getYards() {
        // gives back this receiver's total yards
        return yards;
    }
    // updates the receiver's stats after a catch
    public void catchBall(int gain) {
        // counts one more catch
        catches++;
        // adds the yards gained on this catch
        yards += gain;
    }
    // controls how the receiver looks when printed.
    public String toString() {
        // puts the jersey number, name, catches and yards in the required format
        return "#" + number + " " + name + ": " + catches + " catches, " + yards + " yards";
    }
}