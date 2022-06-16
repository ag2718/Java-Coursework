import java.util.Scanner;
import java.lang.Math;

public class Projects {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // P6.17
        System.out.print("Value of B: ");
        double B = in.nextDouble();
        System.out.print("Value of L: ");
        double L = in.nextDouble();
        System.out.print("Value of T: ");
        double T = in.nextDouble();
        System.out.print("Value of x: ");
        double x = in.nextDouble();
        System.out.print("Value of N: ");
        double N = in.nextDouble();

        double area = 0;
        for (double z = 0; z >= -T; z -= T / N) {
            double y = Math.abs(B / 2 * (1 - Math.pow(2 * x / L, 2)) * (1 - Math.pow(z / T, 2)));
            if (z == 0 || Math.abs(z + T) < 1e-8)
                area += y;
            else
                area += 2 * y;
        }

        area *= T / N;

        System.out.println("Area of hull: " + area + "\n");

        // P6.19
        double Rs = 8, R0 = 20, Vs = 40;
        double maxPs = 0, maxn = -1;
        for (double n = 0.01; n <= 2; n += 0.01) {
            double Ps = Rs * Math.pow(n * Vs / (n * n * R0 + Rs), 2);
            if (Ps > maxPs) {
                maxn = n;
                maxPs = Ps;
            }
        }
        System.out.println("A turns ratio of " + maxn + " maximizes the power delivered to the speaker.");

    }
}
