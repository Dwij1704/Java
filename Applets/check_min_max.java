
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class check_min_max extends Applet implements ItemListener/*,ActionListener*/{
   // Button btn_add;
    Label lbl,lbl_n1,lbl_n2,lbl_n3;
    TextField txt_n1,txt_n2,txt_n3,txt_ans;
    Checkbox min,max;
    CheckboxGroup method;

    public void init(){
       // btn_add= new Button("Get Result");
        lbl=new Label("Select one");
        method= new CheckboxGroup();
        max= new Checkbox("Maximum",false,method);
        min= new Checkbox("Minimum",false,method);
        lbl_n1= new Label("Enter 1st Number:");
        lbl_n2=new Label("Enter 2nd Number:");
        lbl_n3=new Label("Enter 3rd Number:");
        txt_n1=new TextField(10);
        txt_ans=new TextField(10);
        txt_n2=new TextField(10);
        txt_n3=new TextField(10);
        
        txt_ans.setEditable(false);
       
        add(lbl_n1);
        add(txt_n1);
        add(lbl_n2);
        add(txt_n2);
        add(lbl_n3);
        add(txt_n3);
        add(lbl);
        add(min);
        add(max);
        //add(btn_add);
        add(txt_ans);
        //btn_add.addItemListener(this);
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
//<applet code="check_min_max" height=500 width=500></applet>
