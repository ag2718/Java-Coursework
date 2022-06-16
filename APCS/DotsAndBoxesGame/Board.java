import java.util.ArrayList;

public class Board {

    private int size;

    private ArrayList<Edge> edges;
    private ArrayList<Box> filledBoxes;

    private int[][] numSurroundingEdges;

    private boolean currTurn = true;
    private int firstScore;
    private int secondScore;

    public Board(int s) {
        size = s;
        numSurroundingEdges = new int[s - 1][s - 1];
        edges = new ArrayList<Edge>();
        filledBoxes = new ArrayList<Box>();
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public ArrayList<Box> getFilledBoxes() {
        return filledBoxes;
    }

    public void addEdge(Edge e) {
        int numAdded = 0;
        edges.add(e);
        int x = e.getFirst().getX();
        int y = e.getFirst().getY();
        if (e.isHoriz()) {
            if (y > 0) {
                numSurroundingEdges[x][y - 1]++;
                if (numSurroundingEdges[x][y - 1] == 4) {
                    filledBoxes.add(new Box(new Point(x, y - 1), currTurn));
                    numAdded++;
                }
            }
            if (y < numSurroundingEdges.length) {
                numSurroundingEdges[x][y]++;
                if (numSurroundingEdges[x][y] == 4) {
                    filledBoxes.add(new Box(new Point(x, y), currTurn));
                    numAdded++;
                }
            }
        } else {
            if (x > 0) {
                numSurroundingEdges[x - 1][y]++;
                if (numSurroundingEdges[x - 1][y] == 4) {
                    filledBoxes.add(new Box(new Point(x - 1, y), currTurn));
                    numAdded++;
                }
            }
            if (x < numSurroundingEdges.length) {
                numSurroundingEdges[x][y]++;
                if (numSurroundingEdges[x][y] == 4) {
                    filledBoxes.add(new Box(new Point(x, y), currTurn));
                    numAdded++;
                }
            }
        }
        if (numAdded == 0) {
            currTurn = !currTurn;
        } else {
            if (currTurn)
                firstScore += numAdded;
            else
                secondScore += numAdded;
        }
    }

    public int getPlayer1Score() {
        return firstScore;
    }

    public int getPlayer2Score() {
        return secondScore;
    }

    public boolean getTurn() {
        return currTurn;
    }

    public boolean isValid(Edge e) {

        for (Edge edge : edges) {
            if (edge.equals(e)) {
                return false;
            }
        }

        if (e.getFirst().getX() < 0 && e.getFirst().getX() >= size - 1)
            return false;

        if (e.getFirst().getY() < 0 && e.getFirst().getY() >= size - 1)
            return false;

        return (Math.abs(e.getFirst().getX() - e.getSecond().getX())
                + Math.abs(e.getFirst().getY() - e.getSecond().getY()) == 1);

    }

    public boolean gameOver() {
        return edges.size() >= 2 * size * (size - 1);
    }

    public boolean winner() {
        return firstScore > secondScore;
    }

}
