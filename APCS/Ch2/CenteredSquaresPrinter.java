import java.awt.Rectangle;

public class CenteredSquaresPrinter
{
    public static void main(String[] args) 
    {
        Rectangle square = new Rectangle(100, 100, 200, 200);
        System.out.println(square);

        square.grow(-50, -50);
        System.out.println(square);
    }
}
