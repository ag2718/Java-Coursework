import java.util.Scanner;
import java.lang.Math;

public class WhileExercises {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // a
        int sum = 0;
        int i = 2;
        while (i <= 100) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum of even integers from 2 to 100 (inclusive): " + sum + "\n");

        // b
        sum = 0;
        i = 1;
        while (i <= 100) {
            sum += i * i;
            i++;
        }
        System.out.println("Sum of squares of integers between 1 and 100 (inclusive): " + sum + "\n");

        // c
        i = 0;
        System.out.println("Powers of two from 0 to 20:");
        while (i <= 20) {
            System.out.print(" " + Math.pow(2, i) + ",");
            i++;
        }
        System.out.println("\n");

        // d
        System.out.println("Enter two integers");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print("Sum of odd numbers between " + a + " and " + b);
        if (a % 2 == 0)
            a++;
        i = a;
        sum = 0;
        while (i <= b) {
            sum += i;
            i += 2;
        }
        System.out.println(": " + sum + "\n");

        // e
        System.out.println("Enter a number");
        String num = in.next();
        int digitSum = 0;
        i = 0;
        while (i < num.length()) {
            int currDigit = Character.getNumericValue(num.charAt(i));
            if (currDigit % 2 == 1)
                digitSum += currDigit;
            i++;
        }
        System.out.println("Sum of all odd digits in " + num + ": " + digitSum + "\n");

    }
}
