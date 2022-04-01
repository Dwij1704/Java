import java.awt.*;  
import java.awt.event.*;  
class JoddCalc implements ActionListener{ 
  Frame f; 
Label l1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
Button badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback;
double xd;
double num1,num2,check;

JoddCalc(){  
  f= new Frame("Jodd Nu Calculator");

l1=new Label(); 
l1.setBounds(50,50,260,60);


b1=new Button("1");
  b1.setBounds(50,340,50,50);
b2=new Button("2");
  b2.setBounds(120,340,50,50);
b3=new Button("3");
  b3.setBounds(190,340,50,50);
b4=new Button("4");
  b4.setBounds(50,270,50,50);
b5=new Button("5");
  b5.setBounds(120,270,50,50); 
b6=new Button("6");
  b6.setBounds(190,270,50,50);
b7=new Button("7");
  b7.setBounds(50,200,50,50);
b8=new Button("8");
  b8.setBounds(120,200,50,50);
b9=new Button("9");
  b9.setBounds(190,200,50,50);
b0=new Button("0");
  b0.setBounds(120,410,50,50);
bneg=new Button("+/-");
  bneg.setBounds(50,410,50,50);
bpts=new Button(".");
  bpts.setBounds(190,410,50,50);
bback=new Button("back");
 bback.setBounds(120,130,50,50);

badd=new Button("+");
  badd.setBounds(260,340,50,50);
bsub=new Button("-");
  bsub.setBounds(260,270,50,50);
bmult=new Button("*");
  bmult.setBounds(260,200,50,50);
bdiv=new Button("/");
  bdiv.setBounds(260,130,50,50);
bmod=new Button("%");
  bmod.setBounds(190,130,50,50);
bcalc=new Button("=");
  bcalc.setBounds(245,410,65,50);
bclr=new Button("CE"); 
  bclr.setBounds(50,130,65,50);


b1.addActionListener(this); 
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this); 
b6.addActionListener(this); 
b7.addActionListener(this); 
b8.addActionListener(this); 
b9.addActionListener(this);  
b0.addActionListener(this);

bpts.addActionListener(this);  
bneg.addActionListener(this);
bback.addActionListener(this); 

badd.addActionListener(this);
bsub.addActionListener(this);
bmult.addActionListener(this);
bdiv.addActionListener(this);
bmod.addActionListener(this);
bcalc.addActionListener(this);
bclr.addActionListener(this); 

 
f.add(l1);  
f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);f.add(b6); f.add(b7); f.add(b8);f.add(b9);f.add(b0);

f.add(badd); f.add(bsub); f.add(bmod); f.add(bmult); f.add(bdiv); f.add(bmod);f.add(bcalc);

f.add(bclr); f.add(bpts);f.add(bneg); f.add(bback);

f.setSize(360,500);  
f.setLayout(null);  
f.setVisible(true);  
} 


public void actionPerformed(ActionEvent jodd){ 
  String a,b;
                        
if(jodd.getSource()==b1){
 b=l1.getText();
  a=b+"1";
  l1.setText(a);
}
if(jodd.getSource()==b2){
b=l1.getText();
a=b+"2";
l1.setText(a);
}
if(jodd.getSource()==b3){
  b=l1.getText();
  a=b+"3";
  l1.setText(a);
}
if(jodd.getSource()==b4){
  b=l1.getText();
  a=b+"4";
  l1.setText(a);
}
if(jodd.getSource()==b5){
  b=l1.getText();
  a=b+"5";
  l1.setText(a);
}
if(jodd.getSource()==b6){
  b=l1.getText();
  a=b+"6";
  l1.setText(a);
}
if(jodd.getSource()==b7){
  b=l1.getText();
  a=b+"7";
  l1.setText(a);
}
if(jodd.getSource()==b8){
  b=l1.getText();
  a=b+"8";
  l1.setText(a);
}
if(jodd.getSource()==b9){
  b=l1.getText();
  a=b+"9";
  l1.setText(a);
}
if(jodd.getSource()==b0){
  b=l1.getText();
  a=b+"0";
  l1.setText(a);
}

if(jodd.getSource()==bpts){  
  b=l1.getText();
  a=b+".";
  l1.setText(a);
}
if(jodd.getSource()==bneg){ 
  b=l1.getText();
  a="-"+b;
  l1.setText(a);
}

if(jodd.getSource()==bback){  
  b=l1.getText();
  try{
    a=b.substring(0, b.length()-1);
    }catch(StringIndexOutOfBoundsException f){return;}
  l1.setText(a);
}
               
if(jodd.getSource()==badd){                     
  
    num1=Double.parseDouble(l1.getText());
  
  a="";
  l1.setText(a);
  check=1;
}
if(jodd.getSource()==bsub){                    
  
    num1=Double.parseDouble(l1.getText());
    
  a="";
  l1.setText(a);
  check=2;
}
if(jodd.getSource()==bmult){                  
  
    num1=Double.parseDouble(l1.getText());
    
  a="";
  l1.setText(a);
  check=3;
}
if(jodd.getSource()==bdiv){                  
 
    num1=Double.parseDouble(l1.getText());
   
  a="";
  l1.setText(a);
  check=4;
}
if(jodd.getSource()==bmod){           
  
    num1=Double.parseDouble(l1.getText());
  
  a="";
  l1.setText(a);
  check=5;
}
                      
if(jodd.getSource()==bcalc){          
 
    num2=Double.parseDouble(l1.getText());
  
  if(check==1)
    xd =num1+num2;
  if(check==2)
    xd =num1-num2;
  if(check==3)
    xd =num1*num2;
  if(check==4)
    xd =num1/num2; 
  if(check==5)
    xd =num1%num2;    
  l1.setText(""+xd);
}
                       
if(jodd.getSource()==bclr){
  num1=0;
  num2=0;
  check=0;
  xd=0;
   a="";
   l1.setText(a);
   } 

}  

 public static void main(String args[]){  
       new JoddCalc();  
   }
} 