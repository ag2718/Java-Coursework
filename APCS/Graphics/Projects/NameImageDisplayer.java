import java.awt.Color;
import javax.swing.*;

public class NameImageDisplayer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(400, 400);

      JLabel imgLabel = new JLabel(new ImageIcon("Aarush.png"));
      imgLabel.setOpaque(true);
      imgLabel.setBackground(new Color(152, 251, 152));

      JLabel greetingLabel = new JLabel("Hello, Aarush!");
      greetingLabel.setOpaque(true);
      greetingLabel.setBackground(new Color(152, 251, 152));

      JPanel panel = new JPanel();
      panel.setBackground(new Color(152, 251, 152));
      panel.add(greetingLabel);
      panel.add(imgLabel);

      frame.add(panel);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);

   }
}
