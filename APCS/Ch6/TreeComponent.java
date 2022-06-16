import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;
import java.util.Random;

public class TreeComponent extends JComponent {
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        int treex[] = { 50, 75, 60, 75, 70, 100, 130, 125, 140, 125, 150 };
        int treey[] = { 200, 150, 150, 100, 100, 50, 100, 100, 150, 150, 200 };

        g2.setColor(Color.GREEN);
        g2.fillPolygon(treex, treey, 11);

        g2.setColor(new Color(165, 42, 42));
        g2.fill(new Rectangle(90, 200, 20, 30));

        g2.setColor(Color.YELLOW);
        g2.fill(new Ellipse2D.Double(90, 40, 20, 20));

        Color ornamentColors[] = { Color.RED, Color.YELLOW, Color.WHITE, Color.PINK, Color.BLUE };
        int numColors = 5;
        Random colorGen = new Random();

        for (int i = 1; i <= 3; i++) {
            for (int j = -i; j <= i; j++) {
                g2.setColor(ornamentColors[colorGen.nextInt(numColors)]);
                g2.fill(new Ellipse2D.Double(97 + j * 7, 40 + i * 40, 5, 5));
                g2.fill(new Ellipse2D.Double(97 + j * 7, 60 + i * 40, 5, 5));
            }
        }

    }
}
