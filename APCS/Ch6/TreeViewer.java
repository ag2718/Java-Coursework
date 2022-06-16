import javax.swing.JFrame;

public class TreeViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 100);
        frame.setTitle("Christmas Tree!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new TreeComponent());

        frame.setVisible(true);
    }
}
