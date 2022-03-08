import java.awt.*;
import java.applet.*;
//<applet code=prac_16.java width=950 height=600></applet>
public class prac_16 extends Applet{
public void paint(Graphics g){
    g.setFont(new Font("TimesRoman", Font.BOLD, 20));
    g.drawString("Expenditure", 190,70 );
    g.drawString("Income", 620, 70);
    g.setFont(new Font("TimesRoman", Font.PLAIN, 18));
    g.setColor(Color.red);
g.fillArc(100,100,300,300,0,75);
g.fillRect(50, 450, 10, 10);
g.setColor(Color.black);
g.drawString("- Salary=20%", 70, 460);

    g.setColor(Color.yellow);
g.fillArc(100,100,300,300,90,45);
g.fillRect(50, 480, 10, 10);
g.setColor(Color.black);
g.drawString("- Ads=12.5%", 70, 490);

    g.setColor(Color.blue);
g.fillArc(100,100,300,300,135,225);
g.fillRect(50, 540, 10, 10);
g.setColor(Color.black);
g.drawString("- Employee Salary=62.5%", 70, 550);

    g.setColor(Color.green);
g.fillArc(100,100,300,300,75,15);
g.fillRect(50, 510, 10, 10);
g.setColor(Color.black);
g.drawString("- Transport=4.16%", 70, 520);



g.setColor(Color.red);
g.fillArc(500,100,300,300,120,75);
g.fillRect(500, 450, 10, 10);
g.setColor(Color.black);
g.drawString("- Pencil= 20.8%", 520, 460);

    g.setColor(Color.yellow);
g.fillArc(500,100,300,300,90,30);
g.fillRect(500, 480, 10, 10);
g.setColor(Color.black);
g.drawString("- Lead= 8.33%", 520, 490);

    g.setColor(Color.blue);
g.fillArc(500,100,300,300,45,45);
g.fillRect(500, 540, 10, 10);
g.setColor(Color.black);
g.drawString("- Eraser=12.5%", 520, 550);

    g.setColor(Color.green);
g.fillArc(500,100,300,300,195,200);
g.fillRect(500, 510, 10, 10);
g.setColor(Color.black);
g.drawString("- Paper=61.1%", 520, 520);

g.setColor(Color.cyan);
g.fillArc(500,100,300,300,35,10);
g.fillRect(500, 570, 10, 10);
g.setColor(Color.black);
g.drawString("- Sharpner=4.16%", 520, 580);
 
}
}