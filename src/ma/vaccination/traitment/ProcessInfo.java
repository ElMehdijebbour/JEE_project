package com.vaccination.traitement;
import java.io.IOException;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vaccination.model.Personne;
 
@WebServlet("/ProcessInfo")
public class ProcessInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProcessInfo() {
        super();
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// The URL to send data to (JSP FILE)
		String url = "/Display.jsp";
		
		// NEW Error message to display on the screen
		String errorMsg = "";
		
		// DATABASE EXAMPLE
		// NEW Add new data
		// Get the data entered on index.jsp
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String ville=request.getParameter("ville");
		String region=request.getParameter("region");
		String adress=request.getParameter("adress");
		String municipalite=request.getParameter("municipalite");
		String cin=request.getParameter("cin");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		// NEW Create object to pass to DisplayInfo.jsp
		Personne pers = new Personne( nom,  prenom, ville,  region,  adress,  municipalite,
				cin,  email,  password,  phone);
		request.setAttribute("pers", pers);

		// NEW Update the DB
	if(!url.equals("/index.jsp")) {
		updateDB( nom, prenom,  ville,region,adress, municipalite,
		 cin, email, password ,phone);
		}
		
		// NEW Create object to pass to DisplayInfo.jsp 
		// a faire
		// Forward data to DisplayInfo.jsp
		getServletContext()
			.getRequestDispatcher(url)
			.forward(request, response);
	}
	
	static boolean regexChecker(String theRegex, 
			String str2Check) {
		
		// You define the regex using pattern
		Pattern regexPattern = 
				Pattern.compile(theRegex);
				
		// Matcher searches a string for a match
		Matcher regexMatcher = 
				regexPattern.matcher(str2Check);
		
		if (regexMatcher.matches()){
			return true;
		} else {
			return false;
		}
		
	}
	
	// Setup MySQL Connector
	// Copy mysql-connector-java-8.0.15.jar into 
	// /WebContent/WEB-INF/lib/
	
	/*
	 * CREATE USER 'admin_platform'@'localhost' IDENTIFIED BY 'admin';
	 * GRANT ALL PRIVILEGES ON vac_db.personne TO 
	 * 'admin_platform'@'localhost' IDENTIFIED BY 'admin';
	 */
	
	// Adds users to the DB
		protected void updateDB(String nom, String prenom, String ville, String region, String adress, String municipalite,
				String cin, String email, String password, String phone)  {
			// Connects to the DB
			Connection con;
			
			try {
				// Everything needed to connect to the DB
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// NEW Update database name
				String url = "jdbc:mysql://localhost/vac_db";
		        String user = "admin_platform";
		      
		        String pw = "admin";
		        // Used to issue queries to the DB
		        con = DriverManager.getConnection(url, user,pw);
		        
		        // Sends queries to the DB for results
		        Statement s = con.createStatement();
		        
		        // Add a new entry
		        String query = "INSERT INTO PERSONNE " + 
		        "(nom,prenom,ville,region,adress,municipalite,cin,email,password,phone) " + 
		        "VALUES ('" + nom + "', '" + prenom + "', '" +
		        ville + "', '" + region + "', '" + adress + "', '" +
		        municipalite + "','" + cin + "', '" + email + "', '" + password + "', '" +
		        phone + "')";
		        
		        // Execute the Query
		        s.executeUpdate(query);
		        
		        // Close DB connection
		        con.close();
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
 
}