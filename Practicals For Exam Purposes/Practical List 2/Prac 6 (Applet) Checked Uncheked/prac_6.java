
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class prac_6 extends Applet implements ItemListener{
   
    
    TextField txt_n1,txt_n2;
    Checkbox c1,c2;

    public void init(){
     
        c1= new Checkbox("COM",false);
        c2= new Checkbox("COBRA",false);
       
        txt_n1=new TextField(10);
        txt_n2=new TextField(10);
	txt_n1.setEditable(false);
	txt_n2.setEditable(false);
      	txt_n1.setText("Unchecked");
	txt_n2.setText("Unchecked");
       
        add(txt_n1);
        add(txt_n2);
        add(c1);
        add(c2);

        c1.addItemListener(this);
        c2.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ob){
	
	if(c1.getState())
       {
     		txt_n1.setText("Checked");
        }
	else
	txt_n1.setText("Unchecked");
	
	
	if(c2.getState())
       {
     		txt_n2.setText("Checked");
        }
	else
	txt_n2.setText("Unchecked");
	
    }   
}
//<applet code="prac_6" height=500 width=500></applet>
