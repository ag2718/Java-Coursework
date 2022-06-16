import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] counts = new int[51];

        while (in.hasNextInt()) {
            int val = in.nextInt();
            if (val >= 0 && val <= 50) {
                counts[val]++;
            } else {
                System.out.println("Not valid input, must be an integer between 0 and 50, inclusive.");
            }
        }

        System.out.println("Values that were entered multiple times:");
        for (int i = 0; i <= 50; i++) {
            if (counts[i] > 1) {
                System.out.println(i + " was entered " + counts[i] + " times");
            }
        }

    }

}
