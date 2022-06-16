import javax.swing.JFrame;

public class CircleViewer
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(150, 150);
        frame.setTitle("Circle, Square, and Name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new CircleComponent());

        frame.setVisible(true);
    }
}
