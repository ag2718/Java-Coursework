import javax.swing.JFrame;

public class TargetViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(250, 250);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new TargetComponent());

        frame.setVisible(true);
    }
}
