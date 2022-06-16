package Basics;

import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number of integers you wish to input");
        int count = scanner.nextInt();

        int[] userInput = readIntegers(count);
        int minInput = findMin(userInput);
        System.out.println(minInput);

    }

    public static int[] readIntegers(int count) {
        int[] result = new int[count];
        System.out.println("Enter " + count + " integer values.");
        for (int i = 0; i < result.length; i++) {
            result[i] = scanner.nextInt();
        }

        return result;
    }

    public static int findMin(int[] array) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }


}
