import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 1
        int[][] arr = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 }, { 15, 16, 17, 18, 19 },
                { 20, 21, 22, 23, 24 } };

        System.out.println("\nPrinting out elements of initalized array:");
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        // 2 & 3
        int[][] userarr = new int[3][4];
        System.out.println("\nEnter in 12 integer values to be stored in a 2D array:");
        for (int i = 0; i < userarr.length; i++) {
            for (int j = 0; j < userarr[0].length; j++) {
                userarr[i][j] = in.nextInt();
            }
        }

        int sum = 0;

        System.out.println("\nPrinting out elements of user input array:");
        for (int[] row : userarr) {
            for (int element : row) {
                System.out.print(element + " ");
                sum += element;
            }
            System.out.println();
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + ((double) sum) / (userarr.length * userarr[0].length));

        // 4
        userarr = new int[3][3];
        System.out.println("\nEnter in 9 integer values to be stored in a 2D array:");
        for (int i = 0; i < userarr.length; i++) {
            for (int j = 0; j < userarr[0].length; j++) {
                userarr[i][j] = in.nextInt();
            }
        }
        int min = userarr[0][0], max = userarr[0][0];
        for (int[] row : userarr) {
            for (int element : row) {
                System.out.print(element + " ");
                if (element > max)
                    max = element;
                if (element < min)
                    min = element;
            }
        }
        System.out.println("Min: " + min + "\nMax: " + max);

        // 5
        String[][] languages = { { "JAVA", "PYTHON", "JAVA" }, { "C++", "JAVA", "C" }, { "JS", "PYTHON", "JAVA" } };
        System.out.println("\nJava was found " + findCount("JAVA", languages) + " times");
    }

    public static int findCount(String valToFind, String[][] strArr) {
        int count = 0;
        for (String[] row : strArr) {
            for (String element : row) {
                if (element.equals(valToFind))
                    count++;
            }
        }
        return count;
    }
}
