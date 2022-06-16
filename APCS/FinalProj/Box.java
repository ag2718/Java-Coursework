public class Box {

    private Point point;
    private boolean player;

    public Box(Point first, boolean second) {
        point = first;
        player = second;
    }

    public Point getPt() {
        return point;
    }

    public boolean getPlayer() {
        return player;
    }

}
