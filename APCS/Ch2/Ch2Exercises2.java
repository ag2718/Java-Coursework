import java.util.Random;
import java.awt.Point;

public class Ch2Exercises2
{
    public static void main(String[] args) {
        // E2.13
        Random generator = new Random();
        System.out.println(generator.nextInt(6) + 1);

        // E2.14
        System.out.println(10 + 0.01 * generator.nextInt(996));

        // E2.15
        Point pt1 = new Point(3, 4);
        Point pt2 = new Point(-3, -4);

        System.out.println("Expected: 10");
        System.out.println("Actual: " + pt1.distance(pt2));

        // E2.16
        Day today = new Day(2020, 10, 6);
        Day later = today.addDays(10);

        System.out.println("Expected: 10");
        System.out.println("Actual: " + later.daysFrom(today));

        // E2.17
        Picture pic = new Picture();
        pic.load("queen-mary.png");
        pic.scale(pic.getWidth()/2, pic.getHeight()/2);
        pic.move(pic.getWidth()/2, pic.getHeight()/2);

        // E2.18
        pic = new Picture();
        pic.load("queen-mary.png");
        pic.scale(pic.getWidth()*2, pic.getHeight()*2);
    }
}
