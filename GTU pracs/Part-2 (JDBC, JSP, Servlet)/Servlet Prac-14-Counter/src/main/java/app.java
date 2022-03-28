import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class app extends HttpServlet {

	private static final long serialVersionUID = 1L;
   private int hitCount; 

   public void init() { 
      hitCount = 0;
   } 

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      hitCount++; 
      PrintWriter out = response.getWriter();
      
      out.println("<html><head><title></title></head> <body bgcolor = \"#f0f0f0\"> <h1 align = \"center\">Total Hits:- \n</h1> <h2 align = \"center\">"+hitCount+"</h2><h2 align = \"center\">Refresh To Increment The Counter</h2> </body></html>");
   }
   
 
} 