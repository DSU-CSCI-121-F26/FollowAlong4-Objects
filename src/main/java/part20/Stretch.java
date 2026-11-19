package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// No video in this part — it is a checkpoint.
// Look back at: part 18 (passing objects), part 17 (toString), part 02 (int vs double).
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 and B3 also change your Receiver class.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {

        Quarterback carter = new Quarterback("Carter", 40);
        Receiver davis = new Receiver("Davis", 11);
        Receiver slot = davis;
        carter.throwTo(davis, 15);
        carter.throwTo(slot, 10);
        System.out.println(davis);

        /*
        its gonna say carter passes to davis for 15 yards and say caught
        then its gonna say the same thing again but for 10 yards and say caught
        then last its gonna print out davis stats 2 for 25
         */

        int completions = 2;
        int attempts = 3;
        System.out.println(completions / attempts * 100);
        System.out.println(completions * 100 / attempts);
        System.out.println(completions * 100.0 / attempts);

        System.out.println(davis.yardsPerCatch());
        Receiver rookie = new Receiver("Lee", 3);
        System.out.println(rookie.yardsPerCatch());

        Receiver brooks = new Receiver("Brooks", 84);
        brooks.catchBall(25);
        System.out.println(brooks);
        brooks.catchBall(5);
        System.out.println(brooks);

    }

}
