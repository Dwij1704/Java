import java.awt.*;
import java.awt.event.*;
 
public class prac_3 implements ActionListener{
Frame f;
Label l1;
TextField t1;
Button b1,b2,b3;
prac_3(){
    f= new Frame("Happy New Year");
    l1=new Label("Output");
      l1.setBounds(50,100,100,20);
    t1=new TextField();
      t1.setBounds(200,100,100,20);
    b1=new Button("Year");
    b2=new Button("Millenium");
    b3=new Button("Exit");
    b1.setBounds(50,250,50,20);
    b2.setBounds(110,250,50,20);
    b3.setBounds(170,250,50,20);

    f.add(l1);
    f.add(t1);
    f.add(b1);
    f.add(b2);
    f.add(b3);

    f.setLayout(null);
    f.setVisible(true);
    f.setSize(400,350);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
}
public void actionPerformed(ActionEvent jodd){ 
                   
if(jodd.getSource()==b1){
 
  t1.setText("Happy New Year");
}
if(jodd.getSource()==b2){
 
  t1.setText("Millenium");
}
if(jodd.getSource()==b3)
{
System.exit(0);
}
}
public static void main(String args[])
{
new prac_3();
}
}
