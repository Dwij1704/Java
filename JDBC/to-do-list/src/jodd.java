import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jodd implements ActionListener {
        public static int id;
        static final String JDBC_DRIVER="com.mysql.jdbc.driver";
        static final String DB_URL="jdbc:mysql://localhost/";
        JFrame f1;
        JPanel p2 = new JPanel();
        Popup p;
        JLabel h1 = new JLabel("Username:-");
        JLabel h2 = new JLabel("Password:-");
        JLabel h4 = new JLabel("");
        JLabel h3 = new JLabel("");
        JLabel label = new JLabel("Incorrect Username or Password");
        
        ImageIcon log= new ImageIcon("blog-wp-login.png");

        JTextField t1 = new JTextField(50);
        JPasswordField t2 = new JPasswordField(50);
        
        JButton b1,b2,button;
    
        static final String USER ="root";
        static final String PASS ="";
    
    /////////////////////////////////////////////////////////////////////////////////////////////
        jodd(){
            f1= new JFrame("To-Do List Login");
            PopupFactory p1 = new PopupFactory();
            
            p2.add(label);
            p2.setBounds(130, 350, 300, 50);
            label.setForeground(Color.RED);
            p = p1.getPopup(f1,p2 , 180, 100);
    //Button:-
            b1=new JButton("Login");
                b1.setBounds(100,320,100,30);
            b2=new JButton("Register");
                b2.setBounds(250,320,100,30);   
    //TextArea:-
    //TextField:-        
            t1.setBounds(130,170,190,30);
            t1.setFont(new Font("New Times Roman", Font.BOLD, 15));
            t2.setBounds(130,250,190,30);
            t2.setFont(new Font("New Times Roman", Font.BOLD, 15));
    //Labels:-
            h1.setBounds(40,170,90,30);
                h1.setFont(new Font("New Times Roman", Font.BOLD, 15));
            h2.setBounds(40,250,80,30);
                h2.setFont(new Font("New Times Roman", Font.BOLD, 15));
            h3.setBounds(30,1000,60,20);
            h4.setBounds(70,20,307,120);
            h4.setText(" ");
            h4.setIcon(new ImageIcon("login.jpg"));
    
            f1.setVisible(true);
            f1.setSize(450,500);
            f1.getContentPane().setBackground(Color.WHITE);
            f1.add(p2);
            p2.setVisible(false);
            f1.add(t1);
            f1.add(t2);
            f1.add(b1);
            f1.add(b2);
    
            f1.add(h1);
            f1.add(h2);
            f1.add(h4);
            f1.add(h3);
            
            b1.addActionListener(this);
            b2.addActionListener(this);
        
            f1.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                }
            });
        }

    public void actionPerformed(ActionEvent jodd) {
        Connection conn = null;
        Statement stmt = null;

        String pass=new String(t2.getPassword());
        if(jodd.getSource()==b1){
            try {
                    
            String URL = "jdbc:mysql://localhost/to_do";
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();
                Class.forName("com.mysql.jdbc.Driver");
                  String sql =  "SELECT * FROM `users` WHERE username=\""+t1.getText()+"\" AND password=\""+pass+"\"";
                  
                ResultSet rs = stmt.executeQuery(sql);
                 if(rs.next()){
                     
                    id= rs.getInt("id");
                    new App();
                    f1.dispose();
                 } 
               else{
                    label.setText("Incorrect Username or Password"); 
                    p2.setBounds(50, 350, 300, 50);   
                    p2.setVisible(true);
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


        if(jodd.getSource()==b2){
            try {
                    
            String URL = "jdbc:mysql://localhost/to_do";
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();
                Class.forName("com.mysql.jdbc.Driver");
                String sql2 =  "SELECT * FROM `users` WHERE username=\""+t1.getText()+"\"";
                ResultSet rs2 = stmt.executeQuery(sql2);
                if(rs2.next()){
                    p2.setBounds(70, 350, 300, 50);
                    label.setText("Username Already Taken Please Register Again");
                    p2.setVisible(true);
                    SwingUtilities.updateComponentTreeUI(f1);
                }
                else{
                    p2.setBounds(70, 350, 300, 50);
                    label.setText("Successfully Registered Log in Again");
                    p2.setVisible(true);
                    String sql =  "INSERT INTO `users` (`username`, `password`) VALUES (\""+t1.getText()+"\", \""+pass+"\")";
                    stmt.executeUpdate(sql);
                    SwingUtilities.updateComponentTreeUI(f1);
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
        
    }
    
}
