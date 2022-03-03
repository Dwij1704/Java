import java.awt.*;
import java.awt.event.*;
 
public class prac_10 implements ItemListener{
Frame f;
Label l1,l2;
Checkbox b1,b2,b3,c1,c2,c3,c4;


prac_10(){
    f= new Frame("Panels And ScrollBars");
        Panel panel1=new Panel();  
            panel1.setLayout(new BorderLayout());
                panel1.setBounds(6,30,50,500);    
                panel1.setBackground(Color.gray);

                        Scrollbar ranger = new Scrollbar(Scrollbar.VERTICAL);
                        
                panel1.add(ranger,BorderLayout.WEST);       
                                
           
        Panel panel2=new Panel();  

                panel2.setBounds(50,30,400,50);    
                panel2.setBackground(Color.yellow);
                CheckboxGroup options;
                options= new CheckboxGroup();
                l2=new Label("OOP are-");
                c1=new Checkbox("Pascal",false,options);
                c2=new Checkbox("Java",false,options);
                c3=new Checkbox("C",false,options);
                    c1.setSize(100,20);
                    c2.setSize(100,20);
                    c3.setSize(100,20);
                panel2.add(l2);
                panel2.add(c2);
                panel2.add(c1);
                panel2.add(c3);
        
         Panel panel3=new Panel();
         panel3.setLayout(new BorderLayout());  
                panel3.setBounds(50,445,400,50);    
                panel3.setBackground(Color.red);  
                        Scrollbar red_ranger = new Scrollbar(0);
                        red_ranger.setSize(300,20);      
                                 
                panel3.add(red_ranger,BorderLayout.SOUTH);    

        Panel panel5=new Panel();  
                panel5.setBounds(50,75,400,445);    
                panel5.setBackground(Color.green);

                l1=new Label("Favourite Teacher-");
                b1=new Checkbox("Paresh Sir",false);
                b2=new Checkbox("Jiten Sir",false);
                b3=new Checkbox("Sunil Sir",false);
                    b1.setSize(100,20);
                    b2.setSize(100,20);
                    b3.setSize(100,20);
                    panel5.add(l1,BorderLayout.CENTER);
                    panel5.add(b2,BorderLayout.CENTER);
                    panel5.add(b1,BorderLayout.CENTER);
                    panel5.add(b3,BorderLayout.CENTER);
    
    f.add(panel1);
    f.add(panel2);
    f.add(panel3);
    f.add(panel5);
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(460,500);

}

public void itemStateChanged(ItemEvent jodd){          
   
}
public static void main(String args[])
{
new prac_10();
    
}
}
