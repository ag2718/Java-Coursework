import javax.swing.JFrame;

public class VViewer
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(150, 150);
        frame.setTitle("V");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new VComponent());

        frame.setVisible(true);
    }
}
