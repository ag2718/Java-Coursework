public class SkyViewTester {
    public static void main(String[] args) {

        double[] scannedVals = { 0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9 };
        SkyView skyView = new SkyView(4, 3, scannedVals);

        System.out.println("2D array in view object");
        for (double[] row : skyView.getView()) {
            for (double element : row)
                System.out.print(element + ", ");
            System.out.println();
        }

        System.out.println("\nAverage for rows 1-2 and 0-1: " + skyView.getAverage(1, 2, 0, 1) + " (expected: 0.8)");
    }
}
