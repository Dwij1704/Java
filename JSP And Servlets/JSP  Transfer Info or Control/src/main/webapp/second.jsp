<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
           String name=request.getParameter("name");
           String password=request.getParameter("pas");
           String email=request.getParameter("email");
          
            out.println("You Entered Name : "+name+"<br>");
            out.println("You Entered pass : "+password+"<br>");
            out.println("You Entered email : "+email+"<br>");
        %>
    </body>
</html>
