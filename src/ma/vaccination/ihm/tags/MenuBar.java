package ma.vaccination.ihm.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MenuBar  extends TagSupport{
	
	private static final long serialVersionUID = 1L;
	
	private String menuBar = "<div class=\"menu-bar\">\r\n"
			+ "                <ul>\r\n"
			+ "                    <a href=\"index.html\"> \r\n"
			+ "                        <h4 class=\"relative\">Vaccination <br/> Covid</h4>\r\n"
			+ "                    </a>\r\n"
			+ "                    <li><a href=\"index.html\">Acceuil</a></li>\r\n"
			+ "                    <li>\r\n"
			+ "                        <a href=\"information.html\">Informations</a>\r\n"
			+ "                        <ul class=\"submenu\">\r\n"
			+ "                            <li><a href=\"information.html#info1\">Importance et mode d'action</a></li>\r\n"
			+ "                            <li><a href=\"information.html#info2\">Sécurité/Efficacité</a></li>\r\n"
			+ "                            <li><a href=\"information.html#info3\">Population cible</a></li>\r\n"
			+ "                            <li><a href=\"information.html#info4\">Dispositif</a></li>\r\n"
			+ "                            <li><a href=\"information.html#info5\">Effets indésirables</a></li>\r\n"
			+ "                            <li><a href=\"information.html#info6\">Horaires des centres de vaccination</a></li>\r\n"
			+ "                        </ul>\r\n"
			+ "                    </li>\r\n"
			+ "                    <li>\r\n"
			+ "                        <a href=\"service.html\">Services</a>\r\n"
			+ "                        <ul class=\"submenu\">\r\n"
			+ "                            <li><a href=\"rdv.html\">Prendre un rendez-vous</a></li>\r\n"
			+ "                            <li><a href=\"signal.html\">Signaler un effet secondaire</a></li>\r\n"
			+ "                            <li><a href=\"certificat.html\">Telecharger le certificat de vaccination</a></li>\r\n"
			+ "                        </ul>\r\n"
			+ "                    </li>\r\n"
			+ "                    <li><a href=\"inscription.html\">Inscription</a></li>\r\n"
			+ "                    <li><a href=\"contact.html\">Contact</a></li>\r\n"
			+ "                </ul>\r\n"
			+ "            </div>";
	
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
