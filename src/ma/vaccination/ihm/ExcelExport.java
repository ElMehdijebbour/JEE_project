package ma.vaccination.ihm;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.vaccination.dao.ExcelDatabaseDAO;
import ma.vaccination.model.ExcelDatabase;
import ma.vaccination.traitment.GenerateurEXCEL;

/**
 * Servlet implementation class ExcelExport
 */
@WebServlet(urlPatterns="/ExcelExport", loadOnStartup=1)
public class ExcelExport extends HttpServlet {
	
	private static final long serialVersionUID = -4319076288258537575L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupartion des  données de la database
		List<ExcelDatabase> list = ExcelDatabaseDAO.getDatabase();
		// Génération du fichier excel
		GenerateurEXCEL.getExcelExport(list,request, response);
	}
	
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		
	}
	
}
