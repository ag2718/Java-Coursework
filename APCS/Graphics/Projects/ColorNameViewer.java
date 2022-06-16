import javax.swing.JFrame;

public class ColorNameViewer
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setTitle("Colored Strings!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new ColorNameComponent());

        frame.setVisible(true);
    }
}
