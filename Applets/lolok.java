
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class lolok extends Applet implements ActionListener{
    Button btn_add;
    Label lbl_n1,lbl_n2;
    TextField txt_n1,txt_n2,txt_ans;

    public void init(){
        btn_add= new Button("Add");
        lbl_n1= new Label("Enter First Name:");
        lbl_n2=new Label("Enter Last Name:");
        txt_n1=new TextField(10);
        txt_ans=new TextField(10);
        txt_n2=new TextField(10);
        
        txt_ans.setEditable(false);

        add(lbl_n1);
        add(txt_n1);
        add(lbl_n2);
        add(txt_n2);
        add(btn_add);
        add(txt_ans);
        btn_add.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ob){
        //int n1,n2,ans;

       // n1= Integer.parseInt(txt_n1.getText());
       // n2= Integer.parseInt(txt_n2.getText());
        
        
        //txt_ans.getText(txt_n1+txt_n2);
        String ans= txt_n1.getText()+" "+txt_n2.getText();
        txt_ans.setText(""+ans);
        txt_n1.setText("");
        txt_n2.setText("");
    }
}
//<applet code="lolok" height=500 width=500></applet>
