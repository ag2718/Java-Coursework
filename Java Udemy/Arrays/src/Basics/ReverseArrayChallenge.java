package Basics;

import java.util.Arrays;

import static java.lang.Math.abs;

public class ReverseArrayChallenge {

    public static void main(String[] args) {

        int [] testArray = {0, 2432, 2, 12, 3, 5434, 12, 1, 0, 9, 323};
        System.out.println("Original: " + Arrays.toString(testArray));
        System.out.print("Reversed: ");
        reverse(testArray);

    }

    public static void reverse(int[] array) {

        int [] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[abs(array.length - 1 - i)] = array[i];
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
