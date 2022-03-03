
import java.applet.Applet;
import java.awt.*;

public class prac_10 extends Applet{

    public void paint(Graphics g){
            int x[]={225, 175, 175, 225, 275, 325, 325, 275};
            int y[]={10, 60, 110, 160, 160, 110, 60, 10};
            g.drawPolygon(x, y, 8);
    }
}
//<applet code="prac_10" height=500 width=500></applet>
