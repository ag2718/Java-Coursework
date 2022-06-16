import java.util.ArrayList;

public class Board {

    private int size;

    private ArrayList<Edge> edges;
    private int[][] numSurroundingEdges;

    private boolean currTurn;
    private int firstScore;
    private int secondScore;

    public Board() {
        size = 5;
        numSurroundingEdges = new int[size - 1][size - 1];
    }

    public ArrayList<Box> addEdge(Edge e) {
        ArrayList<Box> filledBoxes = new ArrayList<Box>();
        edges.add(e);
        int x = e.getFirst().getX();
        int y = e.getFirst().getY();
        if (e.isHoriz()) {
            if (y > 0) {
                numSurroundingEdges[x][y - 1]++;
                if (numSurroundingEdges[x][y - 1] == 4) {
                    filledBoxes.add(new Box(new Point(x, y - 1), currTurn));
                }
            }
            if (y < numSurroundingEdges.length) {
                numSurroundingEdges[x][y]++;
                if (numSurroundingEdges[x][y] == 4) {
                    filledBoxes.add(new Box(new Point(x, y), currTurn));
                }
            }
        } else {
            if (x > 0) {
                numSurroundingEdges[x - 1][y]++;
                if (numSurroundingEdges[x - 1][y] == 4) {
                    filledBoxes.add(new Box(new Point(x - 1, y), currTurn));
                }
            }
            if (x < numSurroundingEdges.length) {
                numSurroundingEdges[x][y]++;
                if (numSurroundingEdges[x][y] == 4) {
                    filledBoxes.add(new Box(new Point(x, y), currTurn));
                }
            }
        }
        return filledBoxes;
    }

    public void flipTurn() {
        currTurn = !currTurn;
    }

    public boolean edgeExists(Edge e) {
        for (Edge edge : edges) {
            if (edge.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public boolean gameOver() {
        return edges.size() >= 2 * size * (size - 1);
    }

    public boolean winner() {
        return firstScore > secondScore;
    }

}
