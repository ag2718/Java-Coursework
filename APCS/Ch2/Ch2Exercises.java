import java.awt.Rectangle;

public class Ch2Exercises {
    public static void main(String[] args) {
        //E2.1 Replace i with ii and ss with s in Mississippi
        String str = "Mississippi";
        System.out.println(str.replace("i", "ii").replace("ss", "s"));

        //E2.2 Trim method, removing spaces
        String strToTrim = " Hello    World   ";
        System.out.println("Trimmed: " + strToTrim.trim());
        System.out.println("Spaces Removed: " + strToTrim.replace(" ", ""));

        //E2.3 Area Tester for Rectangle
        Rectangle rect = new Rectangle(0, 0, 15, 10);
        System.out.println("Expected Area: " + 15 * 10);
        System.out.println("Actual Area: " + rect.getWidth() * rect.getHeight());

        //E2.4 Perimeter Tester for Rectangle
        System.out.println("Expected Perimeter: " + 2 * (15 + 10));
        System.out.println("Actual Perimeter: " + 2 * (rect.getWidth() + rect.getHeight()));

        //E2.5 Rectangles of Area and Perimeter 42
        Rectangle rect1 = new Rectangle(0, 0, 6, 7);
        Rectangle rect2 = new Rectangle(0, 0, 10, 11);

        System.out.println("Width and Height of Rectangle w/ Area 42: " + rect1.getWidth() + ", " + rect1.getHeight());
        System.out.println("Width and Height of Rectangle w/ Perimeter 42: " + rect2.getWidth() + ", " + rect2.getHeight());

        //E2.6 Add Method for Rectangle Class
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0, 0);
        System.out.println("Expected: Location - (0, 0), Width - 25, Height - 40");
        System.out.println("Actual: Location - (" + box.getX() + ", " + box.getY() + "), Width - " + box.getWidth() + ", Height - " + box.getHeight());

        //E2.7 Replace Tester
        String testStr = "Mississippi";
        System.out.println("Expected: M!$$!$$!pp!");
        System.out.println("Actual: " + testStr.replace("i", "!").replace("s", "$"));

        //E2.8 HollePrinter
        System.out.println("Hello, World!".replace("o", "x").replace("e", "o").replace("x", "e"));

    }
}
