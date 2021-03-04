package ma.vaccination.ihm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ma.vaccination.model.Salle;
import ma.vaccination.model.Personne;
import ma.vaccination.model.Rdv;
import ma.vaccination.traitment.GenerateurPDF;

/**
 * Servlet implementation class PDFAttestationExport
 */
@WebServlet(urlPatterns="/PDFAttestation", loadOnStartup=1)
public class PDFAttestationExport extends HttpServlet {
	
	private static final long serialVersionUID = -4319076288258537575L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Chargement du path du fichier pdf model de l'attestation
		String masterPath = request.getServletContext().getRealPath( "/WEB-INF/AttestationMaster.pdf" );
		// Récupération des informations sauvegardées dans la session
		HttpSession session = request.getSession();
		Personne person = (Personne)session.getAttribute("person");
		Salle salle = (Salle)session.getAttribute("salle");
		Rdv rdv = (Rdv)session.getAttribute("rdv");
		// Génération du fichier pdf
		response.setContentType( "application/pdf" );
		GenerateurPDF.generateAttestion(masterPath, person, salle, rdv, request, response);
	}
	
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {	
	}
	

}
