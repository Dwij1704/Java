import java.sql.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class App implements ActionListener{
	static final String JDBC_DRIVER="com.mysql.jdbc.driver";
	static final String DB_URL="jdbc:mysql://localhost/";
	JFrame f;
    String l="";
    int i=0;
    Choice a1 = new Choice();
    Choice a2 = new Choice();
    Choice a3 = new Choice();
    Choice a4 = new Choice();

    JLabel h1 = new JLabel("Tabel");
    JLabel h2 = new JLabel("Column");
    JLabel h3 =new JLabel("Database");
    JLabel h5 =new JLabel("");
    JLabel h4 =new JLabel("Content");
    
    //JLabel hd[]=new JLabel[10];

    JTextField t1 = new JTextField("");
    JTextField t2 = new JTextField("");
    JTextField t3 = new JTextField("");

    
  //  JTextField[] td = new JTextField[10];
    
    JTextArea t = new JTextArea("");
    JTextArea tb= new JTextArea("Process:");
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;

	static final String USER ="root";
	static final String PASS ="";

/////////////////////////////////////////////////////////////////////////////////////////////
	App(){
           
        f= new JFrame("Test JDBC");
//Button:-
        b1=new JButton("Create");
            b1.setBounds(50,50,75,30);
        b2=new JButton("Delete");
            b2.setBounds(50,100,75,30);
        b3=new JButton("View Tabels");
            b3.setBounds(110,150,110,30);
        b4=new JButton("View Data");
            b4.setBounds(10, 150, 110, 30);
        b5=new JButton("View Columns");
            b5.setBounds(215, 150, 115, 30);
        b6=new JButton("Refresh");
            b6.setBounds(190,250,80,20);
        b7=new JButton("Update");
            b7.setBounds(10,350,75,30);
        b8=new JButton("Delete");
            b8.setBounds(10,400,75,30);
        b9=new JButton("Add");
            b9.setBounds(190,300,75,20);
//TextArea:-
        t.setBounds(730,50,300,150);
        tb.setBounds(400,50,300,150);
//TextField:-        
        t1.setBounds(130,55,100,20);
        t2.setBounds(90,355,100,20);
        t3.setBounds(80,400,100,30);

//ChoiceLists:-
        a1.setBounds(70,200,100,20);
        a2.setBounds(70,250,100,20);
        a3.setBounds(250,200,100,20);
        a4.setBounds(70,300,100,20);
//Labels:-
        h1.setBounds(10,250,50,20);
        h2.setBounds(190,200,50,20);
        h3.setBounds(10,200,50,20);
            h3.setSize(80,20);
        h5.setBounds(10,300,50,20);
        h4.setBounds(10,300,50,20);


        f.setVisible(true);
        f.setSize(1350,1000);

        f.add(a1);
        f.add(a2);
        f.add(a3);
        f.add(a4);
        
        f.add(t);
        f.add(tb);
        
        f.add(t1);
        f.add(t2);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
 //       f.add(b9);

        f.add(h1);
        f.add(h2);
        f.add(h3);
        f.add(h4);
        f.add(h5);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
 //       b9.addActionListener(this);
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
                a4.removeAll();
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
                    a4.add(rs.getString(a3.getSelectedItem()));               
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
               // int i=0;
               // int x=55;
                String sql = "SHOW COLUMNS FROM "+a2.getSelectedItem();
                ResultSet rs = stmt.executeQuery(sql);               
                while(rs.next()){
                    a3.add(rs.getString(1));    
                /*    hd[i] = new JLabel(rs.getString(1));
                    f.add(hd[i]);
                    hd[i].setBounds(1100,x,100,20);
                    td[i]=new JTextField(""+i);
                    td[i].setBounds(1200,x,100,20);
                    f.add(td[i]);
                    i++; 
                    x=x+50;
                */
            }
            
        h1.setBounds(10,250,50,20);
            f.remove(h5);
            f.add(h5);
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
//////////////////////////////////////////Update Data/////////////////////////////////////////////////////////////////    
        else if(ob.getSource()==b7){
            Connection conn = null;
            Statement stmt = null;
            String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
            try {
                tb.setText(tb.getText()+"\n Updating Data...");
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();      
                String sql = "UPDATE `"+a2.getSelectedItem()+"` SET `"+a3.getSelectedItem()+"` = '"+t2.getText()+"' WHERE `"+a2.getSelectedItem()+"`.`"+a3.getSelectedItem()+"` = \""+a4.getSelectedItem()+"\";";
                stmt.executeUpdate(sql);               
                int i=1;
                String sql2 = "SELECT * FROM "+a2.getSelectedItem();
                ResultSet rs = stmt.executeQuery(sql2);
                a4.removeAll();
                t.setText("Content in Column " +a3.getSelectedItem()+":-");                
                while(rs.next()){
                    t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
                    a4.add(rs.getString(a3.getSelectedItem()));               
                    i++;          
            }
                tb.setText(tb.getText()+"\n Data Updated Sucessfully...");               
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
//////////////////////////////////////////Delete Data////////////////////////////////////////////////////////
        else if(ob.getSource()==b8){
            Connection conn = null;
            Statement stmt = null;
            String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
            try {
                tb.setText(tb.getText()+"\n Deleting Data...");
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();      
                String sql = "DELETE FROM `"+a2.getSelectedItem()+"` WHERE `"+a2.getSelectedItem()+"`.`"+a3.getSelectedItem()+"` = \""+a4.getSelectedItem()+"\"";
                stmt.executeUpdate(sql);               
                int i=1;
                String sql2 = "SELECT * FROM "+a2.getSelectedItem();
                ResultSet rs = stmt.executeQuery(sql2);
                a4.removeAll();
                t.setText("Content in Column " +a3.getSelectedItem()+":-");                
                while(rs.next()){
                    t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
                    a4.add(rs.getString(a3.getSelectedItem()));               
                    i++;          
            }
                tb.setText(tb.getText()+"\n Data Deleted Sucessfully...");               
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
//////////////////////////////////////////Add Data/////////////////////////////////////////////////////////////////    
/*else if(ob.getSource()==b9){
    Connection conn = null;
    Statement stmt = null;
    String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
    if(i==0){
    try {
        tb.setText(tb.getText()+"\n Adding Data...");
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(URL,USER,PASS);
        stmt = conn.createStatement();      
        String sql = "INSERT INTO `"+a2.getSelectedItem()+"` (`"+hd[0]+"`) VALUES ("+td[0]+");";
        stmt.executeUpdate(sql);            
        int i=1;
        String sql2 = "SELECT * FROM "+a2.getSelectedItem();
        ResultSet rs = stmt.executeQuery(sql2);
        a4.removeAll();
        t.setText("Content in Column " +a3.getSelectedItem()+":-");                
        while(rs.next()){
            t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
            a4.add(rs.getString(a3.getSelectedItem()));               
            i++;          
    }
        tb.setText(tb.getText()+"\n Data Added Sucessfully...");               
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


else if(i==1){
    Connection conn = null;
    Statement stmt = null;
    String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
    try {
        tb.setText(tb.getText()+"\n Adding Data...");
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(URL,USER,PASS);
        stmt = conn.createStatement();      
        String sql = "INSERT INTO `"+a2.getSelectedItem()+"` (`"+hd[0]+"`, `"+hd[1]+"`) VALUES ("+td[0]+", '"+td[1]+"');";
        stmt.executeUpdate(sql);         
        int i=1;
        String sql2 = "SELECT * FROM "+a2.getSelectedItem();
        ResultSet rs = stmt.executeQuery(sql2);
        a4.removeAll();
        t.setText("Content in Column " +a3.getSelectedItem()+":-");                
        while(rs.next()){
            t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
            a4.add(rs.getString(a3.getSelectedItem()));               
            i++;          
            }
            tb.setText(tb.getText()+"\n Data Added Sucessfully...");               
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

    else if(i==2){
        Connection conn = null;
        Statement stmt = null;
        String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
        try {
            tb.setText(tb.getText()+"\n Adding Data...");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL,USER,PASS);
            stmt = conn.createStatement();      
            String sql = "INSERT INTO `"+a2.getSelectedItem()+"` (`"+hd[0]+"`, `"+hd[1]+"`, `"+hd[2]+"`) VALUES ("+td[0]+", '"+td[1]+"', '"+td[2]+"');";
            stmt.executeUpdate(sql);         
            int i=1;
            String sql2 = "SELECT * FROM "+a2.getSelectedItem();
            ResultSet rs = stmt.executeQuery(sql2);
            a4.removeAll();
            t.setText("Content in Column " +a3.getSelectedItem()+":-");                
            while(rs.next()){
                t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
                a4.add(rs.getString(a3.getSelectedItem()));               
                i++;          
                }
                tb.setText(tb.getText()+"\n Data Added Sucessfully...");               
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



        else if(i==3){
            Connection conn = null;
            Statement stmt = null;
            String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
            try {
                tb.setText(tb.getText()+"\n Adding Data...");
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(URL,USER,PASS);
                stmt = conn.createStatement();      
                String sql = "INSERT INTO `"+a2.getSelectedItem()+"` (`"+hd[0]+"`, `"+hd[1]+"`, `"+hd[2]+"`, `"+hd[3]+"`) VALUES ("+td[0]+", '"+td[1]+"', '"+td[2]+"', '"+td[3]+"');";
                stmt.executeUpdate(sql);        
                int i=1;
                String sql2 = "SELECT * FROM "+a2.getSelectedItem();
                ResultSet rs = stmt.executeQuery(sql2);
                a4.removeAll();
                t.setText("Content in Column " +a3.getSelectedItem()+":-");                
                while(rs.next()){
                    t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
                    a4.add(rs.getString(a3.getSelectedItem()));               
                    i++;          
                    }
                    tb.setText(tb.getText()+"\n Data Added Sucessfully...");               
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


            else if(i==4){
                Connection conn = null;
                Statement stmt = null;
                String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
                try {
                    tb.setText(tb.getText()+"\n Adding Data...");
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(URL,USER,PASS);
                    stmt = conn.createStatement();      
                    String sql = "INSERT INTO `"+a2.getSelectedItem()+"` (`"+hd[0]+"`, `"+hd[1]+"`, `"+hd[2]+"`, `"+hd[3]+"`, `"+hd[4]+"`) VALUES ("+td[0]+", '"+td[1]+"', '"+td[2]+"', '"+td[3]+"', '"+td[4]+"');";
                    stmt.executeUpdate(sql);            
                    int i=1;
                    String sql2 = "SELECT * FROM "+a2.getSelectedItem();
                    ResultSet rs = stmt.executeQuery(sql2);
                    a4.removeAll();
                    t.setText("Content in Column " +a3.getSelectedItem()+":-");                
                    while(rs.next()){
                        t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
                        a4.add(rs.getString(a3.getSelectedItem()));               
                        i++;          
                        }
                        tb.setText(tb.getText()+"\n Data Added Sucessfully...");               
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


                else if(i==5){
                    Connection conn = null;
                    Statement stmt = null;
                    String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
                    try {
                        tb.setText(tb.getText()+"\n Adding Data...");
                        Class.forName("com.mysql.jdbc.Driver");
                        conn = DriverManager.getConnection(URL,USER,PASS);
                        stmt = conn.createStatement();      
                        String sql = "INSERT INTO `"+a2.getSelectedItem()+"` (`"+hd[0]+"`, `"+hd[1]+"`, `"+hd[2]+"`, `"+hd[3]+"`, `"+hd[4]+"`, `"+hd[5]+"`) VALUES ("+td[0]+", '"+td[1]+"', '"+td[2]+"', '"+td[3]+"', '"+td[4]+"', '"+td[5]+"');";
                        stmt.executeUpdate(sql);            
                        int i=1;
                        String sql2 = "SELECT * FROM "+a2.getSelectedItem();
                        ResultSet rs = stmt.executeQuery(sql2);
                        a4.removeAll();
                        t.setText("Content in Column " +a3.getSelectedItem()+":-");                
                        while(rs.next()){
                            t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
                            a4.add(rs.getString(a3.getSelectedItem()));               
                            i++;          
                            }
                            tb.setText(tb.getText()+"\n Data Added Sucessfully...");               
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


                    else if(i==6){
                        Connection conn = null;
                        Statement stmt = null;
                        String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
                        try {
                            tb.setText(tb.getText()+"\n Adding Data...");
                            Class.forName("com.mysql.jdbc.Driver");
                            conn = DriverManager.getConnection(URL,USER,PASS);
                            stmt = conn.createStatement();      
                            String sql = "INSERT INTO `"+a2.getSelectedItem()+"` (`"+hd[0]+"`, `"+hd[1]+"`, `"+hd[2]+"`, `"+hd[3]+"`, `"+hd[4]+"`, `"+hd[5]+"`, `"+hd[6]+"`) VALUES ("+td[0]+", '"+td[1]+"', '"+td[2]+"', '"+td[3]+"', '"+td[4]+"', '"+td[5]+"', '"+td[6]+"');";
                            stmt.executeUpdate(sql);           
                            int i=1;
                            String sql2 = "SELECT * FROM "+a2.getSelectedItem();
                            ResultSet rs = stmt.executeQuery(sql2);
                            a4.removeAll();
                            t.setText("Content in Column " +a3.getSelectedItem()+":-");                
                            while(rs.next()){
                                t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
                                a4.add(rs.getString(a3.getSelectedItem()));               
                                i++;          
                                }
                                tb.setText(tb.getText()+"\n Data Added Sucessfully...");               
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



                        else if(i==7){
                            Connection conn = null;
                            Statement stmt = null;
                            String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
                            try {
                                tb.setText(tb.getText()+"\n Adding Data...");
                                Class.forName("com.mysql.jdbc.Driver");
                                conn = DriverManager.getConnection(URL,USER,PASS);
                                stmt = conn.createStatement();      
                                String sql = "INSERT INTO `"+a2.getSelectedItem()+"` (`"+hd[0]+"`, `"+hd[1]+"`, `"+hd[2]+"`, `"+hd[3]+"`, `"+hd[4]+"`, `"+hd[5]+"`, `"+hd[6]+"`, `"+hd[7]+"`) VALUES ("+td[0]+", '"+td[1]+"', '"+td[2]+"', '"+td[3]+"', '"+td[4]+"', '"+td[5]+"', '"+td[6]+"', `"+td[7]+"`);";
                                stmt.executeUpdate(sql);               
                                int i=1;
                                String sql2 = "SELECT * FROM "+a2.getSelectedItem();
                                ResultSet rs = stmt.executeQuery(sql2);
                                a4.removeAll();
                                t.setText("Content in Column " +a3.getSelectedItem()+":-");                
                                while(rs.next()){
                                    t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
                                    a4.add(rs.getString(a3.getSelectedItem()));               
                                    i++;          
                                    }
                                    tb.setText(tb.getText()+"\n Data Added Sucessfully...");               
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


                            else if(i==8){
                                Connection conn = null;
                                Statement stmt = null;
                                String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
                                try {
                                    tb.setText(tb.getText()+"\n Adding Data...");
                                    Class.forName("com.mysql.jdbc.Driver");
                                    conn = DriverManager.getConnection(URL,USER,PASS);
                                    stmt = conn.createStatement();      
                                    String sql = "INSERT INTO `"+a2.getSelectedItem()+"` (`"+hd[0]+"`, `"+hd[1]+"`, `"+hd[2]+"`, `"+hd[3]+"`, `"+hd[4]+"`, `"+hd[5]+"`, `"+hd[6]+"`, `"+hd[7]+"`, `"+hd[8]+"`) VALUES ("+td[0]+", '"+td[1]+"', '"+td[2]+"', '"+td[3]+"', '"+td[4]+"', '"+td[5]+"', '"+td[6]+"', `"+td[7]+"`, `"+td[8]+"`);";
                                    stmt.executeUpdate(sql);           
                                    int i=1;
                                    String sql2 = "SELECT * FROM "+a2.getSelectedItem();
                                    ResultSet rs = stmt.executeQuery(sql2);
                                    a4.removeAll();
                                    t.setText("Content in Column " +a3.getSelectedItem()+":-");                
                                    while(rs.next()){
                                        t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
                                        a4.add(rs.getString(a3.getSelectedItem()));               
                                        i++;          
                                        }
                                        tb.setText(tb.getText()+"\n Data Added Sucessfully...");               
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


                                else if(i==9){
                                    Connection conn = null;
                                    Statement stmt = null;
                                    String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
                                    try {
                                        tb.setText(tb.getText()+"\n Adding Data...");
                                        Class.forName("com.mysql.jdbc.Driver");
                                        conn = DriverManager.getConnection(URL,USER,PASS);
                                        stmt = conn.createStatement();      
                                        String sql = "INSERT INTO `"+a2.getSelectedItem()+"` (`"+hd[0]+"`, `"+hd[1]+"`, `"+hd[2]+"`, `"+hd[3]+"`, `"+hd[4]+"`, `"+hd[5]+"`, `"+hd[6]+"`, `"+hd[7]+"`, `"+hd[8]+"`, `"+hd[9]+"`) VALUES ("+td[0]+", '"+td[1]+"', '"+td[2]+"', '"+td[3]+"', '"+td[4]+"', '"+td[5]+"', '"+td[6]+"', `"+td[7]+"`, `"+td[8]+"`, `"+td[9]+"`);";
                                        stmt.executeUpdate(sql);              
                                        int i=1;
                                        String sql2 = "SELECT * FROM "+a2.getSelectedItem();
                                        ResultSet rs = stmt.executeQuery(sql2);
                                        a4.removeAll();
                                        t.setText("Content in Column " +a3.getSelectedItem()+":-");                
                                        while(rs.next()){
                                            t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
                                            a4.add(rs.getString(a3.getSelectedItem()));               
                                            i++;          
                                            }
                                            tb.setText(tb.getText()+"\n Data Added Sucessfully...");               
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


                                    else if(i==10){
                                        Connection conn = null;
                                        Statement stmt = null;
                                        String URL = "jdbc:mysql://localhost/"+a1.getSelectedItem();
                                        try {
                                            tb.setText(tb.getText()+"\n Adding Data...");
                                            Class.forName("com.mysql.jdbc.Driver");
                                            conn = DriverManager.getConnection(URL,USER,PASS);
                                            stmt = conn.createStatement();      
                                            String sql = "INSERT INTO `"+a2.getSelectedItem()+"` (`"+hd[0]+"`, `"+hd[1]+"`, `"+hd[2]+"`, `"+hd[3]+"`, `"+hd[4]+"`, `"+hd[5]+"`, `"+hd[6]+"`, `"+hd[7]+"`, `"+hd[8]+"`, `"+hd[9]+"`, `"+td[10]+"`) VALUES ("+td[0]+", '"+td[1]+"', '"+td[2]+"', '"+td[3]+"', '"+td[4]+"', '"+td[5]+"', '"+td[6]+"', `"+td[7]+"`, `"+td[8]+"`, `"+td[9]+"`, `"+td[10]+"`);";
                                            stmt.executeUpdate(sql);              
                                            int i=1;
                                            String sql2 = "SELECT * FROM "+a2.getSelectedItem();
                                            ResultSet rs = stmt.executeQuery(sql2);
                                            a4.removeAll();
                                            t.setText("Content in Column " +a3.getSelectedItem()+":-");                
                                            while(rs.next()){
                                                t.setText(t.getText()+"\n"+i+". "+rs.getString(a3.getSelectedItem()));    
                                                a4.add(rs.getString(a3.getSelectedItem()));               
                                                i++;          
                                                }
                                                tb.setText(tb.getText()+"\n Data Added Sucessfully...");               
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
    */

}

    

    public static void main(String[] args) {
        new App();   
	}
}