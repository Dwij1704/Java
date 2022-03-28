<html>
    <head>
        <title>Result</title>
    </head>
    <body>
        <%
            int java=Integer.parseInt(request.getParameter("java"));
            int NMA=Integer.parseInt(request.getParameter("NMA"));
            int MCAD=Integer.parseInt(request.getParameter("MCAD"));
            int PPUD=Integer.parseInt(request.getParameter("PPUD"));
            int Project=Integer.parseInt(request.getParameter("pro"));
              
            int c=java+NMA+MCAD+PPUD+Project;
            double avg=c/5;
        
            out.print("Your grade is ");
            if(avg > 90 ){
                out.print("A");
            }else if (avg >= 80) {
              out.print("B");
            } else if (avg >= 70) {
               out.print("C");
            } else if (avg >= 60) {
                out.print("D");
            } else {
                out.print("E");
          }
       %>
    </body>
</html>