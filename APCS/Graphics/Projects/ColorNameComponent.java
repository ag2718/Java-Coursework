import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class ColorNameComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        g2.drawString("Hello World!", 10, 10);

        g2.setColor(Color.LIGHT_GRAY);
        g2.drawString("Hello World!", 10, 20);

        g2.setColor(Color.GRAY);
        g2.drawString("Hello World!", 10, 30);

        g2.setColor(Color.DARK_GRAY);
        g2.drawString("Hello World!", 10, 40);

        g2.setColor(Color.RED);
        g2.drawString("Hello World!", 10, 50);

        g2.setColor(Color.PINK);
        g2.drawString("Hello World!", 10, 60);

        g2.setColor(Color.ORANGE);
        g2.drawString("Hello World!", 10, 70);

        g2.setColor(Color.YELLOW);
        g2.drawString("Hello World!", 10, 80);

        g2.setColor(Color.GREEN);
        g2.drawString("Hello World!", 10, 90);

        g2.setColor(Color.MAGENTA);
        g2.drawString("Hello World!", 10, 100);

        g2.setColor(Color.CYAN);
        g2.drawString("Hello World!", 10, 110);

        g2.setColor(Color.BLUE);
        g2.drawString("Hello World!", 10, 120);

    }
}
