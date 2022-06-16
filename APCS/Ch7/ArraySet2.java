import java.util.Scanner;

public class ArraySet2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter 10 values for an array");
        for (int i = 0; i < 10; i++) {
            System.out.print("Value at index " + i + ": ");
            arr[i] = in.nextInt();
        }

        int min = arr[0], max = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Max value is " + max + ", min value is " + min);

    }
}
