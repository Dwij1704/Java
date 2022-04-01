import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
 
public class prac_7 implements ItemListener{
Frame f;
Label l1;
TextField t1;
Checkbox b1,b2,b3,b4;
CheckboxGroup method;

prac_7(){
    f= new Frame("Time And Date");
    method= new CheckboxGroup();
    l1=new Label("Time And Date-");
        l1.setBounds(50,100,100,20);
 
    t1=new TextField(50);
      t1.setBounds(200,100,100,20);
    b1=new Checkbox("Groceries",false,method);
    b2=new Checkbox("Cosmetics",false,method);
    b3=new Checkbox("Plastics",false,method);
    b4=new Checkbox("Stationary",false,method);
    
    b1.setBounds(50,250,50,20);
    b2.setBounds(150,250,50,20);
    b3.setBounds(250,250,50,20);
    b4.setBounds(350,250,50,20);
 
    
    f.add(l1);
    f.add(t1);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    t1.setSize(200,20);
    b1.setSize(100,20);
    b2.setSize(100,20);
    b3.setSize(100,20);
    b4.setSize(100,20);
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(500,500);

    b1.addItemListener(this);
    b2.addItemListener(this);
    b3.addItemListener(this);
    b4.addItemListener(this);
}

public void itemStateChanged(ItemEvent jodd){ 
                   
    if(b1.getState()){
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss  dd/MM/yyyy ");
    Calendar cal = Calendar.getInstance();
    t1.setText("Groceries  "+dateFormat.format(cal.getTime()));
    }
    if(b2.getState()){
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss  dd/MM/yyyy ");
    Calendar cal = Calendar.getInstance();
    t1.setText("Cosmetics  "+dateFormat.format(cal.getTime()));
    }
    if(b3.getState()){
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss  dd/MM/yyyy ");
    Calendar cal = Calendar.getInstance();
    t1.setText("Plastics  "+dateFormat.format(cal.getTime()));
    }
    if(b4.getState()){
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy ");
    Calendar cal = Calendar.getInstance();
    t1.setText("Stationary  "+dateFormat.format(cal.getTime()));
    }
}
public static void main(String args[])
{
new prac_7();
    
}
}
