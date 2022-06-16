import java.awt.*;
import java.awt.geom.*;

/**
 * This class draws a house by allowing the user to specify houses of different
 * sizes.
 */
public class House {

    private int x;
    private int y;
    private int size;

    /**
     * Constructor to initalize the bottom left corner and the size.
     * 
     * @param x    the left corner coordinate
     * @param y    the bottom corner coordinate
     * @param size the side length of the body of the house
     */
    public House(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    /**
     * Draws the house
     * 
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
        Rectangle base = new Rectangle(this.x, this.y - this.size, this.size, this.size);
        Line2D.Double leftRoofEdge = new Line2D.Double(this.x, this.y - this.size, this.x + this.size / 2,
                this.y - this.size - this.size / 2);
        Line2D.Double rightRoofEdge = new Line2D.Double(this.x + this.size, this.y - this.size, this.x + this.size / 2,
                this.y - this.size - this.size / 2);

        Rectangle door = new Rectangle(this.x + this.size / 4, this.y - this.size / 2, this.size / 4, this.size / 2);
        Rectangle window = new Rectangle(this.x + 2 * this.size / 3, this.y - this.size / 2, this.size / 5,
                this.size / 5);

        g2.draw(base);
        g2.draw(leftRoofEdge);
        g2.draw(rightRoofEdge);

        g2.draw(door);
        g2.draw(window);
    }

}
