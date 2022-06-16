import javax.swing.*;

public class BarChartViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(500, 400);
        frame.setTitle("BarChartViewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BarChartComponent component = new BarChartComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
