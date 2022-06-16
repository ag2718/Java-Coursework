import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

import java.awt.Color;

public class TrafficLightComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        g2.draw(new Line2D.Double(10, 10, 10, 390));
        g2.draw(new Line2D.Double(10, 390, 190, 390));
        g2.draw(new Line2D.Double(190, 390, 190, 10));
        g2.draw(new Line2D.Double(10, 10, 190, 10));

        g2.setColor(Color.RED);
        g2.fill(new Ellipse2D.Double(50, 25, 100, 100));

        g2.setColor(Color.YELLOW);
        g2.fill(new Ellipse2D.Double(50, 150, 100, 100));

        g2.setColor(Color.GREEN);
        g2.fill(new Ellipse2D.Double(50, 275, 100, 100));


    }
}
