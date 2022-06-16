import java.util.Scanner;
import java.lang.Math;

public class Exercises {
    public static void main(String[] args) {

        // E4.3

        System.out.println("Enter two integers:");

        Scanner input = new Scanner(System.in);
        int first = Integer.parseInt(input.next());
        int second = Integer.parseInt(input.next());

        System.out.println("Sum: " + (first + second));
        System.out.println("Difference: " + (first - second));
        System.out.println("Product: " + (first * second));
        System.out.println("Average: " + (0.5 * (first + second)));
        System.out.println("Distance: " + Math.abs(first - second));
        System.out.println("Maximum: " + Math.max(first, second));
        System.out.println("Minimum: " + Math.min(first, second));

        // E4.4

        System.out.println("");

        System.out.println("Properly-aligned version:");
        System.out.println("Sum:          " + (first + second));
        System.out.println("Difference:   " + (first - second));
        System.out.println("Product:      " + (first * second));
        System.out.println("Average:      " + (0.5 * (first + second)));
        System.out.println("Distance:     " + Math.abs(first - second));
        System.out.println("Maximum:      " + Math.max(first, second));
        System.out.println("Minimum:      " + Math.min(first, second));

        // E4.6

        System.out.println("");

        System.out.println("Enter the radius of the circle/sphere: ");
        double radius = Double.parseDouble(input.next());

        System.out.println("Circle of radius " + radius);
        System.out.println("-------------------");
        System.out.println("Area: " + Math.PI * Math.pow(radius, 2));
        System.out.println("Circumference: " + 2 * Math.PI * radius);
        System.out.println("");
        System.out.println("Sphere of radius " + radius);
        System.out.println("-------------------");
        System.out.println("Surface Area: " + 4 * Math.PI * Math.pow(radius, 2));
        System.out.println("Volume: " + 4.0 / 3 * Math.PI * Math.pow(radius, 3));

        // E4.12

        System.out.println("");

        System.out.print("Enter a number between between 1,000 and 999,999: ");
        String strVal = input.next();
        int val = Integer.parseInt(strVal.split(",")[0] + strVal.split(",")[1]);
        System.out.println("Your integer is: " + val);

        // E4.13

        System.out.println("");

        System.out.print("Enter a number between between 1,000 and 999,999: ");
        strVal = input.next();
        strVal = strVal.substring(0, strVal.length() - 3) + "," + strVal.substring(strVal.length() - 3);
        System.out.println("Your integer is: " + strVal);
    }
}
