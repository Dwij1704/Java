import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class App implements ActionListener{
	static final String JDBC_DRIVER="com.mysql.jdbc.driver";
	static final String DB_URL="jdbc:mysql://localhost/";
	Frame f;
    
    Choice a1 = new Choice();
    Choice a2 = new Choice();
    Choice a3 = new Choice();

    Label h1 = new Label("Tabel");
    Label h2 = new Label("Column");
    Label h3 =new Label("Database");
    Label h4 =new Label("");
    

    TextField t1 = new TextField("");
    
    TextArea t = new TextArea("");
    TextArea tb= new TextArea("Process:");
    
    Button b1,b2,b3,b4,b5,b6;

	static final String USER ="root";
	static final String PASS ="";

/////////////////////////////////////////////////////////////////////////////////////////////
	App(){
           
        f= new Frame("Test JDBC");
//Button:-
        b1=new Button("Create");
            b1.setBounds(50,50,50,30);
        b2=new Button("Delete");
            b2.setBounds(50,100,50,30);
        b3=new Button("View Tabels");
            b3.setBounds(100,150,90,30);
        b4=new Button("View Data");
            b4.setBounds(10, 150, 90, 30);
        b5=new Button("View Columns");
            b5.setBounds(190, 150, 90, 30);
        b6=new Button("Refresh");
            b6.setBounds(190,250,60,20);
//TextArea:-
        t.setBounds(70,300,300,150);
        tb.setBounds(400,50,300,150);
//TextField:-        
        t1.setBounds(120,55,100,20);
//ChoiceLists:-
        a1.setBounds(70,200,100,20);
        a2.setBounds(70,250,100,20);
        a3.setBounds(250,200,100,20);
//Labels:-
        h1.setBounds(10,250,50,20);
        h2.setBounds(190,200,50,20);
        h3.setBounds(10,200,50,20);
            h3.setSize(80,20);
        h4.setBounds(10,300,50,20);

        f.setVisible(true);
        f.setSize(730,500);

        f.add(a1);
        f.add(a2);
        f.add(a3);
        
        f.add(t);
        f.add(tb);
        
        f.add(t1);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);

        f.add(h1);
        f.add(h2);
        f.add(h3);
        f.add(h4);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
////////////////////////Part Of Constructor For Displaying List Of Database///////////////////////////////////////////////
        Connection conn = null;
        Statement stmt = null;
        tb.setText(tb.getText()+"\n Fetching Databases...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql = "SHOW DATABASES ";
            ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    a1.add(rs.getString(1));
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
/////////////////////////////////For Creating DataBase///////////////////////////////////////////
        if(ob.getSource()==b1){
            Connection conn = null;
		    Statement stmt = null; 
            try {
                Class.forName("com.mysql.jdbc.Driver");
                tb.setText(tb.getText()+"\n Connecting....");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                tb.setText(tb.getText()+"\n Creating Database....");
                stmt = conn.createStatement();
                String sql = "CREATE DATABASE "+ t1.getText();
                stmt.executeUpdate(sql);
                tb.setText(tb.getText()+"\n Created Sucessfully!!!");
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
/////////////////////////////////For Deletting DataBase///////////////////////////////////////////
        else if(ob.getSource()==b2){
                Connection conn = null;
                Statement stmt = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    tb.setText(tb.getText()+"\n Connecting....");
                    conn = DriverManager.getConnection(DB_URL,USER,PASS);
                    tb.setText(tb.getText()+"\n Deleting....");
                    stmt = conn.createStatement();
                    String sql = "DROP DATABASE "+a1.getSelectedItem();
                    stmt.executeUpdate(sql);
                    tb.setText(tb.getText()+"\n Deleted Sucessfully!!!");
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
/////////////////////////////////For Getting Tables Of DataBase////////////////////////////////////
        else if(ob.getSource()==b3){
            a2.removeAll();
            Connection conn = null;
            Statement stmt = null;
            String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                tb.setText(tb.getText()+"\n Getting Table Names...");
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement(); 
                String sql = "SHOW TABLES";
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    a2.add(rs.getString(1));
                }
                tb.setText(tb.getText()+"\n Table Ready To View...");               
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
/////////////////////////////////For Displaying Data From Table//////////////////////////////////
        else if(ob.getSource()==b4){           
            Connection conn = null;
            Statement stmt = null;
            String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
            try {
                tb.setText(tb.getText()+"\n Getting Data...");
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();
                int i=1;
                String sql = "SELECT * FROM "+a2.getSelectedItem();
                ResultSet rs = stmt.executeQuery(sql);
                t.setText("Content in Column " +a3.getSelectedItem()+":-");                
                while(rs.next()){
                    t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));                   
                    i++;          
            }
                tb.setText(tb.getText()+"\n Data Ready To View...");               
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
/////////////////////////////////For Getting Column names///////////////////////////////////////////
        else if(ob.getSource()==b5){
            a3.removeAll();
            Connection conn = null;
            Statement stmt = null;
            String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
            try {
                tb.setText(tb.getText()+"\n Getting Columns Data...");
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();      
                String sql = "SHOW COLUMNS FROM "+a2.getSelectedItem();
                ResultSet rs = stmt.executeQuery(sql);               
                while(rs.next()){
                    a3.add(rs.getString(1));           
            }
                tb.setText(tb.getText()+"\n Column Ready To View...");               
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
//////////////////////////////////////////Refresh////////////////////////////////////////////////////////
        else if(ob.getSource()==b6){
            a1.removeAll();
            a2.removeAll();
            a3.removeAll();
            t1.setText("");
            tb.setText("Process:");
            t.setText("");
            Connection conn = null;
            Statement stmt = null;
            tb.setText(tb.getText()+"\n Fetching Databases...");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                stmt = conn.createStatement();
                String sql = "SHOW DATABASES ";
                
                ResultSet rs = stmt.executeQuery(sql);
                    while(rs.next()){
                        a1.add(rs.getString(1));                        
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
	public static void main(String[] args) {
        new App();   
	}
}