import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class App implements ItemListener {
	static final String JDBC_DRIVER="com.mysql.jdbc.driver";
	static final String DB_URL="jdbc:mysql://localhost/product_jdbc";
	Frame f;
    
    Choice a1 = new Choice();
    Label h = new Label("Jodd");

	static final String USER ="root";
	static final String PASS ="";

/////////////////////////////////////////////////////////////////////////////////////////////
	App(){
           
        f= new Frame("Test JDBC");
        f.setVisible(true);
        f.setSize(200,300);
        h.setBounds(10,50,40,20);
        a1.setBounds(50,50,100,20);
        f.add(a1);
        f.add(h);
        a1.addItemListener(this);
        
       Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql = "SELECT product FROM `products`";
            ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    a1.add(""+rs.getString(1));
                    h.setText("hehe");
                }
        }
        catch(SQLException se) {
            se.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public void itemStateChanged(ItemEvent jodd) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql = "SELECT price FROM `products` WHERE product=\""+a1.getSelectedItem()+"\"";
            ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    h.setText("Price of this product is "+rs.getString(1)+"₹");
                }
        }
        catch(SQLException se) {
            se.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        new App();   
	}

}

