import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * A letter E shape.
 */
public class LetterE {
    private double x;
    private double y;

    /**
     * Constructs a letter E at the given x and y coordinate.
     * 
     * @param anX the x-coordinate of the top left corner
     * @param anY the y-coordinate of the top left corner
     */
    public LetterE(double anX, double aY) {
        x = anX;
        y = aY;
    }

    /**
     * Draws the letter E.
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

        Line2D.Double vert = new Line2D.Double(p1, p2);
        Line2D.Double horiz1 = new Line2D.Double(p1, p3);
        Line2D.Double horiz2 = new Line2D.Double(p5, p6);
        Line2D.Double horiz3 = new Line2D.Double(p2, p4);

        g2.draw(vert);
        g2.draw(horiz1);
        g2.draw(horiz2);
        g2.draw(horiz3);
    }
}
