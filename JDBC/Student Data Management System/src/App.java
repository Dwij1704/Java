import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class App implements ActionListener  {
	static final String JDBC_DRIVER="com.mysql.jdbc.driver";
	static final String DB_URL="jdbc:mysql://localhost/";
	JFrame f;
    JCheckBox[] c = new JCheckBox[10];
    JCheckBox ok=new JCheckBox("hehe");
    JComboBox a1 = new JComboBox<>();
    JComboBox a2 = new JComboBox<>();
    JTextField t1,t2,t3,t4,t5,t6,t7;
    Label h1 = new Label("Standard");
    Label h2 = new Label("Division");
    Label h3 = new Label("Roll no:-");
    Label h4 = new Label("Student Name:-");
    Label h5 = new Label("Standard");
    Label h6 = new Label("Division:-");
    Label h7 = new Label("City:-");
    Label h8 = new Label("Phone:-");
    Label h9 = new Label("DOB:-");
    Label h10 = new Label("Input Data Of Students Below:-");
    Label h11 = new Label("");

    TextArea hehe = new TextArea("Data:-\n");
    JScrollPane sp = new JScrollPane(hehe);
    Button b6,b2,b3,b4,b5;


	static final String USER ="root";
	static final String PASS ="";

/////////////////////////////////////////////////////////////////////////////////////////////
	App(){
        f= new JFrame("Student Data Manager");
//Button:-
        b2=new Button("Update");
            b2.setBounds(50,100,50,30);
        b6=new Button("Logout");
            b6.setBounds(50,250,70,30); 
        
        b3=new Button("Show Students");
            b3.setBounds(50,150,100,30); 
        b4=new Button("Refresh");
            b4.setBounds(150,250,70,30); 
        b5=new Button("Input");
            b5.setBounds(970,250,70,30); 
//ChoiceLists:-
        a1.setBounds(70,10,50,20);
        a2.setBounds(200,10,50,20);
//TextFields:-
        t1=new JTextField();
            t1.setBounds(700,100,150,20);
        t2=new JTextField();
            t2.setBounds(700,150,150,20);
        t3=new JTextField();
            t3.setBounds(700,200,150,20);
        t4=new JTextField();
            t4.setBounds(700,250,150,20);
        t5=new JTextField();
            t5.setBounds(950,100,150,20);
        t6=new JTextField();
            t6.setBounds(950,150,150,20);
        t7=new JTextField();
            t7.setBounds(950,200,150,20);
//Labels:-
        h1.setBounds(10,10,60,20);
        h2.setBounds(130,10,60,20);

        h3.setBounds(610,100,100,20);
        h4.setBounds(610,150,100,20);
        h5.setBounds(610,200,100,20);
        h6.setBounds(610,250,100,20);
        h7.setBounds(890,100,100,20);
        h8.setBounds(890,150,100,20);
        h9.setBounds(890,200,100,20);
        h10.setBounds(750,10,300,30);
        h10.setFont(new Font("New Times Roman", Font.BOLD, 16));
        h11.setBounds(1000,1000,100,200);

        f.setVisible(true);
        f.setSize(1200,400);

        hehe.setBounds(300,10,300,300);
        f.add(hehe);

        f.add(a1);
        f.add(a2);

        f.add(b2);
        f.add(b3);
        f.add(b6);
        f.add(b4);
        f.add(b5);
        
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(t7);

        f.add(h1);
        f.add(h2);
        f.add(h4);
        f.add(h3);
        f.add(h5);
        f.add(h6);
        f.add(h7);
        f.add(h8);
        f.add(h9);
        f.add(h10);
        f.add(h11);

        b2.addActionListener(this);
        b3.addActionListener(this);
        b6.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        Connection conn = null;
            Statement stmt = null;
            
            String URL = "jdbc:mysql://localhost/att_stu";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();

                String sql = "SELECT DISTINCT Standard FROM user;";
                ResultSet rs = stmt.executeQuery(sql);                
                while(rs.next()){
                        a1.addItem(rs.getString("Standard"));
                       
                    }
            }
            
            catch(SQLException se) {
                se.printStackTrace();
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            finally{
                try {
                    if(stmt!=null)
                    stmt.close();
                }
                catch(SQLException se2) {

                }
                try {
                    if(conn!=null)
                    conn.close();
                }
                catch(SQLException se) {
                    se.printStackTrace();
                }
            }           

            
           
        
        
    
    
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
/////////////////////////////////Action Listener Event///////////////////////////////////////////   
    public void actionPerformed(ActionEvent ob) {
        Connection conn = null;
        Statement stmt = null;

            if(ob.getSource()==b6){
                new jodd();
                f.dispose();
            }
            if(ob.getSource()==b2){
    
            try {
                a2.removeAllItems();
                String URL = "jdbc:mysql://localhost/att_stu";
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();
                String sql = "SELECT DISTINCT Division FROM user WHERE Standard=\""+a1.getSelectedItem()+"\"";
                ResultSet rs = stmt.executeQuery(sql);                
                while(rs.next()){
                    a2.addItem(rs.getString("Division"));             
            }
            }
            catch(SQLException se) {
                se.printStackTrace();
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            finally{
            try {
                if(stmt!=null)
                stmt.close();
            }
            catch(SQLException se2) {

            }
            try {
                if(conn!=null)
                conn.close();
            }
            catch(SQLException se) {
                se.printStackTrace();
            }
        }
            } 
    

            if(ob.getSource()==b3){
    
                try {
                    hehe.setText("Data:-\n");
                    String URL = "jdbc:mysql://localhost/att_stu";
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(URL,USER,PASS);
                    stmt = conn.createStatement();
                    String sql = "SELECT * FROM user WHERE Standard=\""+a1.getSelectedItem()+"\" AND Division=\""+a2.getSelectedItem()+"\"";
                    ResultSet rs = stmt.executeQuery(sql);           
                    while(rs.next()){    
                        hehe.setText(hehe.getText()+rs.getString("roll")+". "+rs.getString("Student")+" :- \n       Standard: "+rs.getString("Standard")+"\n       Division: "+rs.getString("Division")+"\n       City: "+rs.getString("City")+"\n       Phone_no: "+rs.getString("Phone")+"\n       DOB: "+rs.getString("DOB")+"\n\n\n");
                    }
                    }            
                catch(SQLException se) {
                    se.printStackTrace();
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
                } 

            if(ob.getSource()==b4){
                f.dispose();
                new App();
            }

            if(ob.getSource()==b5){
                try {
                    
                    hehe.setText("Data:-\n");     
                String URL = "jdbc:mysql://localhost/att_stu";
                    conn = DriverManager.getConnection(URL,USER,PASS);
                    stmt = conn.createStatement();
                    Class.forName("com.mysql.jdbc.Driver");
                      String sql =  "INSERT INTO `user` (`id`, `roll`, `Student`, `Standard`, `Division`, `City`, `Phone`, `DOB`) VALUES (NULL, '"+t1.getText()+"', '"+t2.getText()+"', '"+t3.getText()+"', '"+t4.getText()+"', '"+t5.getText()+"', '"+t6.getText()+"', '"+t7.getText()+"');";
                      stmt.executeUpdate(sql); 
                      String sql2 = "SELECT * FROM user WHERE Standard=\""+a1.getSelectedItem()+"\" AND Division=\""+a2.getSelectedItem()+"\"";
                      ResultSet rs = stmt.executeQuery(sql2);           
                      while(rs.next()){    
                          hehe.setText(hehe.getText()+rs.getString("roll")+". "+rs.getString("Student")+" :- \n       Standard: "+rs.getString("Standard")+"\n       Division: "+rs.getString("Division")+"\n       City: "+rs.getString("City")+"\n       Phone_no: "+rs.getString("Phone")+"\n       DOB: "+rs.getString("DOB")+"\n\n\n");
                      }
                      }
                
                catch(SQLException se) {
                    se.printStackTrace();
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
               
            }
        }
      

        
        
/////////////////////////////////For Displaying Data From Table//////////////////////////////////
          
public static void main(String[] args) {
        new jodd();
	}

}