import java.applet.Applet;
import java.applet.*;
import java.awt.*;

public class prac_15 extends Applet{
    Image pic;  
    public void init()  
    {  
        pic = getImage(getDocumentBase(), "stonks.png");  
    }  
    public void paint(Graphics g){
            g.drawLine(60, 50, 60, 450);
            g.drawLine(48, 55, 60, 42);
            g.drawLine(60, 42, 70, 55);
            g.drawString("Sales", 0, 220);

            g.drawLine(10, 400, 480, 400);
            g.drawLine(475, 388, 488, 400);
            g.drawLine(488, 400, 475, 410);
            g.drawString("Time", 220,450);

            g.setColor(Color.RED);
            g.fillRect(100, 330, 20, 70);


            g.setColor(Color.BLUE);
            g.drawLine(80, 325, 430,105);
            g.drawLine(410, 102, 435, 100);
            g.drawLine(435, 100, 423, 125);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
            g.drawString("Stonks", 150, 180);
            g.drawImage(pic,150,30,this);
            g.setColor(Color.RED);
            g.fillRect(180, 280, 20, 120);
            
            
            g.setColor(Color.RED);
            g.fillRect(260, 230, 20, 170);
            
            g.setColor(Color.RED);
            g.fillRect(330, 180, 20, 220);
            
            g.setColor(Color.RED);
            g.fillRect(410, 130, 20, 270);
    }
}
//<applet code="prac_15" height=500 width=500></applet>
