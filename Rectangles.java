import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rectangles extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;

    g2d.setColor(new Color(136, 74, 57));            //rgb(136, 74, 57)
    g2d.fillRect(20, 40, 400, 400);


    g2d.setColor(new Color(31, 21, 1));
    g2d.fillRect(300, 295, 180, 120);

  }

  public static void main(String[] args) {
    Rectangles rects = new Rectangles();
    JFrame frame = new JFrame("Rectangles");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(rects);
    frame.setSize(360, 300);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
