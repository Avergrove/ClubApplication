

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.getWriter().println("<h1>Hello! I am a servlet!</h1>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Get URL Parameters
		String user = request.getParameter("user");
		
		if(user.toLowerCase().equals("aver")) {
			// Print and return
			response.getWriter().println(String.format("<h1>Hello, %s! </h1>", user));		
		
			// Forward it to another Servlet!
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/Sexy");
			rd.forward(request, response);
			
		}
		
		else {
			response.getWriter().print("Incorrect password!");
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/helloWorld.jsp");
			
			rd.include(request, response);
		}
	}

}
