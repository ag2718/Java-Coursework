package code;

import javax.swing.*;

public class XOButtons extends JButton {

    private static final long serialVersionUID = 1L;

    private ImageIcon xIcon = new ImageIcon(getClass().getResource("X.png"));
    private ImageIcon oIcon = new ImageIcon(getClass().getResource("O.png"));
    private ImageIcon starIcon = new ImageIcon(getClass().getResource("Star.png"));

    public void toggleX() {
        if(getIcon() == null) {
            setIcon(xIcon);
        } else {
            setIcon(null);
        }
    }

    public void toggleO() {
        if(getIcon() == null) {
            setIcon(oIcon);
        } else {
            setIcon(null);
        }
    }

    public void toggleStar() {
        if (getIcon() == null) {
            setIcon(starIcon);
        } else {
            setIcon(null);
        }
    }

}
