import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // E4.15
        System.out.print("Enter your integer: ");
        int num = Integer.parseInt(input.next());
        System.out.println(num / 10000 + " " + (num % 10000) / 1000 + " " + (num % 1000) / 100 + " " + (num % 100) / 10
                + " " + num % 10);

        System.out.println("");

        // E4.16
        System.out.print("Please enter the first time: ");
        int firstTime = Integer.parseInt(input.next());
        System.out.print("Please enter the second time: ");
        int secondTime = Integer.parseInt(input.next());

        double before, after;
        // if (secondTime > firstTime) {
        // before = firstTime / 100 + (firstTime % 100) / 60.0;
        // after = secondTime / 100 + (secondTime % 100) / 60.0;
        // } else {
        // before = secondTime / 100 + (secondTime % 100) / 60.0;
        // after = firstTime / 100 + (firstTime % 100) / 60.0;
        // }

        before = firstTime / 100 + (firstTime % 100) / 60.0;
        after = secondTime / 100 + (secondTime % 100) / 60.0;

        int hours = ((int) (after - before + 24)) % 24;
        int min = ((int) ((after - before - (int) (after - before)) * 60 + 60)) % 60;

        System.out.println(hours + " hours " + min + " minutes");

        System.out.println("");

        // P4.8
        System.out.print("Enter phone number here: ");
        String number = input.next();
        System.out.println("(" + number.substring(0, 3) + ") " + number.substring(3, 6) + "-" + number.substring(6));

        System.out.println("");

        // P4.16
        System.out.print("Enter the value of the power factor: ");
        double pf = Double.parseDouble(input.next());
        double R = 10;
        double Vt = 120;
        double P = 260;
        double Vs = Math
                .sqrt(Math.pow(Vt + 2 * R * P / Vt, 2) + Math.pow(2 * R * P / pf / Vt, 2) * (1 - Math.pow(pf, 2)));
        System.out.println(Vs + " V");
    }
}
