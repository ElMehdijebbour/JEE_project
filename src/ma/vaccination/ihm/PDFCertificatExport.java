package ma.vaccination.ihm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// Récupération des données de la personne 
		String cin = request.getParameter("txtCIN");
		Personne person = new Personne(0,cin,"", "FOSTINOS", "Fostinos","Av Allal Al Fassi","","","Etudiant",20);
		// Génération du fichier pdf
		response.setContentType( "application/pdf" );
		GenerateurPDF.generateCertificat(masterPath,person, request, response);
	
	}
	

}
