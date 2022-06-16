public class TemperatureGrid {

    private double[][] temps;

    public TemperatureGrid(double[][] initialTemps) {
        this.temps = initialTemps;
    }

    public double computeTemp(int row, int col) {
        if (row == 0 || row == temps.length - 1 || col == 0 || col == temps[0].length - 1)
            return temps[row][col];
        return (temps[row - 1][col] + temps[row][col - 1] + temps[row][col + 1] + temps[row + 1][col]) / 4.0;
    }

    public double[][] getTemps() {
        return this.temps;
    }

    public boolean updateAllTemps(double tolerance) {
        double maxDeviation = 0;
        double[][] updatedTemps = new double[temps.length][temps[0].length];
        for (int i = 0; i < temps.length; i++) {
            for (int j = 0; j < temps[0].length; j++) {
                updatedTemps[i][j] = computeTemp(i, j);
                maxDeviation = Math.max(maxDeviation, Math.abs(updatedTemps[i][j] - temps[i][j]));
            }
        }
        temps = updatedTemps;
        return maxDeviation <= tolerance;
    }

}
