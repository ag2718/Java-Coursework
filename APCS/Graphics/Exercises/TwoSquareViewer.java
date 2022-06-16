import javax.swing.*;

public class TwoSquareViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(100, 100);
      frame.setTitle("Two squares");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      TwoSquareComponent component = new TwoSquareComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}

