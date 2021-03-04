package ma.vaccination.ihm.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class RessourcesImport extends TagSupport{

	private static final long serialVersionUID = 1L;
	public String ressourcesImport=
			 "     <title>Vaccination</title>\r\n"
			+ "     <meta charset=\"UTF-8\">\r\n"
			+ "     <meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\r\n"
			+ "     <meta name=\"description\" content=\"\">\r\n"
			+ "     <meta name=\"keywords\" content=\"\">\r\n"
			+ "     <meta name=\"author\" content=\"\">\r\n"
			+ "     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n"
			+ "     <link rel=\"stylesheet\" href=\"../local/css/font-awesome.min.css\">\r\n"
			+ "     <link rel=\"stylesheet\" href=\"../local/css/aos.css\">\r\n"
			+ "     <link rel=\"stylesheet\" href=\"../local/css/bootstrap.min.css\">\r\n"
			+ "     <link rel=\"stylesheet\" href=\"../local/css/owl.carousel.min.css\">\r\n"
			+ "     <link rel=\"stylesheet\" href=\"../local/css/owl.theme.default.min.css\">\r\n"
			+ "     <!-- MAIN CSS -->\r\n"
			+ "     <link rel=\"stylesheet\" href=\"../local/css/templatemo-digital-trend.css\">\r\n";
		
	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.print( ressourcesImport );
			
		} catch ( IOException exception ) {
			exception .printStackTrace();
		}
		return 2;		// State of the life cycl
	}
}
