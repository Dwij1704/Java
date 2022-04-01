import java.applet.*;
import java.awt.*;
/*
<applet code="left_right" width=500 height=500>
</applet>
*/
public class left_right extends Applet
{
    public void paint(Graphics g)
    {
            Dimension d=getSize(); 
            int x = d.width/2;  //250
            int y = d.height/2;  //250
            g.setColor(Color.green);
            g.drawRect(x-25,y-25,100,50); //x225 y225  w=100 h=50
            for(int i=100;i<200;i++)
            {
                try
                {
                    
                    Thread.sleep(3000);
                    g.fillRect(i+(x-125),y-25,5,50);  //200 y200,5 50
                }
                catch(Exception e){}
            }
    }
}