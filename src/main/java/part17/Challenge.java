package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        (no video for the challenge — it uses arrays, from part 10)
//
// SECTION D — Challenge. Two methods. The test in src/test/java/part17/ChallengeTest.java checks them.
// Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {

    // Add up the numbers in the array, but 13 does not count,
    // and neither does the number right after a 13.
    //   sumSkip13({1, 2, 3})      → 6
    //   sumSkip13({1, 13, 5, 2})  → 3     (13 and 5 are skipped)
    //   sumSkip13({})             → 0
    public static int sumSkip13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                if (i == 0 || nums[i - 1] != 13) {
                    sum = sum + nums[i];
                }
            }
        }

        return sum;
    }

    public static boolean hasPair(int[] nums, int value) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == value && nums[i + 1] == value) {
                return true;
            }
        }

        return false;
    }
}


