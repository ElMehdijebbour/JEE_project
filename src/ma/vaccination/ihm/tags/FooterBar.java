package ma.vaccination.ihm.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class FooterBar  extends TagSupport{
	
	
	private static final long serialVersionUID = 1L;
	
	private String footerBar = "<footer class=\"site-footer\">\r\n"
    + "     <div class=\"container\">\r\n"
    + "       <div class=\"row\">\r\n"
    + "         <div class=\"col-lg-5 mx-lg-auto col-md-8 col-10\">\r\n"
    + "           <h1 class=\"text-white\" data-aos=\"fade-up\" data-aos-delay=\"100\">Restons                <strong>Solidaire</strong> Toujours!</h1>\r\n"
    + "         </div>\r\n"
    + "         <div class=\"col-lg-3 col-md-6 col-12\" data-aos=\"fade-up\" data-aos-delay=\"200\">\r\n"
    + "           <h4 class=\"my-4\">Contact Info</h4>\r\n"
    + "           <p class=\"mb-1\">\r\n"
    + "             <i class=\"fa fa-phone mr-2 footer-icon\"></i>\r\n"
    + "              +212 699443980\r\n"
    + "           </p>\r\n"
    + "           <p>\r\n"
    + "             <a href=\"#\">\r\n"
    + "               <i class=\"fa fa-envelope mr-2 footer-icon\"></i>\r\n"
    + "               contact@inpt.ac.ma\r\n"
    + "             </a>\r\n"
    + "           </p>\r\n"
    + "         </div>\r\n"
    + "         <div class=\"col-lg-3 col-md-6 col-12\" data-aos=\"fade-up\" data-aos-delay=\"300\">\r\n"
    + "           <h4 class=\"my-4\">Adresse</h4>\r\n"
    + "           <p class=\"mb-1\">\r\n"
    + "             <i class=\"fa fa-home mr-2 footer-icon\"></i> \r\n"
    + "             Institut national des postes et télécommunications, Avenue Allal Al Fassi, Rabat, Maroc\r\n"
    + "           </p>\r\n"
    + "         </div>\r\n"
    + "         <div class=\"col-lg-4 mx-lg-auto text-center col-md-8 col-12\" data-aos=\"fade-up\" data-aos-delay=\"400\">\r\n"
    + "           <p class=\"copyright-text\">© 2021 Institut National des Postes et Télécommunications\r\n"
    + "           <br>\r\n"
    + "         </div>\r\n"
    + "       </div>\r\n"
    + "     </div>\r\n"
    + "   </footer>"
	+"		<script src=\"local/js/jquery.min.js\"></script>\r\n"
	+ "     <script src=\"local/js/bootstrap.min.js\"></script>\r\n"
	+ "     <script src=\"local/js/aos.js\"></script>\r\n"
	+ "     <script src=\"local/js/owl.carousel.min.js\"></script>\r\n"
	+ "     <script src=\"local/js/smoothscroll.js\"></script>\r\n"
	+ "     <script src=\"local/js/custom.js\"></script>";
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.print( footerBar );
			
		} catch ( IOException exception ) {
			exception .printStackTrace();
		}
		return 2;		// State of the life cycle of my TagSupport 
	}
	

}

