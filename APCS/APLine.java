/**
 * A class that constructs a line of the form ax + by + c = 0
 */

public class APLine {

    private int a;
    private int b;
    private int c;

    /**
     * Constructor for the APLine class
     * 
     * @param a value of a in the equation
     * @param b value of b in the equation
     * @param c value of c in the equation
     */
    public APLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Returns the slope of the line
     */
    public double getSlope() {
        return -((double) a) / b;
    }

    /**
     * Checks whether a point is on the line
     * 
     * @param x x-value of the point
     * @param y y-value of the point
     */
    public boolean isOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }

}
