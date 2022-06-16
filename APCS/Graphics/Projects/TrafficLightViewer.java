import javax.swing.JFrame;

public class TrafficLightViewer
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(200, 500);
        frame.setTitle("Traffic Light");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new TrafficLightComponent());

        frame.setVisible(true);
    }
}
