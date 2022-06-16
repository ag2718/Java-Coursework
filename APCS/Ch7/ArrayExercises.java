import java.util.Scanner;
import java.util.Random;

public class ArrayExercises {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 1
        int[] a = new int[10];
        a[0] = 17;
        a[9] = 29;
        for (int i = 1; i <= 8; i++) {
            a[i] = -1;
        }
        for (int i = 0; i < 10; i++) {
            a[i]++;
        }
        for (int element : a) {
            System.out.println(element);
        }
        System.out.print("Array a: ");
        for (int element : a) {
            System.out.print(element + ", ");
        }

        int[] arr1 = new int[10];
        int[] arr2 = new int[11];
        for (int i = 0; i < 10; i++) {
            arr1[i] = i + 1;
            arr2[i] = i * 2;
        }
        arr2[10] = 20;
        System.out.print("\nArray 1: ");
        for (int element : arr1) {
            System.out.print(element + ", ");
        }
        System.out.print("\nArray 2: ");
        for (int element : arr2) {
            System.out.print(element + ", ");
        }

        // 2
        System.out.println("\n\nEnter in ten values to be stored in an array:");
        int[] userArr = new int[10];
        for (int i = 0; i < 10; i++) {
            userArr[i] = in.nextInt();
        }
        System.out.print("User array: ");
        for (int element : userArr) {
            System.out.print(element + ", ");
        }

        // E7.1
        Random rand = new Random();
        int[] randomArr = new int[10];
        for (int i = 0; i < 10; i++) {
            randomArr[i] = rand.nextInt(20);
        }
        System.out.print("\n\nFull, randomly-generated array: ");
        for (int element : randomArr) {
            System.out.print(element + ", ");
        }
        System.out.print("\nEven index elements: ");
        for (int i = 0; i < 10; i += 2) {
            System.out.print(randomArr[i] + ", ");
        }
        System.out.print("\nEven elements: ");
        for (int element : randomArr) {
            if (element % 2 == 0)
                System.out.print(element + ", ");
        }
        System.out.print("\nReversed elements: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(randomArr[i] + ", ");
        }
        System.out.println("\nFirst and last elements: " + randomArr[0] + ", " + randomArr[9]);

        // E7.6
        int[] reversedRandomArr = reverseArr(randomArr);
        System.out.print("\n\nRandomly-generated array reversed: ");
        for (int element : reversedRandomArr) {
            System.out.print(element + ", ");
        }
        System.out.println("\n");

        // 4

        int[] counts = new int[51];

        System.out.println("Enter integers between 0 and 50 (type a nonnumeric character to stop)");

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

    // E7.6
    public static int[] reverseArr(int[] original) {
        int[] res = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            System.out.println(original[original.length - 1 - i]);
            res[i] = original[original.length - 1 - i];
        }
        return res;
    }
}
