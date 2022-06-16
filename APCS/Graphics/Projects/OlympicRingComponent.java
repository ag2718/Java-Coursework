import javax.swing.JComponent;
import java.awt.*;

public class OlympicRingComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        OlympicRing blue = new OlympicRing(10, 10, Color.BLUE);
        OlympicRing yellow = new OlympicRing(40, 40, Color.YELLOW);
        OlympicRing black = new OlympicRing(70, 10, Color.BLACK);
        OlympicRing green = new OlympicRing(100, 40, Color.GREEN);
        OlympicRing red = new OlympicRing(130, 10, Color.RED);

        blue.draw(g2);
        yellow.draw(g2);
        black.draw(g2);
        green.draw(g2);
        red.draw(g2);
    }
}
