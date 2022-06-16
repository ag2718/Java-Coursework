import javax.swing.JFrame;

public class OlympicRingViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setTitle("The Olympic Rings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new OlympicRingComponent());

        frame.setVisible(true);
    }
}
