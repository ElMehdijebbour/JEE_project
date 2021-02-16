package ma.vaccination.dao;

import javax.servlet.ServletContext;

public class DAOContext {
	
	protected static String dbURL;
	protected static String dbLogin;
	protected static String dbPassword;	 
	
	public static void init( ServletContext context ) {
		try {
			
			Class.forName( context.getInitParameter( "JDBC_DRIVER" ) );
			dbURL = context.getInitParameter( "JDBC_URL" );
			dbLogin = context.getInitParameter( "JDBC_LOGIN" );
			dbPassword = context.getInitParameter( "JDBC_PASSWORD" );
			System.out.println(dbURL);
			System.out.println(dbLogin);
			System.out.println(dbPassword);
		
		} catch( Exception exception ) {
			
			exception.printStackTrace();
			
		}
	}
	
}

