package ma.vaccination.ihm;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ma.vaccination.dao.MessageDAO;
import ma.vaccination.model.Message;

/**
 * Servlet implementation class Messages
 */
@WebServlet(urlPatterns="/feedback.html", loadOnStartup=1)
public class Messages extends HttpServlet {
	
	private static final long serialVersionUID = -4319076288258537575L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Message> messages = MessageDAO.getMessages();
		request.setAttribute("messages", messages);
		request.getRequestDispatcher( "pages/feedback.jsp" ).forward( request, response );
	}
	
	@Override
	protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
	}
	

}