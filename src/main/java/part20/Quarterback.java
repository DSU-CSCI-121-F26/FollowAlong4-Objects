package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Quarterback needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Quarterback { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).
public class Quarterback {
    // stores the quarterback's name
    private String name;
    // stores the longest pass this quarterback can throw
    private int armStrength;
    // tracks every pass attempt and starts at 0
    private int attempts;
    // tracks caught passes and starts at 0
    private int completions;
    // tracks yards from caught passes and starts at 0
    private int passingYards;

    // takes in the name and throwing range for a new quarterback
    public Quarterback(String name, int armStrength) {
        // saves the given name in this quarterback
        this.name = name;
        // saves how far this quarterback can throw
        this.armStrength = armStrength;
    }

    // lets other classes ask for the quarterback's name
    public String getName() {
        // gives back this quarterback's name
        return name;
    }

    // lets other classes check the number of throws
    public int getAttempts() {
        // gives back the total pass attempts
        return attempts;
    }

    // lets other classes check the number of caught passes
    public int getCompletions() {
        // gives back the total completions
        return completions;
    }

    // lets other classes check the passing yards
    public int getPassingYards() {
        // gives back the total yards from completed passes
        return passingYards;
    }

    // tries a pass to the given receiver for the given yards
    public boolean throwTo(Receiver target, int yards) {
        // counts the throw even if it isn't caught
        attempts++;
        // checks whether the pass is beyond this quarterback's range
        if (yards > armStrength) {
            // prints who the pass was for and that it was incomplete
            System.out.println(name + " -> " + target.getName() + ", " + yards + " yards: INCOMPLETE");
            // reports that the pass wasn't caught and ends this attempt
            return false;
        }

        // counts the caught pass as a completion
        completions++;
        // adds this pass to the quarterback's passing yards
        passingYards += yards;
        // tells the receiver to update their own catches and yards
        target.catchBall(yards);
        // prints who caught the pass and how far it went
        System.out.println(name + " -> " + target.getName() + ", " + yards + " yards: CAUGHT");
        // reports that the pass was caught
        return true;
    }

    // figures out the completion percentage as a whole number
    public int completionPercentage() {
        // checks for no throws so we don't divide by 0
        if (attempts == 0) {
            // gives back 0 when no passes have been attempted
            return 0;
        }
        // multiplies first so integer division doesn't erase the percentage
        return completions * 100 / attempts;
    }

    // controls how the quarterback's stats look when printed
    public String toString() {
        // combines the name, completions, attempts, yards and percentage
        return name + ": " + completions + "/" + attempts + ", " + passingYards + " yards, " + completionPercentage() + "%";
    }

    // gives us another way to throw without picking the yards.
    public boolean throwTo(Receiver target) {
        // uses the original method for a 10-yard pass and returns its result
        return throwTo(target, 10);
    }
}
