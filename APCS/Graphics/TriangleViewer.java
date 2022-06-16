import javax.swing.JFrame;

public class TriangleViewer
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(150, 150);
        frame.setTitle("Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new TriangleComponent());

        frame.setVisible(true);
    }
}
