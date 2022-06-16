import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;
import java.lang.Math;

public class TurkeyComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Feathers (behind the body)

        g2.setColor(Color.ORANGE);

        g2.fill(new Ellipse2D.Double(105, 95, 55, 55));
        g2.fill(new Ellipse2D.Double(90, 60, 35, 35));

        // Randomly choosing between black and brown for the body color, using an if
        // statement and Math.random()

        int rand = (int) (Math.random() + 0.5);
        Color bodyColor;
        if (rand == 0) {
            bodyColor = new Color(150, 75, 0);
        } else {
            bodyColor = Color.BLACK;
        }

        g2.setColor(bodyColor);

        // Torso and head

        g2.fill(new Ellipse2D.Double(100, 100, 60, 60));
        g2.draw(new Line2D.Double(130, 130, 90, 70));
        g2.fill(new Ellipse2D.Double(80, 60, 40, 40));

        // Left leg

        g2.draw(new Line2D.Double(120, 140, 120, 190));
        g2.draw(new Line2D.Double(120, 180, 110, 190));
        g2.draw(new Line2D.Double(120, 180, 130, 190));

        // Right leg

        g2.draw(new Line2D.Double(140, 140, 140, 190));
        g2.draw(new Line2D.Double(140, 180, 130, 190));
        g2.draw(new Line2D.Double(140, 180, 150, 190));

        // Face

        g2.setColor(Color.YELLOW);
        g2.fill(new Ellipse2D.Double(95, 70, 7, 7));
        g2.fillPolygon(new int[] { 90, 90, 70 }, new int[] { 85, 90, 87 }, 3);

        g2.setColor(Color.RED);
        g2.fill(new Ellipse2D.Double(90, 90, 5, 25));
    }
}
