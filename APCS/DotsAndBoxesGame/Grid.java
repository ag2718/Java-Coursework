import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;
import java.util.Scanner;

public class Grid extends JComponent {

    private int size = 5;
    private Point[][] grid;
    private Board game;

    private Scanner input = new Scanner(System.in);

    public Grid() {
        game = new Board(size);
        grid = new Point[size][size];
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                grid[y][x] = new Point(x, size - y - 1);
            }
        }
    }

    public String getTurn() {
        return (game.getTurn()) ? "Player 1" : "Player 2";
    }

    public Board getBoard() {
        return game;
    }

    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        if (game.gameOver()) {
            g2.setFont(new Font("default", Font.BOLD, 20));
            g2.drawString("Game over: Player " + ((game.winner()) ? "1" : "2") + " wins!", 240, 80);
        } else {
            g2.drawString(getTurn() + "'s Turn", 315, 80);
        }

        g2.setColor(Color.BLACK);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Point p = grid[i][j];
                Ellipse2D.Double point = new Ellipse2D.Double(p.getX() * 100 + 150, p.getY() * 100 + 150, 10, 10);
                g2.fill(point);
            }
        }

        for (Edge e : game.getEdges()) {
            if (e.getPlayer()) {
                g2.setColor(Color.RED);
            } else {
                g2.setColor(Color.BLUE);
            }
            g2.draw(new Line2D.Double(e.getFirst().getX() * 100 + 155, e.getFirst().getY() * 100 + 155,
                    e.getSecond().getX() * 100 + 155, e.getSecond().getY() * 100 + 155));
        }

        for (Box b : game.getFilledBoxes()) {
            if (b.getPlayer()) {
                g2.setColor(Color.RED);
            } else {
                g2.setColor(Color.BLUE);
            }
            g2.fill(new Rectangle(b.getPt().getX() * 100 + 155, b.getPt().getY() * 100 + 155, 100, 100));
        }

        g2.setColor(Color.RED);
        g2.drawString("Player 1's Score", 120, 650);
        g2.drawString("" + game.getPlayer1Score(), 165, 680);

        g2.setColor(Color.BLUE);
        g2.drawString("Player 2's Score", 500, 650);
        g2.drawString("" + game.getPlayer2Score(), 545, 680);

    }

    public void getInputEdge() {

        System.out.println("\nNext edge (" + getTurn() + "):");

        System.out.print("X value of first point: ");
        int x1 = input.nextInt();

        System.out.print("Y value of first point: ");
        int y1 = input.nextInt();

        System.out.print("X value of second point: ");
        int x2 = input.nextInt();

        System.out.print("Y value of second point: ");
        int y2 = input.nextInt();

        Edge e = new Edge(new Point(x1, y1), new Point(x2, y2), game.getTurn());

        while (!game.isValid(e)) {

            System.out.println("\nYour inputted edge was not valid. Please try again.");

            System.out.print("X value of first point: ");
            x1 = input.nextInt();

            System.out.print("Y value of first point: ");
            y1 = input.nextInt();

            System.out.print("X value of second point: ");
            x2 = input.nextInt();

            System.out.print("Y value of second point: ");
            y2 = input.nextInt();

            e = new Edge(new Point(x1, y1), new Point(x2, y2), game.getTurn());

        }

        game.addEdge(e);

    }
}
