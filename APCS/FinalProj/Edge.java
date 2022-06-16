public class Edge {

    private Point first;
    private Point second;
    private boolean player;

    public Edge(Point f, Point s, boolean p) {
        first = f;
        second = s;
        player = p;
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    public boolean isHoriz() {
        return first.getY() == second.getY();
    }

    public boolean equals(Edge other) {
        return this.first.equals(other.first) && this.second.equals(other.second);
    }

}
