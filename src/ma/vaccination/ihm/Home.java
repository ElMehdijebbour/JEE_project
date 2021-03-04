package ma.vaccination.ihm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.vaccination.dao.PersonneDAO;
import ma.vaccination.dao.RdvDAO;

/**
 * Servlet implementation class Home
 */
@WebServlet(urlPatterns="/index.html", loadOnStartup=1)  
public class Home extends HttpServlet {
	
	private static final long serialVersionUID = -4319076288258537575L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int inscrits = PersonneDAO.getCount();
		request.setAttribute("inscrits", inscrits);
		int rdv = RdvDAO.getCount();
		request.setAttribute("rdv", rdv);
		int rdvPresent = RdvDAO.getRdvPresent();
		request.setAttribute("rdvPresent", rdvPresent);
		int rdvAbsent = RdvDAO.getRdvAbsent();
		request.setAttribute("rdvAbsent", rdvAbsent);
		request.getRequestDispatcher( "pages/index.jsp" ).forward( request, response );
	}
	
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
	}
	

}
