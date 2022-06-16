import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component draws two car shapes.
 */
public class CarComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Car car1 = new Car(0, 0, 15, Color.RED);

        int x = getWidth() - 120;
        int y = getHeight() - 60;

        Car car2 = new Car(x, y, 5, Color.GREEN);

        Car car3 = new Car(0, y, 20, Color.BLUE);

        Car car4 = new Car(x, 0, 10, Color.CYAN);

        car1.draw(g2);
        car2.draw(g2);
        car3.draw(g2);
        car4.draw(g2);
    }
}
