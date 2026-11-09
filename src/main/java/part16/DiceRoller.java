package part16;

import java.util.Random;



    public class DiceRoller {
        // functions as what our dies are referring to
        Random random;
        int number;
        // creates the random generator that rolls the die
        DiceRoller() {
            random = new Random();
            roll();
        }
        // Generates a number from 1 to 6 and prints it
        void roll(){
            number = random.nextInt(6) + 1;
            System.out.println(number);
        }

    }

