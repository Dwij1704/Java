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
    Label h4 = new Label("");
    Label h3 = new Label("");
    

    TextField t1 = new TextField("");
    
    Button b1,b2,b3,b4,b5;

	static final String USER ="root";
	static final String PASS ="";

/////////////////////////////////////////////////////////////////////////////////////////////
	App(){
           
        f= new Frame("To-Do List");
//Button:-
        b1=new Button("Add");
            b1.setBounds(50,50,50,30);
        b2=new Button("Done");
            b2.setBounds(50,100,50,30);
        b3=new Button("Un-Done");
            b3.setBounds(110,100,70,30);
        b4=new Button("Delete Done");
            b4.setBounds(50,150,85,30); 
        b5=new Button("Delete To-Do");
            b5.setBounds(140,150,90,30);    
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
        h4.setBounds(250,55,300,20);
        h4.setForeground(Color.BLUE);

        f.setVisible(true);
        f.setSize(600,300);

        f.add(a1);
        f.add(a2);
        
        f.add(t1);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.add(h1);
        f.add(h2);
        f.add(h4);
        f.add(h3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
        Connection conn = null;
            Statement stmt = null;
            
            String URL = "jdbc:mysql://localhost/to_do";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();
                String sql = "SELECT * FROM list WHERE id="+jodd.id;
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
                String sql = "SELECT * FROM l2  WHERE id="+jodd.id;
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
                  String sql =  "INSERT INTO list (`sr_no`, `task`, `id`) VALUES (NULL, '"+t1.getText()+"', '"+jodd.id+"')";
                  stmt.executeUpdate(sql);    
                  a1.add(t1.getText());   
                  h4.setText(t1.getText()+" Inserted!");
                  t1.setText("");
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
                  String sql =  "INSERT INTO `l2` (`sr_no`, `done`, `id`) VALUES (NULL, '"+a1.getSelectedItem()+"  "+dateFormat.format(cal.getTime())+"', '"+jodd.id+"' );";
                  String sql2 =  "DELETE FROM `list` WHERE `task` = \""+a1.getSelectedItem()+"\";";
                      stmt.executeUpdate(sql2);
                  stmt.executeUpdate(sql);      
                  a2.add(a1.getSelectedItem()+"  "+dateFormat.format(cal.getTime())); 
                  h4.setText(a1.getSelectedItem()+" Done!");
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
                      h4.setText(a2.getSelectedItem()+" Deleted After Done!");
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
              
            else if(ob.getSource()==b3){
            
                try {
                    char[] charArray = a2.getSelectedItem().toCharArray();
                    String result = "";
                    for (int i = 0; i < charArray.length; i++) {
                        if(!Character.isLetter(charArray[i]) && !Character.isDigit(charArray[i]) && !Character.isWhitespace(charArray[i])) {
                           
                        } 
                        else if(Character.isDigit(charArray[i])){
    
                        }
                        else {
                            result = result + charArray[i];                    
                        }
                        }
                
                String URL = "jdbc:mysql://localhost/to_do";
                    conn = DriverManager.getConnection(URL,USER,PASS);
                    stmt = conn.createStatement();
                    Class.forName("com.mysql.jdbc.Driver");
                      String sql =  "INSERT INTO `list` (`sr_no`, `task`, `id`) VALUES (NULL, \""+result+"\", '"+jodd.id+"');";
                      String sql2 =  "DELETE FROM `l2` WHERE `done` = \""+a2.getSelectedItem()+"\";";
                        stmt.executeUpdate(sql);
                          stmt.executeUpdate(sql2);     
                      h4.setText(result+" Undone!");
                      a1.add(result); 
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
            else if(ob.getSource()==b5) {
                try {
                    
                String URL = "jdbc:mysql://localhost/to_do";
                        conn = DriverManager.getConnection(URL,USER,PASS);
                        stmt = conn.createStatement();
                        Class.forName("com.mysql.jdbc.Driver");
                          String sql =  "DELETE FROM `list` WHERE `task` = \""+a1.getSelectedItem()+"\";";
                          stmt.executeUpdate(sql);     
                          h4.setText(a1.getSelectedItem()+" Deleted!"); 
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
            } 

        
        
/////////////////////////////////For Displaying Data From Table//////////////////////////////////
          
public static void main(String[] args) {
        new jodd();
	}
}