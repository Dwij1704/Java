import java.awt.*;
import java.awt.event.*;
 
public class prac_9 implements ItemListener{
Frame f;
Label l1;
Checkbox b1,b2,b3,b4,c1,c2,c3,c4,c5;
CheckboxGroup font;
CheckboxGroup colour;

prac_9(){
    f= new Frame("CheckBoxes In AWT");
    font= new CheckboxGroup();
    colour= new CheckboxGroup();
    l1=new Label();
      l1.setBounds(200,100,100,20);
    b1=new Checkbox("Times",false,font);
    b2=new Checkbox("Sarif",false,font);
    b3=new Checkbox("San Sarif",false,font);
    b4=new Checkbox("Roman",false,font);

    b1.setBounds(50,250,50,20);
    b2.setBounds(150,250,50,20);
    b3.setBounds(250,250,50,20);
    b4.setBounds(350,250,50,20);

    c1=new Checkbox("Green",false,colour);
    c2=new Checkbox("Red",false,colour);
    c3=new Checkbox("Yellow",false,colour);
    c4=new Checkbox("White",false,colour);
    c5=new Checkbox("Orange",false,colour);
    
    c1.setBounds(10,350,50,20);
    c2.setBounds(110,350,50,20);
    c3.setBounds(210,350,50,20);
    c4.setBounds(310,350,50,20);
    c5.setBounds(410,350,50,20);

    f.add(l1);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(c1);
    f.add(c2);
    f.add(c3);
    f.add(c4);
    f.add(c5);

    l1.setSize(500,20);
    b1.setSize(100,20);
    b2.setSize(100,20);
    b3.setSize(100,20);
    b4.setSize(100,20);
    
    c1.setSize(100,20);
    c2.setSize(100,20);
    c3.setSize(100,20);
    c4.setSize(100,20);
    c5.setSize(100,20);

    f.setLayout(null);
    f.setVisible(true);
    f.setSize(500,400);

    b1.addItemListener(this);
    b2.addItemListener(this);
    b3.addItemListener(this);
    b4.addItemListener(this);

    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);
    c4.addItemListener(this);
    c5.addItemListener(this);
}

public void itemStateChanged(ItemEvent jodd){          
    if(b1.getState()){
        l1.setText(font.getSelectedCheckbox().getLabel() +"  "+ colour.getSelectedCheckbox().getLabel());
    }
    if(b2.getState()){
        l1.setText(font.getSelectedCheckbox().getLabel() +"  "+ colour.getSelectedCheckbox().getLabel());
    }
    if(b3.getState()){
        l1.setText(font.getSelectedCheckbox().getLabel() +"  "+ colour.getSelectedCheckbox().getLabel());
    }
    if(b4.getState()){
        l1.setText(font.getSelectedCheckbox().getLabel() +"  "+ colour.getSelectedCheckbox().getLabel());
    }
    if(c1.getState()){
        l1.setText(font.getSelectedCheckbox().getLabel() +"  "+ colour.getSelectedCheckbox().getLabel());
    }
    if(c2.getState()){
        l1.setText(font.getSelectedCheckbox().getLabel() +"  "+ colour.getSelectedCheckbox().getLabel());
    }
    if(c3.getState()){
        l1.setText(font.getSelectedCheckbox().getLabel() +"  "+ colour.getSelectedCheckbox().getLabel());
    }
    if(c4.getState()){
        l1.setText(font.getSelectedCheckbox().getLabel() +"  "+ colour.getSelectedCheckbox().getLabel());
    }
    if(c5.getState()){
        l1.setText(font.getSelectedCheckbox().getLabel() +"  "+ colour.getSelectedCheckbox().getLabel());
    }
}
public static void main(String args[])
{
new prac_9();
    
}
}
