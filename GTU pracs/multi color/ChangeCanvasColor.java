import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeCanvasColor extends Applet implements ItemListener
{
  Checkbox jCbRed, jCbBlue, jCbGreen;
  Canvas c=new Canvas();
 
  public void init(){

    setLayout(new FlowLayout());
    c.setSize(100,100);
    add(c);

    jCbRed=new Checkbox("Red");
    jCbGreen=new Checkbox("Green");
    jCbBlue=new Checkbox("Blue");

    jCbRed.addItemListener(this);
    jCbGreen.addItemListener(this);
    jCbBlue.addItemListener(this);

    add(jCbRed);
    add(jCbGreen);
    add(jCbBlue);
  }

  
  public void itemStateChanged(ItemEvent ie)
  {
    int r=0,g=0,b=0;
    if(jCbRed.getState())
    {
      r=255;
      c.setBackground(new Color(r,g,b));
    }
    else if(!jCbRed.getState()){
      r=0;
      c.setBackground(new Color(r,g,b));
    }

    if(jCbGreen.getState())
    {
      g=255;
      c.setBackground(new Color(r,g,b));
    }
    else if(!jCbGreen.getState()){
      g=0;
      c.setBackground(new Color(r,g,b));
    }

    if(jCbBlue.getState())
    {
      b=255;
      c.setBackground(new Color(r,g,b));
    }
    else if(!jCbBlue.getState()){
      b=0;
      c.setBackground(new Color(r,g,b));
    }


  }


  
}
//<applet code="ChangeCanvasColor" width="500" Height="500"></applet>
