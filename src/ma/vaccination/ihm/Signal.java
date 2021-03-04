package ma.vaccination.ihm;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.vaccination.dao.FeedbackDAO;
import ma.vaccination.dao.PersonneDAO;
import ma.vaccination.model.Feedback;
import ma.vaccination.model.Personne;

/**
 * Servlet implementation class Signal
 */
@WebServlet(urlPatterns="/signal.html", loadOnStartup=1)
public class Signal extends HttpServlet {
	
	private static final long serialVersionUID = -4319076288258537575L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Envoi d'une nouvelle page de feedback */
		// Champs vides
		request.setAttribute("txtCIN", "");
		request.setAttribute("txtMessage", "");
		request.setAttribute("errorMessage", "");
		request.getRequestDispatcher( "pages/signal.jsp" ).forward( request, response );
	}
	
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		/* Envoi des identifiants de connexion et du feedback*/
		// Recuperation des données d'identification et du feedback
		String cin = request.getParameter( "txtCIN" );
		String password = request.getParameter( "txtPassword" );
		String message = request.getParameter("txtMessage");
		System.out.println("Message : "+message);
		// Vérification la connexion 
		Personne person = PersonneDAO.isLoginValid(cin, password);
		if( person != null ) {
			// Connexion réussie : 
			// Enregistrement du feedback
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date(System.currentTimeMillis());
			Feedback feedback = new Feedback(0,person.getId(), message, formatter.format(date) );
			boolean bool = FeedbackDAO.insertFeedback(feedback);
			if( bool ) {
				String validation = "a été enregistré";
				request.setAttribute("validation", validation);
				String operation = "commentaire";
				request.setAttribute("operation", operation);
				request.getRequestDispatcher( "pages/validation.jsp" ).forward( request, response );
			}else {
				// Enregistrement échoué : affichage du message d'erreur sur la page courante
				request.setAttribute("errorMessage", "Enregistrement échoué");
				request.setAttribute("txtCIN", cin);
				request.setAttribute("txtMessage", message);
				request.getRequestDispatcher( "pages/signal.jsp" ).forward( request, response );
			}
			
		}else {
			// Connexion échouée : affichage du message d'erreur sur la page courante
			request.setAttribute("errorMessage", "Bad identity");
			request.setAttribute("txtCIN", cin);
			request.setAttribute("txtMessage", message);
			request.getRequestDispatcher( "pages/signal.jsp" ).forward( request, response );
		}
	}
	

}
