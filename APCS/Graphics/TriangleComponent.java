import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;

public class TriangleComponent extends JComponent
{
    public void paintComponent(Graphics g) 
    {
        Graphics2D g2 = (Graphics2D) g;

        g2.draw(new Line2D.Double(60, 10, 20, 60));
        g2.draw(new Line2D.Double(20, 60, 100, 60));
        g2.draw(new Line2D.Double(100, 60, 60, 10));
    }
}
