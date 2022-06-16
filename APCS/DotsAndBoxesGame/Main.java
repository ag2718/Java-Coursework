import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Dots and Boxes");
        frame.setSize(800, 800);

        Grid component = new Grid();

        frame.add(component);

        frame.setVisible(true);

        System.out.println(
                "Visit https://www.yourturnmyturn.com/rules/dotsandboxes.php to learn the rules for how to play Dots and Boxes. Instead of drawing edges, players will enter the coordinates of their desired edge into the console when prompted to do so. When inputting x and y values for edges, note that the top-leftmost point corresponds to (0, 0). The game will be complete when the entire grid is filled up and all possible edges are connected.\n");

        while (!component.getBoard().gameOver()) {
            component.getInputEdge();
            frame.repaint();
        }

        System.out.println("\nGame over: Player " + ((component.getBoard().winner()) ? "1" : "2") + " wins!");

    }

}
