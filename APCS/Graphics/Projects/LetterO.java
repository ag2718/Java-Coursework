import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;

/**
 * A letter O shape.
 */
public class LetterO {
    private double x;
    private double y;

    /**
     * Constructs a letter O at the given x and y coordinate.
     * 
     * @param anX the x-coordinate of the top left corner
     * @param anY the y-coordinate of the top left corner
     */
    public LetterO(double anX, double aY) {
        x = anX;
        y = aY;
    }

    /**
     * Draws the letter O.
     * 
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
        g2.draw(new Ellipse2D.Double(x, y, 30, 50));
    }
}
