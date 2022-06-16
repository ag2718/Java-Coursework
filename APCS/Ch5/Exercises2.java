import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // E5.5
        String word = input.next();
        String firstPart = word.substring(0, word.length() / 2);
        String secondPart = word.substring((word.length() + 1) / 2);

        if (firstPart.equals(secondPart)) {
            System.out.println("First and second half same");
        } else {
            System.out.println("First and second half different");
        }

        System.out.println("");

        // E5.6
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All the same");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("All different");
        } else {
            System.out.println("Neither");
        }

        System.out.println("");

        // E5.7
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }

        System.out.println("");

        // E5.9
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 <= num2 && num2 <= num3 || num1 >= num2 && num2 >= num3) {
            System.out.println("In order");
        } else {
            System.out.println("Not in order");
        }

        System.out.println("");

        // E5.10
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        int num4 = input.nextInt();

        if (num1 == num2 && num3 == num4 || num1 == num3 && num2 == num4 || num1 == num4 && num2 == num3) {
            System.out.println("Two pairs");
        } else {
            System.out.println("Not two pairs");
        }

        input.close();
    }
}
