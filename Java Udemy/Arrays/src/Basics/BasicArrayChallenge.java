package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class BasicArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] inputIntegers = getIntegers(5);
        int[] sortedInput = sortIntegers(inputIntegers);
        printArray(sortedInput);



    }


    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++) {                         //Method to get integer array from user input
            values[i] = scanner.nextInt();
        }
        return values;
    }


    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {        //Method that prints long array
            System.out.println(array[i]);
        }
    }


    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {                                            //Method that sorts array in descending order
            flag = false;
            for(int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
}
        }
        return sortedArray;
    }
}
