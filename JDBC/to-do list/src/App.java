import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

public class App implements ActionListener {
	static final String JDBC_DRIVER="com.mysql.jdbc.driver";
	static final String DB_URL="jdbc:mysql://localhost/";
	Frame f;
    
    Choice a1 = new Choice();
    Choice a2 = new Choice();

    Label h1 = new Label("Done");
    Label h2 = new Label("To-Do");
    Label h3 = new Label("");
    

    TextField t1 = new TextField("");
    
    Button b1,b2,b4;

	static final String USER ="root";
	static final String PASS ="";

/////////////////////////////////////////////////////////////////////////////////////////////
	App(){
           
        f= new Frame("Test JDBC");
//Button:-
        b1=new Button("Add");
            b1.setBounds(50,50,50,30);
        b2=new Button("Done");
            b2.setBounds(50,100,50,30);
        b4=new Button("Delete");
            b4.setBounds(100,100,50,30);    
//TextArea:-
//TextField:-        
        t1.setBounds(120,55,100,20);
//ChoiceLists:-
        a1.setBounds(70,200,300,20);
        a2.setBounds(70,250,300,20);
//Labels:-
        h1.setBounds(10,250,50,20);
        h2.setBounds(10,200,60,20);
        h3.setBounds(10,250,60,20);

        f.setVisible(true);
        f.setSize(400,400);

        f.add(a1);
        f.add(a2);
        
        f.add(t1);

        f.add(b1);
        f.add(b2);
        f.add(b4);

        f.add(h1);
        f.add(h2);
        f.add(h3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b4.addActionListener(this);
        
        Connection conn = null;
            Statement stmt = null;
            
            String URL = "jdbc:mysql://localhost/to_do";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();
                String sql = "SELECT * FROM list";
                ResultSet rs = stmt.executeQuery(sql);                
                while(rs.next()){
                    a1.add(rs.getString("task"));                   
                    
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
        
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();
                String sql = "SELECT * FROM l2";
                ResultSet rs = stmt.executeQuery(sql);                
                while(rs.next()){
                    a2.add(rs.getString("done"));             
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

        if(ob.getSource()==b1){
            try {
                    
            String URL = "jdbc:mysql://localhost/to_do";
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();
                Class.forName("com.mysql.jdbc.Driver");
                  String sql =  "INSERT INTO list (`id`, `task`) VALUES (NULL, '"+t1.getText()+"')";
                  stmt.executeUpdate(sql);    
                  a1.add(t1.getText());   
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
        else if(ob.getSource()==b2){
            try {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss  dd/MM/yyyy ");
            Calendar cal = Calendar.getInstance();
            String URL = "jdbc:mysql://localhost/to_do";
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();
                Class.forName("com.mysql.jdbc.Driver");
                  String sql =  "INSERT INTO `l2` (`id`, `done`) VALUES (NULL, '"+a1.getSelectedItem()+"  "+dateFormat.format(cal.getTime())+"');";
                  String sql2 =  "DELETE FROM `list` WHERE `task` = \""+a1.getSelectedItem()+"\";";
                      stmt.executeUpdate(sql2);
                  stmt.executeUpdate(sql);      
                  a2.add(a1.getSelectedItem()+"  "+dateFormat.format(cal.getTime())); 
                  a1.remove(a1.getSelectedItem());    
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
            else if(ob.getSource()==b4) {
            try {
                
            String URL = "jdbc:mysql://localhost/to_do";
                    conn = DriverManager.getConnection(URL,USER,PASS);
                    stmt = conn.createStatement();
                    Class.forName("com.mysql.jdbc.Driver");
                      String sql =  "DELETE FROM `l2` WHERE `done` = \""+a2.getSelectedItem()+"\";";
                      stmt.executeUpdate(sql);    
                      a2.remove(a2.getSelectedItem());   
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
              else if(ob.getSource()==b4) {
            try {
                
            String URL = "jdbc:mysql://localhost/to_do";
                    conn = DriverManager.getConnection(URL,USER,PASS);
                    stmt = conn.createStatement();
                    Class.forName("com.mysql.jdbc.Driver");
                      String sql =  "DELETE FROM `l2` WHERE `done` = \""+a2.getSelectedItem()+"\";";
                      stmt.executeUpdate(sql);       
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
/////////////////////////////////For Displaying Data From Table//////////////////////////////////
          
public static void main(String[] args) {
        new App();   
	}
}