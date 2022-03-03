import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class on_off extends Applet implements ActionListener
{
    Button b1;
    int flag=0;
    public void init() 
    {
       b1= new Button("Start");
       add(b1);
       b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
   
        if(b1.getLabel()=="Start"){
            b1.setLabel("Stop");
        }
        else if(b1.getLabel()=="Stop"){
            b1.setLabel("Start");
        }
    }
        
    }   
// <applet code="on_off" width=600 height=600></applet>