
import java.applet.*;
import java.awt.event.*;
import java.awt.*;


public class button_colour extends Applet implements ActionListener
{
    Button b1;
    int flag=0;
    public void init() 
    {
       b1= new Button("Hehe Boii");
       setBackground(Color.RED);
       add(b1);
       b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
   
        if(getBackground()==Color.RED){
            setBackground(Color.GREEN);
        }
        else if(getBackground()==Color.GREEN){
            setBackground(Color.BLUE);
        }
        else if(getBackground()==Color.BLUE){
            setBackground(Color.RED);
        }
    }
        
    }   
// <applet code="button_colour" width=600 height=600></applet>