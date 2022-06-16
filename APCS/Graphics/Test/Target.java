import java.awt.*;
import java.awt.geom.*;

/**
 * Class for creating a target
 */
public class Target {

    private int x;
    private int y;
    private int size;

    /**
     * Construct a new Target object
     * 
     * @param x    left x-coordinate of the target
     * @param y    top y-coordinate of the target
     * @param size size of the target
     */
    public Target(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    /**
     * Displays the target
     * 
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {

        g2.setColor(Color.BLACK);
        g2.fill(new Ellipse2D.Double(this.x, this.y, this.size, this.size));

        g2.setColor(Color.WHITE);
        g2.fill(new Ellipse2D.Double(this.x + this.size / 10, this.y + this.size / 10, this.size * 4 / 5,
                this.size * 4 / 5));

        g2.setColor(Color.BLACK);
        g2.fill(new Ellipse2D.Double(this.x + this.size / 5, this.y + this.size / 5, this.size * 3 / 5,
                this.size * 3 / 5));

        g2.setColor(Color.WHITE);
        g2.fill(new Ellipse2D.Double(this.x + this.size * 3 / 10, this.y + this.size * 3 / 10, this.size * 2 / 5,
                this.size * 2 / 5));

        g2.setColor(Color.BLACK);
        g2.fill(new Ellipse2D.Double(this.x + this.size * 2 / 5, this.y + this.size * 2 / 5, this.size * 1 / 5,
                this.size * 1 / 5));
    }

}
