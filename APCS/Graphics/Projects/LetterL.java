import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A letter L shape.
 */
public class LetterL {
    private double x;
    private double y;

    /**
     * Constructs a letter L at the given x and y coordinate.
     * 
     * @param anX the x-coordinate of the top left corner
     * @param anY the y-coordinate of the top left corner
     */
    public LetterL(double anX, double aY) {
        x = anX;
        y = aY;
    }

    /**
     * Draws the letter L.
     * 
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
        Point2D.Double p1 = new Point2D.Double(x, y);
        Point2D.Double p2 = new Point2D.Double(x, y + 50);
        Point2D.Double p3 = new Point2D.Double(x + 30, y + 50);

        Line2D.Double vert = new Line2D.Double(p1, p2);
        Line2D.Double horiz = new Line2D.Double(p2, p3);

        g2.draw(vert);
        g2.draw(horiz);
    }
}
