
import java.applet.*;
import java.awt.*;

public class Smiley extends Applet {
	public void paint(Graphics g)
	{
        g.drawString("Thak Gaya Hu Vroo" ,100,55);
        g.drawString("Thak Gaya Hu Vroo" ,100,56);
        g.drawString("Match MVP Bante Bante", 100, 250);
        g.drawString("Match MVP Bante Bante", 100, 251);
      
        int x[]={177,180,170,177};
        int y[]={140,174,174,140};
        int n=4;
		g.drawOval(79, 69, 151, 151);
        g.setColor(Color.YELLOW);
        g.fillOval(80, 70, 150, 150);
		g.setColor(Color.BLACK);
        
		g.fillOval(120, 120, 15, 15);
		g.fillOval(170, 120, 15, 15);

        g.drawLine(177,140,170,174);
        g.drawLine(177,140,180,174);
        g.setColor(Color.BLACK);
		g.drawArc(130, 180, 50, 20, 180, 180);
        g.setColor(Color.blue);
        g.fillArc(170,168,10,10,0,-180);
        g.fillPolygon(x,y,n);
	}
}
//<applet code="Smiley" Width="1000" Height="1000"></applet>