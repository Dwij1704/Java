import java.applet.Applet;
import java.awt.*;


public class red_circle extends Applet{

    public void paint(Graphics g){
        int y=0;
        for(int i=0;i<10;i++){
            g.setColor(Color.red);
            g.drawOval(100,y,50,50);
            y= 50*i;
        }
    }
    }   
//<applet code="red_circle" height=1000 width=300></applet>
