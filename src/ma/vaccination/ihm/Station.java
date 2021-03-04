package ma.vaccination.ihm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.vaccination.dao.PersonneDAO;
import ma.vaccination.dao.RdvDAO;
import ma.vaccination.dao.VaccinDAO;
import ma.vaccination.model.Rdv;
import ma.vaccination.model.Vaccin;

/**
 * Servlet implementation class Station
 */
@WebServlet(urlPatterns="/station.html", loadOnStartup=1)
public class Station extends HttpServlet {
	
	private static final long serialVersionUID = -4319076288258537575L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Envoi d'une nouvelle page de station */
		// Champs vides
		request.setAttribute( "login", "" );
		request.setAttribute( "password", "" );
		request.setAttribute( "errorMessage", "" );
		int inscrits = PersonneDAO.getCount();
		request.setAttribute("inscrits", inscrits);
		int rdv = RdvDAO.getCount();
		request.setAttribute("rdv", rdv);
		int rdvPresent = RdvDAO.getRdvPresent();
		request.setAttribute("rdvPresent", rdvPresent);
		int rdvAbsent = RdvDAO.getRdvAbsent();
		request.setAttribute("rdvAbsent", rdvAbsent);
		request.getRequestDispatcher( "pages/station.jsp" ).forward( request, response );
	}
	
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		/* Envoi des informations */
		// Recuperation des infos
		String cin = request.getParameter( "txtCIN" );
		String serie = request.getParameter( "txtSerie" );
		String dose = request.getParameter( "txtDose" );
		String brand = request.getParameter( "txtBrand" );
		Vaccin vaccin = new Vaccin(0, Integer.parseInt(serie), Integer.parseInt(dose), brand);
		// Recuperation de l'ID de la personne
		int id = PersonneDAO.getId(cin);
		if(id != 0) {
			// Recuperation du dernier rendez-vous de la personne
			Rdv rdv = RdvDAO.getLastRdv(id);
			// Insertion du vaccin de la personne ( vac_id est généré automatiquement )
			boolean bool = VaccinDAO.insertVaccin(vaccin);
			if(rdv != null && bool) {
				// Récupération de vac_id 
				int vac_id = VaccinDAO.getLastVaccinID();
				// Mise à jour des infos du rendez-vous
				rdv.setVac_id(vac_id);
				rdv.setRdv_bool(true);
				boolean success = RdvDAO.updateRdv(rdv);
				if(success) {
					// Enregistrement des infos réussi
					request.setAttribute( "errorMessage", "" );
				} else {
					request.setAttribute( "errorMessage", "Veuillez réessayer" );
				}
			} else {
				request.setAttribute( "errorMessage", "Veuillez réessayer" );
			}
		} else {
			request.setAttribute( "errorMessage", "Erreur d'identification" );
		}

		request.getRequestDispatcher( "pages/station.jsp" ).forward( request, response );
	}
	

}
