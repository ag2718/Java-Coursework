import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;

public class CircleComponent extends JComponent
{
    public void paintComponent(Graphics g) 
    {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.BLUE);
        g2.draw(new Rectangle(10, 10, 100, 100));

        g2.setColor(Color.RED);
        g2.draw(new Ellipse2D.Double(10, 10, 100, 100));

        g2.setColor(Color.ORANGE);
        g2.drawString("Aarush", 40, 60);

    }
}
