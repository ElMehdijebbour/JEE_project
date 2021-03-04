package ma.vaccination.ihm;

import java.io.IOException; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet(urlPatterns="/contact.html", loadOnStartup=1)
public class Contact extends HttpServlet {
	
	private static final long serialVersionUID = -4319076288258537575L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher( "pages/contact.jsp" ).forward( request, response );
	}
	
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
	}
	

}
