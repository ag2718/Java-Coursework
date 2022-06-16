import java.awt.Rectangle;

public class FourRectanglePrinter
{
    public static void main(String[] args) 
    {
        Rectangle box = new Rectangle(0, 0, 10, 20);
        System.out.println(box);

        box.translate(10, 0);
        System.out.println(box);

        box.translate(0, 20);
        System.out.println(box);

        box.translate(-10, 0);
        System.out.println(box);
    }
}
