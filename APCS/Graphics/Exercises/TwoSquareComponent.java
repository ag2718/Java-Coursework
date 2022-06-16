import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class TwoSquareComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;

      // Construct two squares with the same center
      Rectangle square1 = new Rectangle(20, 20, 10, 10);
      Rectangle square2 = new Rectangle(10, 10, 30, 30);

      g2.draw(square1);
      g2.draw(square2);
   }
}

