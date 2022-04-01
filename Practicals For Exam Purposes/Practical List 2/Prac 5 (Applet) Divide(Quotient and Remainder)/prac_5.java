
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class prac_5 extends Applet implements ActionListener{
    Button btn;
    Label lbl_n1,lbl_n2,lbl_q,lbl_r;
    TextField txt_n1,txt_n2,txt_q,txt_r;

    public void init(){
        btn= new Button("/");
        lbl_n1= new Label("Enter 1st Number");
        lbl_n2=new Label("Enter 2nd Number");
	lbl_r=new Label("Remainder");
	lbl_q=new Label("Quotient");
        txt_n1=new TextField(10);
        txt_n2=new TextField(10);
        txt_q=new TextField(10);
	    txt_r=new TextField(10);
        txt_q.setEditable(false);
        txt_r.setEditable(false);

        add(lbl_n1);
        add(txt_n1);
        add(lbl_n2);
        add(txt_n2);
        add(btn);
	add(lbl_q);
	add(txt_q);
 	add(lbl_r);
	add(txt_r);
	
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ob){
	
	int a,b,x,q,r;
	a=Integer.parseInt(txt_n1.getText());
	b=Integer.parseInt(txt_n2.getText());
       	if(ob.getSource()==btn){
 		
  		q=a/b;
		txt_q.setText(""+q);
		x=b*q;
		r=a-x;
		txt_r.setText(""+r);
	}
    }
}
//<applet code="prac_5" height=500 width=500></applet>
