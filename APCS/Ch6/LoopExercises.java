import java.util.Scanner;
import java.lang.Math;

public class LoopExercises {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter any number of integers, and enter a character or string to stop.");

        int input = in.nextInt();

        int max = input, min = input;

        int even = 0, odd = 0;

        int sum = 0;
        String cumulativeStr = "";

        int val;
        int curr = input;
        boolean repeated = false;
        String duplicateStr = "";

        while (in.hasNextInt()) {

            input = in.nextInt();

            // a
            max = Math.max(max, input);
            min = Math.min(min, input);

            // b
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            // c
            sum += input;
            cumulativeStr += sum + ", ";

            // d
            val = input;
            if (curr == val) {
                repeated = true;
            } else {
                if (repeated)
                    duplicateStr += curr + ", ";
                repeated = false;
                curr = val;
            }

        }

        // a
        System.out.println("\nSmallest: " + min + "\nLargest: " + max + "\n");

        // b
        System.out.println("Even: " + even + "\n" + "Odd: " + odd + "\n");

        // c
        System.out.println("Cumulative sums: " + cumulativeStr.substring(0, cumulativeStr.length() - 2) + "\n");

        // d
        System.out.println("Adjacent duplicates: " + duplicateStr.substring(0, duplicateStr.length() - 2) + "\n");

        in.close();
    }
}
