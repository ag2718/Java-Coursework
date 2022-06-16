public class TemperatureGridTester {

    public static void main(String[] args) {

        double[][] initialTemps = { { 95.5, 100, 100, 100, 100, 110.3 }, { 0, 50, 50, 50, 50, 0 },
                { 0, 40, 40, 40, 40, 0 }, { 0, 20, 20, 20, 20, 0 }, { 0, 0, 0, 0, 0, 0 } };

        TemperatureGrid tempGrid = new TemperatureGrid(initialTemps);
        System.out.println(
                "Meets the tolerance of 0.01 after temperatures are updated? " + tempGrid.updateAllTemps(0.01) + "\n");
        System.out.println("Updated temperatures: ");
        for (double[] row : tempGrid.getTemps()) {
            for (double element : row) {
                System.out.print(element + ", ");
            }
            System.out.println();
        }

    }

}
