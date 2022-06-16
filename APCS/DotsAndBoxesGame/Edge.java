public class Edge {

    private Point first;
    private Point second;
    private boolean player;

    public Edge(Point f, Point s, boolean p) {
        if (f.compareTo(s) < 0) {
            first = f;
            second = s;
        } else {
            first = s;
            second = f;
        }
        player = p;
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    public boolean getPlayer() {
        return player;
    }

    public boolean isHoriz() {
        return first.getY() == second.getY();
    }

    public boolean equals(Edge other) {
        return first.equals(other.first) && second.equals(other.second);
    }

}
