import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class PurplePinkComponent extends JComponent {
    public void paintComponent (Graphics g) 
    {
        Graphics2D g2 = (Graphics2D) g;

        // Draw pink rectangle
        g2.setColor(Color.PINK);
        g2.fill(new Rectangle(10, 10, 20, 20));

        // Draw purple rectangle
        g2.setColor(new Color(128, 0, 128));
        g2.fill(new Rectangle(50, 50, 10, 10));
    }
}
