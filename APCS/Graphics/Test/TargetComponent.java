import javax.swing.JComponent;
import java.awt.*;

public class TargetComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Target target = new Target(75, 50, 100);
        target.draw(g2);
    }
}
