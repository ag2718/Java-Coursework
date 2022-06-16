import javax.swing.JFrame;

public class HouseViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Numerous Houses");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new HouseComponent());

        frame.setVisible(true);
    }
}
