import java.util.Scanner;
import java.awt.Rectangle;
import java.lang.Math;

public class Projects {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // P5.6 - 1 dot

        int x, y, w, h;
        System.out.print("Left x-coordinate? ");
        x = in.nextInt();
        System.out.print("Top y-coordinate? ");
        y = in.nextInt();
        System.out.print("Right x-coordinate? ");
        w = in.nextInt() - x;
        System.out.print("Bottom y-coordinate? ");
        h = in.nextInt() - y;

        Rectangle rect = new Rectangle(x, y, w, h);
        if (rect.getWidth() > rect.getHeight()) {
            System.out.println("Landscape");
        } else if (rect.getWidth() < rect.getHeight()) {
            System.out.println("Portrait");
        } else {
            System.out.println("Square");
        }

        System.out.println("");

        // P5.21 - 3 dot

        double beta = 3310;
        double R0 = 33192;
        double T0 = 40 + 273;

        System.out.print("Temperature in degrees Fahrenheit? ");
        double tempK = 5.0 / 9 * (in.nextDouble() - 32) + 273;

        double R = R0 * Math.exp(beta * (1 / tempK - 1 / T0));
        double R2 = 156300;
        double R3 = 156300;
        double R4 = 156300;

        if (R2 / (R + R2) < R4 / (R3 + R4)) {
            System.out.println("Alarm will sound!");
        } else {
            System.out.println("Alarm will not sound!");
        }

        System.out.println("");

        // P5.24 - 2 dot

        double G = 6.67 * Math.pow(10, -11);
        double M = 1.3 * Math.pow(10, 22);
        R = 1.153 * Math.pow(10, 6); // This variable was already defined for P5.21

        System.out.print("Launch speed (in mph)? ");
        double v = in.nextDouble() / 2.237;
        double extraMassRequired = v * v / 2 * R / G - M;

        if (extraMassRequired < 0) {
            System.out.println("You will return to the surface!");
        } else {
            System.out.println("You will not return to the surface! The comet's mass would need to increase by "
                    + extraMassRequired + " kg in order to make this jump possible.");
        }

    }

}
