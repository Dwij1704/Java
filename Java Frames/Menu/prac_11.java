import java.awt.*;
import java.awt.event.*;
public class prac_11 extends MenuItem implements ActionListener {
Frame f;
TextField t1;

prac_11(){
    f= new Frame("Menu Example");
    t1 = new TextField(20);
        t1.setBounds(80,200,100,20);
        t1.setSize(200,20);
    MenuBar mb = new MenuBar();
    Menu s1 = new Menu("SalesFile1");
        MenuItem i1=new MenuItem("Create");
        MenuItem i2=new MenuItem("Update");
        MenuItem i3=new MenuItem("Print");  
        s1.add(i1);
        s1.add(i2);
        s1.add(i3);
    Menu s2 = new Menu("SalesFile2");
        MenuItem i4=new MenuItem("Create");
        MenuItem i5=new MenuItem("Update");
        MenuItem i6=new MenuItem("Print");
        s2.add(i4);
        s2.add(i5);
        s2.add(i6);

    Menu s3 = new Menu("SalesFile3");
        MenuItem i7=new MenuItem("Create");
        MenuItem i8=new MenuItem("Update");
        MenuItem i9=new MenuItem("Print");
        s3.add(i7);
        s3.add(i8);
        s3.add(i9);
     
    mb.add(s1);
    mb.add(s2);
    mb.add(s3);
    f.add(t1);
    f.setMenuBar(mb);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
    s1.addActionListener(this);
    s2.addActionListener(this);
    s3.addActionListener(this);
    i1.addActionListener(this);
    i2.addActionListener(this);
    i3.addActionListener(this);
    i4.addActionListener(this);
    i5.addActionListener(this);
    i6.addActionListener(this);
    i7.addActionListener(this);
    i8.addActionListener(this);
    i9.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
    t1.setText("Item clicked: "+e.getActionCommand());
    }
public static void main(String args[])
{
new prac_11();
    
}

}
