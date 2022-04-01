<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
<body>
<%

     String a=request.getParameter("uname");

     String b=request.getParameter("pass");

 if(a.equals("dwij") && b.equals("dwij1704"))

       {
	 	out.println("<h1>Logged in using Static Mode</h1>");

       }
 else{
	 String name=request.getParameter("uname");
     String pass=request.getParameter("pass");
     Class.forName("com.mysql.jdbc.Driver"); 
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost/to_do","root","");
     PreparedStatement ps=con.prepareStatement("select * from users where username=? and password=?");
     ps.setString(1, name);
     ps.setString(2, pass);
    
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
		  out.println("<h1>Logged in using Dynamic method</h1>");
		}
		else
		{
		  out.println("<h1>Login Credentials invalid</h1>");
		}
 }


       %>
     </body>
</html>
