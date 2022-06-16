import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A car shape that can be positioned anywhere on the screen.
 */
public class Car {
    private int xLeft;
    private int yTop;
    private int size;
    private Color color;

    /**
     * Constructs a car with a given top left corner.
     * 
     * @param x     the x coordinate of the top left corner
     * @param y     the y coordinate of the top left corner
     * @param size  the size of the house
     * @param color the color of the house
     */
    public Car(int x, int y, int size, Color color) {
        xLeft = x;
        yTop = y;
        this.color = color;
        this.size = size;
    }

    /**
     * Draws the car.
     * 
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
        Rectangle body = new Rectangle(xLeft, yTop + this.size, 6 * this.size, this.size);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + this.size, yTop + 2 * this.size, this.size,
                this.size);
        Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + 4 * this.size, yTop + 2 * this.size, this.size,
                this.size);

        // The bottom of the front windshield
        Point2D.Double r1 = new Point2D.Double(xLeft + this.size, yTop + this.size);
        // The front of the roof
        Point2D.Double r2 = new Point2D.Double(xLeft + 2 * this.size, yTop);
        // The rear of the roof
        Point2D.Double r3 = new Point2D.Double(xLeft + 4 * this.size, yTop);
        // The bottom of the rear windshield
        Point2D.Double r4 = new Point2D.Double(xLeft + 5 * this.size, yTop + this.size);

        Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
        Line2D.Double roofTop = new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

        g2.setColor(this.color);
        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontWindshield);
        g2.draw(roofTop);
        g2.draw(rearWindshield);
    }
};
