import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class App implements ItemListener, ActionListener {
	static final String JDBC_DRIVER="com.mysql.jdbc.driver";
	static final String DB_URL="jdbc:mysql://localhost/product_jdbc";
	Frame f;
    
    Choice a1 = new Choice();
    TextField t1 = new TextField("");
    TextField t2 = new TextField("");
    Label h = new Label("");
    Button b1,b2,b3;

	static final String USER ="root";
	static final String PASS ="";

/////////////////////////////////////////////////////////////////////////////////////////////
	App(){
           
        f= new Frame("Test JDBC");
        f.setVisible(true);
        f.setSize(500,500);

        b1 = new Button("Insert");
        b2 = new Button("Update");
        b3 = new Button("Delete");

        h.setBounds(10,50,40,20);
        a1.setBounds(150,50,100,30);
        t1.setBounds(10,50,100,25);
        t2.setBounds(10,80,100,25);
        b1.setBounds(10,170,50,30);
        b2.setBounds(10,110,50,30);
        b3.setBounds(10,140,50,30);

        f.add(a1);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(h);
        a1.addItemListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
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
    
        
    }
    
    public void actionPerformed(ActionEvent jodd2) {
        if(jodd2.getSource()==b1){
                Connection conn = null;
                Statement stmt = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(DB_URL,USER,PASS);
                    stmt = conn.createStatement();
                    String sql = "INSERT INTO `products` (`id`, `product`, `price`) VALUES (NULL, '"+t1.getText()+"', '"+t2.getText()+"');";
                    int rs = stmt.executeUpdate(sql);
                        if(rs==1){
                            h.setText("Inserted");
                        }
                }
                catch(SQLException se) {
                    se.printStackTrace();
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
                
            }
            if(jodd2.getSource()==b2){
                Connection conn = null;
                Statement stmt = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(DB_URL,USER,PASS);
                    stmt = conn.createStatement();
                    String sql = "UPDATE `products` SET `product` = \""+t1.getText()+"\" , `price` = '"+t2.getText()+"' WHERE `product` = \""+a1.getSelectedItem()+"\";";
                    int rs = stmt.executeUpdate(sql);
                        if(rs==1){
                            h.setText("Updated");
                        }
                }
                catch(SQLException se) {
                    se.printStackTrace();
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
                
            }
            if(jodd2.getSource()==b3){
                Connection conn = null;
                Statement stmt = null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(DB_URL,USER,PASS);
                    stmt = conn.createStatement();
                    String sql = "Delete FROM `products` WHERE `products`.`product` = \""+a1.getSelectedItem()+"\";";
                    int rs = stmt.executeUpdate(sql);
                        if(rs==1){
                            h.setText("Deleted");
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

    public static void main(String[] args) {
        new App();   
	}
    
}

