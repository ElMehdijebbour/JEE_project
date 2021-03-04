package ma.vaccination.ihm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.vaccination.dao.PersonneDAO;
import ma.vaccination.model.Personne;

/**
 * Servlet implementation class Inscription
 */
@WebServlet(urlPatterns="/inscription.html", loadOnStartup=1)
public class Inscription extends HttpServlet {
	
	private static final long serialVersionUID = -4319076288258537575L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher( "pages/inscription.jsp" ).forward( request, response );
	}
	
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		// Récuperation des données du formulaire d'inscription
		String cin = request.getParameter("txtCIN");
		String password = request.getParameter("txtPassword");
		String nom = request.getParameter("txtNom");
		String prenom = request.getParameter("txtPrenom");
		String adress = request.getParameter("txtAdress");
		String email = request.getParameter("txtEmail");
		String phone = request.getParameter("txtPhone");
		String profession = request.getParameter("txtProfession");
		String age = request.getParameter("txtAge");
		Personne person = new Personne (
								0, 
								cin, 
								password,
								nom,
								prenom,
								adress,
								email, 
								phone,
								profession,
								Integer.parseInt(age)
								);
		// Insertion des infos de la personne dans la database
		boolean bool = PersonneDAO.insertPerson(person);
		if(bool) {
			// Insertion réussie 
			String validation = "est validée";
			request.setAttribute("validation", validation);
		}else {
			// Insertion réfusée
			String validation = "a été réfusée";
			request.setAttribute("validation", validation);
		}
		String operation = "inscription";
		request.setAttribute("operation", operation);
		request.getRequestDispatcher( "pages/validation.jsp" ).forward( request, response );
	}
	

}
