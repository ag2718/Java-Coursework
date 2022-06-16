import javax.swing.JFrame;

/**
 * A frame that shows the letters HELLO, drawn from lines and an ellipse.
 */
public class HelloViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(200, 100);
        frame.setTitle("HELLO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HelloComponent component = new HelloComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
