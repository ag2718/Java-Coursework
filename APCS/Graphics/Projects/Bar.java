import java.awt.Rectangle;
import java.awt.Graphics2D;

/**
 * This class describes a bar in a bar chart
 */
public class Bar {
    private int top;
    private int width;
    private String title;

    /**
     * Constructs a bar.
     * 
     * @param aTop   the top of the bar
     * @param aWidth the width of the bar
     * @param aTitle the title for the bar
     */
    public Bar(int aTop, int aWidth, String aTitle) {
        this.top = aTop;
        this.width = aWidth;
        this.title = aTitle;
    }

    /**
     * Draws the bar.
     * 
     * @param g2 the graphic context
     */
    public void draw(Graphics2D g2) {
        g2.fill(new Rectangle(20, this.top, this.width, 20));
        g2.drawString(this.title, 40 + this.width, this.top + 20);
    }
}
