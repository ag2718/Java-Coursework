import java.util.Scanner;
import java.lang.Math;

public class Exercises3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // E5.13
        System.out.print("Enter the student's grade (as a letter): ");
        Grade grade = new Grade(input.next());
        System.out.print("Numeric Grade: ");
        System.out.println(grade.getNumericGrade());

        System.out.println("");

        // E5.17

        System.out.println("Enter three numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        System.out.print("Maximum value is ");
        System.out.println(Math.max(num1, Math.max(num2, num3)));

        System.out.println("");

        // E5.18

        System.out.println("Enter three names:");
        String name1 = input.next();
        String name2 = input.next();
        String name3 = input.next();

        StringSet s = new StringSet(name1, name2, name3);

        System.out.println("Names sorted lexographically:");
        System.out.println(s.getSmallest() + "\n" + s.getMiddle() + "\n" + s.getLargest());
    }
}
