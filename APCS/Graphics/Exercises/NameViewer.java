import javax.swing.*;

public class NameViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(150, 250);
      frame.setTitle("Display name!");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      NameComponent component = new NameComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
