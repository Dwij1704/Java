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


            g.setColor(Color.BLUE);
            g.drawLine(80, 325, 430,105);
            g.drawLine(410, 102, 435, 100);
            g.drawLine(435, 100, 423, 125);

            g.setColor(Color.RED);
            g.fillRect(100, 330, 20, 70);
            
            g.setColor(Color.BLACK);
            g.drawLine(110, 395, 110, 405);
            g.drawString("2015", 95, 415);


            g.setColor(Color.RED);
            g.fillRect(180, 280, 20, 120);

            g.setColor(Color.BLACK);
            g.drawLine(190, 395, 190, 405);
            g.drawString("2016", 175, 415);
            
            
            g.setColor(Color.RED);
            g.fillRect(260, 230, 20, 170);
            
            g.setColor(Color.BLACK);
            g.drawLine(270, 395, 270, 405);
            g.drawString("2017", 255, 415);
            

            g.setColor(Color.RED);
            g.fillRect(330, 180, 20, 220);
            
            g.setColor(Color.BLACK);
            g.drawLine(340, 395, 340, 405);
            g.drawString("2018", 325, 415);
            

            g.setColor(Color.RED);
            g.fillRect(410, 130, 20, 270);
            
            g.setColor(Color.BLACK);
            g.drawLine(420, 395, 420, 405);
            g.drawString("2019", 405, 415);


            g.setColor(Color.blue);
            g.drawString("10", 37, 344);
            g.drawLine(55, 340, 65, 340);
            
            g.drawLine(55, 280, 65, 280);
            g.drawString("20", 37, 284);
            
            g.drawLine(55, 220, 65, 220);
            g.drawString("30", 37, 224);
            
            g.drawLine(55, 160, 65, 160);
            g.drawString("40", 37, 164);
            
            g.drawLine(55, 100, 65, 100);
            g.drawString("50", 37, 104);

            g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
            g.drawString("Stonks", 150, 180);
            g.drawImage(pic,145,30,this);
    }
}
//<applet code="prac_15" height=500 width=500></applet>
