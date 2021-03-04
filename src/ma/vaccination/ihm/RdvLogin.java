package ma.vaccination.ihm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ma.vaccination.dao.PersonneDAO;
import ma.vaccination.model.Personne;

/**
 * Servlet implementation class Rdv 
 */
@WebServlet(urlPatterns="/rdv.html", loadOnStartup=1)
public class RdvLogin extends HttpServlet {
	
	private static final long serialVersionUID = -4319076288258537575L;


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Envoi d'une nouvelle page de rendez-vous */
		// Message d'erreur vide
		request.setAttribute("errorMessage", "");
		request.getRequestDispatcher( "pages/rdv.jsp" ).forward( request, response );
	}
	 
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		/* Envoi des identifiants de connexion */
		// Recuperation des données d'identification 
		String cin = request.getParameter( "txtCIN" );
		String password = request.getParameter( "txtPassword" );
		// Vérification la connexion 
		Personne person = PersonneDAO.isLoginValid(cin, password);
		if( person != null ) {
			// Connexion réussie : redirection vers rdvConfig.html avec les données de la personne
			HttpSession session = request.getSession( true );
			session.setAttribute( "person", person );
			response.sendRedirect( "rdvConfig.html" );
		}else {
			// Connexion échouée : affichage de message d'erreur sur la page courante
			request.setAttribute("errorMessage", "Bad identity");
			request.getRequestDispatcher( "pages/rdv.jsp" ).forward( request, response );
		}
		
	}
	

}
