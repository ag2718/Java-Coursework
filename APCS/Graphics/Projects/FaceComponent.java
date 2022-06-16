import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class FaceComponent extends JComponent 
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        g2.draw(new Ellipse2D.Double(20, 20, 100, 100));
        g2.draw(new Ellipse2D.Double(45, 50, 10, 10));
        g2.draw(new Ellipse2D.Double(85, 50, 10, 10));
        g2.draw(new Line2D.Double(40, 90, 100, 90));
    }
}
