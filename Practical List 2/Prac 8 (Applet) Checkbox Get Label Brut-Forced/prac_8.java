import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class prac_8 extends Applet implements ItemListener{
   
    
    TextField txt_n1;
    Checkbox c1,c2,c3,c4;
    CheckboxGroup method;

    public void init(){
     
        method= new CheckboxGroup();
        c1= new Checkbox("Sandwich 1",false,method);
        c2= new Checkbox("Sandwich 2",false,method);
        c3= new Checkbox("Sandwich 3",false,method);
        c4= new Checkbox("Sandwich 4",false,method);
        txt_n1=new TextField(10);
	    txt_n1.setEditable(false);


       
        add(txt_n1);
        add(c1);
        add(c2);
        add(c3);
        add(c4);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ob){
	
	if(c1.getState())
       {
     		txt_n1.setText("Sandwich 1");
        }
	if(c2.getState())
       {
     		txt_n1.setText("Sandwich 2");
        }
	if(c3.getState())
       {
     		txt_n1.setText("Sandwich 3");
        }
	if(c4.getState())
       {
     		txt_n1.setText("Sandwich 4");
        }	
    }   
}
//<applet code="prac_8" height=150 width=100></applet>
