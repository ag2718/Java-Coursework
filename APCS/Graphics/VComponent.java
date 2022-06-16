import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class VComponent extends JComponent
{
    public void paintComponent(Graphics g) 
    {
        Graphics2D g2 = (Graphics2D) g;

        g2.draw(new Line2D.Double(30, 10, 60, 60));
        g2.draw(new Line2D.Double(60, 60, 90, 10));
    }
}
