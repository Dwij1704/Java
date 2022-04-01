
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class prac_4 extends Applet implements ActionListener{
    Button btn_area;
    Label lbl_n1,lbl_n2;
    TextField txt_n1,txt_n2;

    public void init(){
        btn_area= new Button("Area");
        lbl_n1= new Label("Enter The Area");
        lbl_n2=new Label("Area Is Equal To");
        txt_n1=new TextField(10);
        txt_n2=new TextField(10);
        
        txt_n2.setEditable(false);

        add(lbl_n1);
        add(txt_n1);
        add(lbl_n2);
        add(txt_n2);
        add(btn_area);
        btn_area.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ob){
	double a=3.14;
	double b,area;
       	if(ob.getSource()==btn_area){
 		b=Double.parseDouble(txt_n1.getText());
  		area=a*b*b;
		txt_n2.setText(""+area);
	}
    }
}
//<applet code="prac_4" height=500 width=500></applet>
