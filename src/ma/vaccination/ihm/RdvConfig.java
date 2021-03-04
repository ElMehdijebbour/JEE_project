package ma.vaccination.ihm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ma.vaccination.dao.RdvDAO;
import ma.vaccination.dao.SalleDAO;
import ma.vaccination.model.Personne;
import ma.vaccination.model.Rdv;
import ma.vaccination.model.Salle;

/**
 * Servlet implementation class RdvConfig
 */
@WebServlet(urlPatterns="/rdvConfig.html", loadOnStartup=1)
public class RdvConfig extends HttpServlet {

	
	private static final long serialVersionUID = -4319076288258537575L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Page de configuration des rendez-vous */
		// Recupération des données de la session
		HttpSession session = request.getSession( true );
		Personne person = (Personne) session.getAttribute("person");
		if( person == null ) {
			// Rédirection au rdv.html en cas de perte de session pour se reconnecter
			response.sendRedirect( "rdv.html" );
			return; 
		}
		// Envoi de la page de configuration lorsque la session est maintenue
		request.getRequestDispatcher( "pages/rdvConfig.jsp" ).forward( request, response );
		
	}
	
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		/* Envoi des données de configuration du rendez-vous */
		// Recupération des données de la session
		HttpSession session = request.getSession( true );
		Personne person = (Personne) session.getAttribute("person");
		if( person == null ) {
			// Rédirection au rdv.html en cas de perte de session pour se reconnecter
			response.sendRedirect( "rdv.html" );
			return;
		}
		// Sinon, recupération des données du rendez-vous
		String rdv_date = request.getParameter("txtDate");
		String rdv_heure = request.getParameter("txtHeure");
		String salle_nom = request.getParameter("txtSalle");
		System.out.println(" Date et Heure : " + rdv_date + " " + rdv_heure);
		// Récupération de salle_id en base
		int salle_id = SalleDAO.getId(salle_nom);
		
		if ( salle_id != 0 ) {
			// insertion des infos du rendez-vous dans la base
			Rdv rdv = new Rdv (rdv_date, rdv_heure, person.getId(), salle_id);
			boolean bool = RdvDAO.insertRdv(rdv);
			
			if(bool) {
				// Insertion réussie: sauvegarde des infos dans la session 
				Salle salle = new Salle(salle_id, salle_nom);
				session.setAttribute("salle", salle);
				session.setAttribute( "rdv", rdv );
				// Rédirection au PDFAttestation en cas d'insertion des données du rendez-vous
				response.sendRedirect( "PDFAttestation" );
				return;
			}
		}
		// Sinon, on reste sur la même page
		request.getRequestDispatcher( "pages/rdvConfig.jsp" ).forward( request, response );
		
	}
	

}
