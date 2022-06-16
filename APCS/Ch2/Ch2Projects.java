import java.awt.Rectangle;

public class Ch2Projects
{
    public static void main(String[] args) 
    {
        // P2.1 FourRectanglePrinter
        Rectangle box = new Rectangle(0, 0, 10, 20);
        System.out.println(box);

        box.translate(10, 0);
        System.out.println(box);

        box.translate(0, 20);
        System.out.println(box);

        box.translate(-10, 0);
        System.out.println(box);

        // P2.2 GrowSquarePrinter
        Rectangle square = new Rectangle(100, 100, 50, 50);
        System.out.println(square);

        square.grow(25, 25);
        square.translate(25, 25);
        System.out.println(square);

        // P2.3 CenteredSquaresPrinter
        square = new Rectangle(100, 100, 200, 200);
        System.out.println(square);

        square.grow(-50, -50);
        System.out.println(square);
    }
}

