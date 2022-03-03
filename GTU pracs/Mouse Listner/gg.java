import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

public class gg extends Applet implements MouseMotionListener
{
    
    int x,y,n=0;
    public void init() 
    {
       
        
        this.addMouseMotionListener(this);

    }
    public void mouseMoved(MouseEvent ob) 
    {
      
        x=ob.getX();
        y=ob.getY();
        n=1;
        repaint();
    }
    
    public void mouseDragged(MouseEvent ob) {
        
        x=ob.getX();
        y=ob.getY();
        n=2;
        repaint();
    }
    public void paint(Graphics g) 
    {
        if(n!=0)
        {
            if(n==1){
                g.fillRect(x, y, 10, 10);;
                g.drawRect(x,y,10,10);
                g.drawString("x="+x+" Y="+y, 10, 10); 
            }
            else if(n==2){
                g.fillRect(x, y, 10, 10);;
                g.drawRect(x,y,10,10);
                g.drawString("x="+x+" Y="+y, 10, 30); 
            }
        }
    }
}    
// <applet code="gg" width=600 height=600></applet>