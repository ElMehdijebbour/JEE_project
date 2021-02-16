<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://vaccination.ma/tld/extratags" prefix="component" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Vaccination</title>
        <link rel="stylesheet" href="local/styles/bootstrap.css"/> 
		<link rel="stylesheet" type="text/css" href="local/styles/inscription.css" />
	</head>
	<body>
			<form action="index.html" method="POST" >
		    <div class="login-box">
		    
				<h2>Inscription</h2>
				<div class="textbox">
					  <span class="glyphicon glyphicon-user"></span>
					  <input type="text" placeholder="CIN" name="txtCIN" autofocus>
				</div>
				
				<div class="textbox">
				  <span class="glyphicon glyphicon-lock"></span>
				  <input type="password" placeholder="Password" name="txtPassword" autofocus>
				</div>
				
				<div class="textbox">
					<input type="text" placeholder="Nom" name="txtName" autofocus>
				</div>
				<div class="textbox">
					<input type="text" placeholder="Prénom" name="txtSurname" autofocus>
				</div> 
				
				<div class="textbox">
					<input type="text" placeholder="Ville" name="txtVille" autofocus>
				</div>
				<div class="textbox">
					<input type="text" placeholder="Region" name="txtRegion" autofocus>
				</div>
				<div class="textbox">
					<input type="text" placeholder="Municipalite" name="txtMunicipalite" autofocus>
				</div>
				<div class="textbox">
					<input type="text" placeholder="Adresse" name="txtAdress" autofocus>
				</div>
				<div class="textbox">
					<input type="text" placeholder="Telephone" name="txtPhone" autofocus>
				</div>
				<div class="textbox">
					<input type="text" placeholder="Email" name="txtEmail" autofocus>
				</div>
				<input class="btn btn-success btn-lg" type="submit" value='Sign in'/>
				<br/><br/>
			</div>
			</form>
	</body>
	
</html>