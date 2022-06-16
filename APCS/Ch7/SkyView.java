public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];
        for (int i = 0; i < scanned.length; i++) {
            int row = i / numCols;
            if (row % 2 == 0)
                view[row][i % numCols] = scanned[i];
            else
                view[row][numCols - i % numCols - 1] = scanned[i];
        }
    }

    public double[][] getView() {
        return view;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                sum += view[i][j];
            }
        }
        return sum / (endRow - startRow + 1) / (endCol - startCol + 1);
    }
}
