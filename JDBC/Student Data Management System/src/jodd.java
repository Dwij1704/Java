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
        JLabel h3 = new JLabel("");
        JLabel label = new JLabel("Incorrect Username or Password");
        JLabel h4 = new JLabel("Login");

        JTextField t1 = new JTextField(50);
        JPasswordField t2 = new JPasswordField(50);
        
        JButton b1;
    
        static final String USER ="root";
        static final String PASS ="";
    
    /////////////////////////////////////////////////////////////////////////////////////////////
        jodd(){
            f1= new JFrame("Login");
            PopupFactory p1 = new PopupFactory();
            
            p2.add(label);
            p2.setBounds(130, 350, 300, 50);
            label.setForeground(Color.RED);
            p = p1.getPopup(f1,p2 , 180, 100);
    //Button:-
            b1=new JButton("Login");
                b1.setBounds(100,320,100,30);   
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
            h4.setBounds(175,20,450,150);
                h4.setFont(new Font("New Times Roman", Font.BOLD, 25));
    
            f1.setVisible(true);
            f1.setSize(450,500);
            f1.add(p2);
            p2.setVisible(false);
            f1.add(t1);
            f1.add(t2);
            f1.add(b1);
    
            f1.add(h1);
            f1.add(h2); 
            f1.add(h4);
            f1.add(h3);
            
            b1.addActionListener(this);
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
                    
            String URL = "jdbc:mysql://localhost/att_stu";
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();
                Class.forName("com.mysql.jdbc.Driver");
                  String sql =  "SELECT * FROM `faculty` WHERE username=\""+t1.getText()+"\" AND password=\""+pass+"\"";
                  
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
    
}
}
