import javax.swing.JFrame;

public class FaceViewer
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setSize(150, 150);
        frame.setTitle("Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new FaceComponent());

        frame.setVisible(true);
    }
}
