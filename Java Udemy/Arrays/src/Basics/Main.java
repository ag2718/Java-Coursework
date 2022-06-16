package Basics;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int [] myIntArray = new int[10];         //Integer array with length 10
        myIntArray[9] = 10;
        System.out.println(myIntArray[9]);

        //Or you could do something like this...
        double[] myDoubleArray = {0.5, 1, 1.5, 2, 2.5, 3};
        System.out.println(myDoubleArray[1]);

        //Or we can use a for loop
        long [] myLongArray = new long[10];
        for(int i = 0; i < myLongArray.length; i++) {
            myLongArray[i] = 10000000*i;
        }
        System.out.println(myLongArray[5]);


        //We can use a for loop to print out values of an array
        for(int i = 0; i < myDoubleArray.length; i++) {
            System.out.println(myDoubleArray[i]);
        }

        printArray(myLongArray);

        int[] integersEntered = getIntegers(5);

        System.out.println("The average of the input integers was " + getAverage(integersEntered));
    }


    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {        //Method that prints long array
            System.out.println(array[i]);
        }
    }


    public static void printArray(long[] array) {
        for(int i = 0; i < array.length; i++) {        //Method that prints long array
            System.out.println(array[i]);
        }
    }


    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++) {                         //Method to get integer array from user input
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }


}
