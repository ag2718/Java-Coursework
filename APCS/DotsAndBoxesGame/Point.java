public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        x = first;
        y = second;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Point other) {
        return this.x == other.x && this.y == other.y;
    }

    public int compareTo(Point other) {
        return this.x - other.x + this.y - other.y;
    }

}
