import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Dots and Boxes");

        JLabel title = new JLabel("Turn: Player 1");
        title.setBounds(250, 30, 100, 20);

        frame.add(title);

        JLabel player1score = new JLabel("Player 1: 0");
        player1score.setBounds(100, 500, 100, 30);

        JLabel player2score = new JLabel("Player 2: 0");
        player2score.setBounds(400, 500, 100, 30);

        frame.add(player1score);
        frame.add(player2score);

        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
