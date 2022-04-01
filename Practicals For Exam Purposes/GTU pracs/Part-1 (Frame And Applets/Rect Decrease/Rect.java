import java.applet.Applet;
import java.awt.*;


public class Rect extends Applet {

 int x, y, h, w;

 public void init() {

  x = 10;
  y = 100;
  h = 300;
  w = 200;

 }

 public void paint(Graphics g) {


  for (int i = 0; i < 20; i++) {
   x = x + 5;
   y = y + 5;
   h = h - 10;
   w = w - 10;
   if (i % 2 == 0) {
    g.setColor(Color.black);
    g.fillRect(x, y, h, w);
   } else {
    g.setColor(Color.white);
    g.fillRect(x, y, h, w);
   }

  }

 }
}
//<applet code="Rect" height="500" width="500"></applet>
