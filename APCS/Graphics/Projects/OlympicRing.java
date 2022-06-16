import java.awt.*;
import java.awt.geom.*;

/**
 * A class to construct an Olympic ring
 */
public class OlympicRing {

    private int x;
    private int y;
    private Color color;

    /**
     * Constructor that initializes the color, position, size of the ring
     * 
     * @param x     The x position of the left of the ring
     * @param y     The y position of the top of the ring
     * @param color The color of the ring
     */
    public OlympicRing(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /**
     * Draws the Olympic ring
     * 
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
        g2.setColor(this.color);
        g2.draw(new Ellipse2D.Double(this.x, this.y, 50, 50));
    }

}
