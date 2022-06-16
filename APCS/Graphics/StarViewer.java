import javax.swing.JFrame;

public class StarViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setTitle("Star Pattern with Lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new StarComponent());

        frame.setVisible(true);
    }
}
