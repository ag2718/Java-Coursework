import javax.swing.JComponent;
import java.awt.*;

public class BarChartComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        double scaleFactor = 0.07;

        Bar goldenGate = new Bar(40, (int) (4200 * scaleFactor), "Golden Gate");
        Bar brookyln = new Bar(65, (int) (1595 * scaleFactor), "Brookyln");
        Bar delewareMemorial = new Bar(90, (int) (2150 * scaleFactor), "Deleware Memorial");
        Bar mackinac = new Bar(115, (int) (3800 * scaleFactor), "Mackinac");

        goldenGate.draw(g2);
        brookyln.draw(g2);
        delewareMemorial.draw(g2);
        mackinac.draw(g2);

    }
}
