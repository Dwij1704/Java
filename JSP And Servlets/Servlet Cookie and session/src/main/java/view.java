

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public view() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie c[]=request.getCookies(); 
		String name = c[2].getValue(); 
		String age = c[1].getValue();
		PrintWriter ob=response.getWriter();
		ob.write("<html><body><h1>Details Using Cookie:-<br><br>Name:- "+name+"<br>Age:- "+age+"<br></h1><h3>Note:- This Data will not be erased until 60 seconds even if you exit this tab as it is stored in cookie</h3></body></html> ");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
