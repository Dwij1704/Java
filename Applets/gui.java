import java.applet.*;
import java.awt.*;
public class gui extends Applet{
    TextField email;
    Button login;
    public void init(){
        email =new TextField(10);
        login = new Button("Login");

        email.setText("JNL@gmail.com");
    }
    public void start(){
        add(email);
        add(login);
    }
    public void paint (Graphics g){
        g.drawString(email.getText(), 50, 50);
    }
}
//<applet code="gui" height=500 width=500></applet>