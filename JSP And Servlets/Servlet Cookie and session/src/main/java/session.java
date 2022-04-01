

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class session extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public session() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session=request.getSession(true);
		String name=(String)session.getAttribute("name");
		String age1=(String)session.getAttribute("age");
		
		PrintWriter ob = response.getWriter();
		ob.write("<html><body><h1>Details Using Session:-<br><br>Name:- "+name+"<br>Age:- "+age1+"<br></h1><h3>Note:- This Data Will be erased once you exit this tab as it is stored in session</h3></body></html> ");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
