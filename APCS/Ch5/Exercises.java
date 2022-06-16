import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // E5.1
        System.out.print("Enter the integer: ");
        int inputInteger = input.nextInt();
        if (inputInteger > 0) {
            System.out.println("positive");
        } else if (inputInteger < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        System.out.println("");

        // E5.2
        System.out.print("Enter the double: ");
        double inputDouble = input.nextDouble();
        if (inputDouble == 0) {
            System.out.println("zero");
        } else {

            if (inputDouble > 0) {
                System.out.println("positive");
            } else {
                System.out.println("negative");
            }

            if (Math.abs(inputDouble) < 1) {
                System.out.println("small");
            } else if (Math.abs(inputDouble) > 1000000) {
                System.out.println("large");
            }
        }

        System.out.println("");

        // E5.3
        System.out.print("Enter the string: ");
        String inputStr = input.next();
        if (inputStr.charAt(0) == inputStr.charAt(inputStr.length() - 1)) {
            System.out.println("first and last letter same");
        } else {
            System.out.println("first and last letter different");
        }

    }
}
