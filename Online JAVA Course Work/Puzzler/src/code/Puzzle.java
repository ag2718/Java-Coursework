package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Puzzle extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JPanel panel = new JPanel();
    private JButton buttons[] = new JButton[9];
    private JButton lastClicked = null;

    private int[] correctOrder = {1, 6, 9, 2, 7, 4, 8, 3, 5};

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton source = (JButton)actionEvent.getSource();
        if (lastClicked == null) {
            lastClicked = source;
        } else {
            Icon lastIcon = lastClicked.getIcon();
            lastClicked.setIcon(source.getIcon());
            source.setIcon(lastIcon);
            lastClicked = null;
        }
        checkIfWon();
    }

    public void checkIfWon() {
        String iconString;
        for (int i = 0; i < buttons.length; i++) {
            iconString = buttons[i].getIcon().toString();
            if (!iconString.contains(correctOrder[i] + ".jpeg")) {
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "You Win!");
    }

    public static void main(String[] args) {
        new Puzzle();
    }

    public Puzzle() {
        setTitle("Puzzle");
        setSize(600, 620);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(3, 3, 5, 5));
        for (int i = 0; i < buttons.length; i++) {
            ImageIcon image = new ImageIcon(getClass().getResource((i+1)+".jpeg"));
            buttons[i] = new PuzzlerPieces(image);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }
        add(panel);
        setVisible(true);
    }


}
