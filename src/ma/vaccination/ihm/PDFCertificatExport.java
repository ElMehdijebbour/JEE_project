package ma.vaccination.ihm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.vaccination.dao.PersonneDAO;
import ma.vaccination.model.Personne;
import ma.vaccination.traitment.GenerateurPDF;

/**
 * Servlet implementation class PDFCertificatExport
 */
@WebServlet(urlPatterns="/PDFCertificat", loadOnStartup=1)
public class PDFCertificatExport extends HttpServlet {
	
	private static final long serialVersionUID = -4319076288258537575L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		// Chargement du path du fichier pdf model du certificat
		String masterPath = request.getServletContext().getRealPath( "/WEB-INF/CertificatMaster.pdf" );
		// Rcupration des donnes de la personne 
		String cin = request.getParameter("txtCIN");
		String password = request.getParameter("txtPassword");
		Personne person = PersonneDAO.isLoginValid(cin, password);
		if( person != null ) {
			// Connexion russie 
			// Gnration du fichier pdf
			response.setContentType( "application/pdf" );
			GenerateurPDF.generateCertificat(masterPath,person, request, response);
		}else {
			// Connexion choue : affichage de message d'erreur sur la page d'authentification
			request.setAttribute("errorMessage", "Bad identity");
			request.getRequestDispatcher( "pages/certificat.jsp" ).forward( request, response );
		}
		
	
	}
	

}
