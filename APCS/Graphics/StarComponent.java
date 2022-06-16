import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;

public class StarComponent extends JComponent
{
    public void paintComponent(Graphics g) 
    {
        Graphics2D g2 = (Graphics2D) g;

        g2.draw(new Line2D.Double(30, 80, 130, 80));
        g2.draw(new Line2D.Double(30, 30, 130, 130));
        g2.draw(new Line2D.Double(80, 30, 80, 130));
        g2.draw(new Line2D.Double(130, 30, 30, 130));
    }
}

