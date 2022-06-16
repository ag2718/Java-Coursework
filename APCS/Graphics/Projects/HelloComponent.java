import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * A component that draws "HELLO".
 */
public class HelloComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        LetterH h = new LetterH(5, 5);
        h.draw(g2);

        LetterE e = new LetterE(40, 5);
        e.draw(g2);

        LetterL l1 = new LetterL(75, 5);
        l1.draw(g2);

        LetterL l2 = new LetterL(110, 5);
        l2.draw(g2);

        LetterO o = new LetterO(145, 5);
        o.draw(g2);
    }
}
