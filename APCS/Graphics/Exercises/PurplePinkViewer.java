import javax.swing.JFrame;

public class PurplePinkViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(150, 250);
        frame.setTitle("Purple and pink rectangles!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PurplePinkComponent component = new PurplePinkComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
