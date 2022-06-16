import javax.swing.JFrame;

public class StickFigureViewer
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Stick Figure");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new StickFigureComponent());

        frame.setVisible(true);
    }
}
