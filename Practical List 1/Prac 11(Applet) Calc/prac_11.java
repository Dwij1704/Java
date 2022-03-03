
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class prac_11 extends Applet implements ActionListener{
   // Button btn_add;
    Label lbl_n2,lbl_n1;
    TextField txt_n1,txt_n2,txt_ans;
    Button b1,b2,b3,b4;

    public void init(){

        lbl_n1= new Label("Enter 1st Number:");
        lbl_n2=new Label("Enter 2nd Number:");

        txt_n1=new TextField(10);
        txt_ans=new TextField(10);
        txt_n2=new TextField(10);
        
        txt_ans.setEditable(false);

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Div");
        b4 = new Button("Mul");
       
        add(b1);
        add(b1);
        add(b1);
        add(b4);
        add(lbl_n1);
        add(txt_n1);
        add(lbl_n2);
        add(txt_n2);
        add(txt_ans);

        max.addItemListener(this);
        min.addItemListener(this);
        max.addItemListener(this);
        min.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ob){

        int n1,n2,n3,ans;
        ans=0;
        n1= Integer.parseInt(txt_n1.getText());
        n2= Integer.parseInt(txt_n2.getText());
        n3= Integer.parseInt(txt_n3.getText());
       if(max.getState())
       {
        if(n1>n2){
            if(n1>n3)
            {
                ans= n1;
            }
            else
            {
                 ans= n3;
            }
        }

        else if(n2>n3){
            ans= n2;
        } 
       else{
           ans=n3;
       }
        txt_ans.setText(""+ans);
    }

    if(min.getState())
    {
     if(n1<n2){
         if(n1<n3)
         {
             ans= n1;
         }
         else
         {
              ans= n3;
         }
     }

     else if(n2<n3){
         ans= n2;
     } 
    else{
        ans=n3;
    }
     txt_ans.setText(""+ans);
 }
    }   
}
//<applet code="prac_11" height=500 width=500></applet>
