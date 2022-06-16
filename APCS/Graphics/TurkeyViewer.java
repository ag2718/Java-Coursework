import javax.swing.JFrame;

public class TurkeyViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(250, 250);
        frame.setTitle("Turkey");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new TurkeyComponent());
        frame.setVisible(true);
    }
}
