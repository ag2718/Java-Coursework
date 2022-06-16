import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A letter H shape.
 */
public class LetterH {
    private double x;
    private double y;

    /**
     * Constructs a letter H at the given x and y coordinate.
     * 
     * @param anX the x-coordinate of the top left corner
     * @param anY the y-coordinate of the top left corner
     */
    public LetterH(double anX, double aY) {
        x = anX;
        y = aY;
    }

    /**
     * Draws the letter H.
     * 
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
        Point2D.Double p1 = new Point2D.Double(x, y);
        Point2D.Double p2 = new Point2D.Double(x, y + 50);
        Point2D.Double p3 = new Point2D.Double(x + 30, y);
        Point2D.Double p4 = new Point2D.Double(x + 30, y + 50);
        Point2D.Double p5 = new Point2D.Double(x, y + 25);
        Point2D.Double p6 = new Point2D.Double(x + 30, y + 25);

        Line2D.Double vert1 = new Line2D.Double(p1, p2);
        Line2D.Double vert2 = new Line2D.Double(p3, p4);
        Line2D.Double horiz = new Line2D.Double(p5, p6);

        g2.draw(vert1);
        g2.draw(vert2);
        g2.draw(horiz);
    }
}
