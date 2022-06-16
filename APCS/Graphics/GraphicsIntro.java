import java.awt.Color;
import javax.swing.JFrame;

public class GraphicsIntro
{
    public static void main(String[] args) {
        // E2.10
        Color color = new Color(50, 100, 150);
        Color brightColor = color.brighter();
        System.out.println(brightColor);

        // E2.11
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.getContentPane().setBackground(brightColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // E2.12
        JFrame frame2 = new JFrame();
        frame2.setSize(200, 200);
        frame2.getContentPane().setBackground(Color.RED.darker().darker());
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
    }
}
