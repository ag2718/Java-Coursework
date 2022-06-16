package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JPanel panel = new JPanel();
    private XOButtons[] buttons = new XOButtons[16];

    private int turn = 0;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        XOButtons source = (XOButtons)actionEvent.getSource();
        if (turn == 0) {
            source.toggleX();
            setTitle("O's Turn");
        } else if (turn == 1) {
            source.toggleO();
            setTitle("Star's Turn");
        } else if (turn == 2) {
            source.toggleStar();
            setTitle("X's turn");
        }

        turn = (turn + 1) % 3;

    }

    public static void main(String[] args) {
        new TicTacToe();
    }

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(800, 800);
        setLocation(100, 100);
        getContentPane().setBackground(Color.CYAN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        panel.setLayout(new GridLayout(4, 4, 5, 5));
        panel.setBackground(Color.BLACK);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new XOButtons();
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        add(panel);
        setVisible(true);
    }

}
