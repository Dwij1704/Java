

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class app extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public app() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		 HttpSession session=request.getSession(true);

        Cookie c1=new Cookie("name",name);
        Cookie c2=new Cookie("age",age);
		session.setAttribute("name",name);
		session.setAttribute("age",age);
        c1.setMaxAge(60);
        response.addCookie(c1);
        response.addCookie(c2);
		PrintWriter ob=response.getWriter();
		ob.write("<html><body><a href='view'><h1> View Details Using Cookie</h1></a></body></html> ");
		ob.write("<html><body><a href='session'><h1> View Details Using Session</h1></a></body></html> ");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
