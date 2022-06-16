import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/*
   A component that draws an alien face
*/
public class NameComponent extends JComponent {
    public void paintComponent(Graphics g) {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.RED);
        g2.drawString("Aarush", 20, 20);

        g2.setColor(Color.BLUE);
        g2.draw(new Rectangle(10, 0, 70, 30));
    }
}
