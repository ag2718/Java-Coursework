import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Draws a picture of a house, using the House class.
 */
public class HouseComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        int x = 100;
        int y = 200;
        int size = 50;

        House house = new House(x, y, size);

        house.draw(g2);

        House house2 = new House(240, 150, 20);

        house2.draw(g2);

        House house3 = new House(30, 130, 80);

        house3.draw(g2);

        House house4 = new House(270, 250, 100);

        house4.draw(g2);
    }
}
