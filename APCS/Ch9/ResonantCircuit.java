public class ResonantCircuit {

    private double R;
    private double L;
    private double C;

    public ResonantCircuit(double R, double L, double C) {
        this.R = R;
        this.L = L;
        this.C = C;
    }

    public double getR() {
        return R;
    }

    public void setR(double newR) {
        R = newR;
    }

    public double getL() {
        return L;
    }

    public void setL(double newL) {
        L = newL;
    }

    public double getC() {
        return C;
    }

    public void setC(double newC) {
        C = newC;
    }

    public void display() {
        System.out.println("Resistance: " + R + "\nInductance: " + L + "\nCapacitance: " + C);
    }

    public static void main(String[] args) {

        // Tester

        SeriesResonantCircuit series = new SeriesResonantCircuit(5.0, 10.0, 15.0);
        series.display();

        System.out.println();

        ParallelResonantCircuit parallel = new ParallelResonantCircuit(5.0, 10.0, 15.0);
        parallel.display();

    }

}

class SeriesResonantCircuit extends ResonantCircuit {

    private double omega0;
    private double B;
    private double k;

    public SeriesResonantCircuit(double omega0, double B, double k) {
        super(1 / k, 1 / k / B, 1 / (omega0 * omega0 * (1 / k / B)));
        this.omega0 = omega0;
        this.B = B;
        this.k = k;
    }

    public void display() {
        super.display();
        System.out.println("\nωo: " + omega0 + "\nB: " + B + "\nk: " + k);
    }

}

class ParallelResonantCircuit extends ResonantCircuit {

    private double omega0;
    private double B;
    private double k;

    public ParallelResonantCircuit(double omega0, double B, double k) {
        super(k, 1 / (omega0 * omega0 * (1 / k / B)), 1 / k / B);
        this.omega0 = omega0;
        this.B = B;
        this.k = k;
    }

    public void display() {
        super.display();
        System.out.println("\nωo: " + omega0 + "\nB: " + B + "\nk: " + k);
    }

}
