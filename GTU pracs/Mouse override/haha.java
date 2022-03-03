import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class haha extends Applet implements MouseListener{
    Label l1;
    
    public void init()
    {
        l1 = new Label("No Action");
        l1.setSize(100,20);
        add(l1);
        addMouseListener(this);
    }


    public void mouseClicked(MouseEvent e) {
        
    }


    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed");
        repaint();
        
    }


    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released");
      repaint();
        
    }


    public void mouseEntered(MouseEvent e) {
        
    }


    public void mouseExited(MouseEvent e) {
        
    }
    

}
//<applet code="haha.java" height="500" width="500"></applet>