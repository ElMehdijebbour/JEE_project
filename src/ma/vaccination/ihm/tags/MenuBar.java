package ma.vaccination.ihm.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MenuBar  extends TagSupport{
	
	private static final long serialVersionUID = 1L;
	private String menuBar = "    <nav class=\"navbar navbar-expand-lg\">\r\n"
			+ "        <div class=\"container\">\r\n"
			+ "            <a class=\"navbar-brand\" href=\"index.html\">\r\n"
			+ "			    <div class=\"row\">\r\n"
			+ "					<img src=\"local/images/logo.png\" style=\"width:110px;height=100px\">"
			+ "					<img src=\"http://www.inpt.ac.ma/sites/all/themes/custom/inpt/img/logo-text.png\" class=\"logo-text-img\" alt=\"\">\r\n"
			+ "						 <h5>DIGITAL <br>     INNOVATION <br>    BY INPT</h5>			<!-- \"La Grande École<br>des Télécommunications<br>et des Technologies<br>de l’Information\"-->\r\n"
			+ "						</div>\r\n"
			+ "				\r\n"
			+ "			     </div>\r\n"
			+ "			  <div class=\"logo-text text-uppercase\">\r\n"
			+ "            </a>\r\n"
			+ "           \r\n"
			+ "            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\"\r\n"
			+ "                aria-label=\"Toggle navigation\">\r\n"
			+ "                <span class=\"navbar-toggler-icon\"></span>\r\n"
			+ "            </button>\r\n"
			+ "\r\n"
			+ "            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n"
			+ "                <ul class=\"navbar-nav ml-auto\">\r\n"
			+ "	                <div class=\"navbar-collapse text-center\" id=\"navbarResponsive\">\r\n"
			+ "						<ul class=\"navbar-nav ml-auto\">\r\n"
			+ "						 <li class=\"nav-item dropdown\">\r\n"
			+ "								<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n"
			+ "								  Services\r\n"
			+ "								</a>\r\n"
			+ "								<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n"
			+ "								  <a class=\"dropdown-item\" href=\"rdv.html\">Prendre un rendez-vous</a>\r\n"
			+ "								  <a class=\"dropdown-item\" href=\"signal.html\">Signaler un effet secondaire</a>\r\n"
			+ "								  <a class=\"dropdown-item\" href=\"certificat.html\">Telecharger le certificat de vaccination</a>	\r\n"
			+ "								   \r\n"
			+ "							</div>\r\n"
			+ "						  </li>\r\n"
			+ "						</ul>\r\n"
			+ "					  </div>\r\n"
			+ "            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n"
			+ "                <ul class=\"navbar-nav ml-auto\">\r\n"
			+ "	                <div class=\"navbar-collapse text-center\" id=\"navbarResponsive\">\r\n"
			+ "						<ul class=\"navbar-nav ml-auto\">\r\n"
			+ "						 <li class=\"nav-item dropdown\">\r\n"
			+ "								<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n"
			+ "								  Informations\r\n"
			+ "								</a>\r\n"
			+ "								<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n"
			+ "										  <a class=\"dropdown-item\" href=\"information.html#info1\">Importance et mode d'action</a>\r\n"
			+ "										  <a class=\"dropdown-item\" href=\"information.html#info2\">Sécurité/Efficacité</a>\r\n"
			+ "										  <a class=\"dropdown-item\" href=\"information.html#info3\">Population cible</a>	\r\n"
			+ "										  <a class=\"dropdown-item\" href=\"information.html#info4\">Dispositif</a>	\r\n"
			+ "										  <a class=\"dropdown-item\" href=\"information.html#info5\">Effets indésirables</a>\r\n"
			+ "										  <a class=\"dropdown-item\" href=\"information.html#info6\">Horaires des centres de vaccination</a>	\r\n"
			+ "								   \r\n"
			+ "							</div>\r\n"
			+ "						  </li>\r\n"
			+ "						</ul>\r\n"
			+ "					  </div>\r\n"
			+ "                    <li class=\"nav-item\">\r\n"
			+ "                        <a href=\"inscription.html\" class=\"nav-link\">Inscription</a>\r\n"
			+ "                    </li>\r\n"
			+ "                    <li class=\"nav-item\">\r\n"
			+ "                        <a href=\"contact.html\" class=\"nav-link contact\">Contact</a>\r\n"
			+ "                    </li>\r\n"
			+ "                </ul>\r\n"
			+ "            </div>\r\n"
			+ "        </div>\r\n"
			+ "    </nav>";
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.print( menuBar );
			
		} catch ( IOException exception ) {
			exception .printStackTrace();
		}
		return 2;		// State of the life cycle of my TagSupport 
	}
	

}
