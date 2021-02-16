package ma.vaccination.ihm.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class FooterBar  extends TagSupport{
	
	
	private static final long serialVersionUID = 1L;
	
	private String footerBar = "<footer>\r\n"
			+ "            <div class=\"contenu-footer\">\r\n"
			+ "                <div class=\"bloc\">\r\n"
			+ "                    <h3>Informations sur le vaccin</h3>\r\n"
			+ "                    <ul>\r\n"
			+ "                        <li><a href=\"information.html#info1\">Importance et mode d'action</a></li>\r\n"
			+ "                        <li><a href=\"information.html#info2\">Sécurité/Efficacité</a></li>\r\n"
			+ "                        <li><a href=\"information.html#info3\">Population cible</a></li>\r\n"
			+ "                        <li><a href=\"information.html#info4\">Dispositif</a></li>\r\n"
			+ "                        <li><a href=\"information.html#info5\">Effets indésirables</a></li>\r\n"
			+ "                    </ul>\r\n"
			+ "                </div>\r\n"
			+ "                <div class=\"bloc\">\r\n"
			+ "                    <h3>Services</h3>\r\n"
			+ "                    <ul>\r\n"
			+ "                        <li><a href=\"rdv.html\">Prendre un rendez-vous</a></li>\r\n"
			+ "                        <li><a href=\"signal.html\">Signaler un effet secondaire</a></li>\r\n"
			+ "                        <li><a href=\"certificat.html\">Telecharger le certificat de vaccination</a></li>\r\n"
			+ "                    </ul>\r\n"
			+ "                </div>\r\n"
			+ "                <div class=\"bloc\">\r\n"
			+ "                    <h3>Horaires</h3>\r\n"
			+ "                    <ul>\r\n"
			+ "                        <li>✔️ Lun 9h-17h</li>\r\n"
			+ "                        <li>✔️ Mar 9h-17h</li>\r\n"
			+ "                        <li>✔️ Mer 9h-17h</li>\r\n"
			+ "                        <li>✔️ Jeu 9h-17h</li>\r\n"
			+ "                        <li>✔️ Ven 9h-12h</li>\r\n"
			+ "                        <li>✔️ Sam 9h-12h</li>\r\n"
			+ "                        <li>❌ Dim fermé</li>\r\n"
			+ "                    </ul>\r\n"
			+ "                </div>\r\n"
			+ "                <div class=\"bloc\">\r\n"
			+ "                    <h3>Contacts</h3>\r\n"
			+ "                    <ul>\r\n"
			+ "                        <li><span class=\"glyphicon glyphicon-earphone\"></span>+212666666666</li>\r\n"
			+ "                        <li><span class=\"glyphicon glyphicon-envelope\"></span>vaccination.gmail.com</li>\r\n"
			+ "                    </ul>\r\n"
			+ "                </div>\r\n" 
			+ "            </div>\r\n"
			+ "            <div class=\"copyright\">\r\n"
			+ "                <p> Copyright &copy; Tous droits réservés | 2021 - 2022 |</p>\r\n"
			+ "            </div>\r\n"
			+ "        </footer>";
	
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

