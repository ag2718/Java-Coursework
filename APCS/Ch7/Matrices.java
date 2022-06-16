import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 1
        System.out.println("First matrix for addition");
        int[][] matrix1 = readMatrix();
        System.out.println("Second matrix for addition");
        int[][] matrix2 = readMatrix();

        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {

            int[][] sum = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            System.out.println("Sum of matrices: ");
            printMatrix(sum);

        } else {
            System.out.println("Sizes not compatible.");
        }

        // 2
        System.out.println("\nFirst matrix for multiplication");
        matrix1 = readMatrix();
        System.out.println("Second matrix for multiplication");
        matrix2 = readMatrix();
        if (matrix1[0].length == matrix2.length) {

            int[][] product = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            System.out.println("Product of matrices: ");
            printMatrix(product);

        } else {
            System.out.println("Sizes not compatible.");
        }
    }

    public static int[][] readMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of rows in matrix? ");
        int rows = in.nextInt();
        System.out.print("Number of columns in matrix? ");
        int cols = in.nextInt();

        System.out.println("Enter " + rows * cols + " integers to be stored in the matrix:");
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = in.nextInt();
            }
        }

        return res;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
