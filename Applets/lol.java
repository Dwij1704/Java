import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

public class lol extends Applet implements MouseListener
{
    TextField t1;
    int x,y;
    public void init() 
    {
        t1 = new TextField(20);
        add(t1);
        
        this.addMouseListener(this);

    }
   
    public void mousePressed(MouseEvent ob) {
        
        t1.setText("mujhe choddd na Bhai");
        
    }
  
    public void mouseReleased(MouseEvent ob) {
       
        t1.setText("mujhe daba na Bhai");
    }
   
    public void mouseEntered(MouseEvent ob) {
        t1.setText("bahar jaa na Bhai");
        
    }
  
    public void mouseExited(MouseEvent ob) {
        t1.setText("andar aa na Bhai");
        
    }
}
//<applet code="lol" width=500 height=500></applet>