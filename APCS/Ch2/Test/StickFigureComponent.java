import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;

public class StickFigureComponent extends JComponent
{
    public void paintComponent(Graphics g) 
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Ellipse2D.Double head = new Ellipse2D.Double(200, 10, 60, 60);
        Rectangle body = new Rectangle(210, 90, 50, 110);

        g2.draw(head);
        g2.draw(body);

        // Neck
        g2.draw(new Line2D.Double(230, 70, 235, 90));

        // Arms
        g2.draw(new Line2D.Double(260, 90, 300, 110));
        g2.draw(new Line2D.Double(300, 110, 310, 150));

        g2.draw(new Line2D.Double(210, 90, 170, 110));
        g2.draw(new Line2D.Double(170, 110, 130, 100));

        // Legs
        g2.draw(new Line2D.Double(260, 200, 290, 230));
        g2.draw(new Line2D.Double(290, 230, 330, 240));

        g2.draw(new Line2D.Double(210, 200, 180, 210));
        g2.draw(new Line2D.Double(180, 210, 210, 240));

        // Filling in head and body
        g2.setColor(new Color(200, 200, 200));
        g2.fill(head);
        g2.fill(body);
    }
}
