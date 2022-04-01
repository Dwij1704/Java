import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class App {
	static final String JDBC_DRIVER="com.mysql.jdbc.driver";
	static final String DB_URL="jdbc:mysql://localhost/";
	Frame f;
    
    
    TextArea t = new TextArea("");

	static final String USER ="root";
	static final String PASS ="";

/////////////////////////////////////////////////////////////////////////////////////////////
	App(){
           
        f= new Frame("Test JDBC");
//TextArea:-
        t.setBounds(50,50,100,150);
        f.setVisible(true);
        f.setSize(500,500);

        f.add(t);
       Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql = "SHOW DATABASES;";
            ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    t.setText(t.getText()+rs.getString(1)+"\n");
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
    public static void main(String[] args) {
        new App();   
	}
}

