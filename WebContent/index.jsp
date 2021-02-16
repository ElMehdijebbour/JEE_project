<!-- 
Working JSP Files
1. Right click -> New -> JSP File
2. Create ProcessInfo.java Servlet to handle this
--> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Testing JSP</title>
</head>
<body>
 
<!-- NEW Declare the taglib directive specifying the JSTL library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<h3>Enter some Info</h3>
 
<form action="ProcessInfo" method="post">
<!-- pers = new Personne( nom,  prenom, ville,  region,  adress,  municipalite,
				cin,  email,  password,  phone); -->
<!-- NEW Add values that will hold data customer previously entered 
and additional data -->
<label>First Name : </label>
<input type="text" name="nom" value="${pers.nom }"><br><br>
<label>Last Name : </label>
<input type="text" name="prenom" value="${pers.prenom }"><br><br>
<label>Ville : </label>
<input type="text" name="ville" value="${pers.ville }"><br><br>
<label>Region: </label>
<input type="text" name="region" value="${pers.region }"><br><br>
<label>Adress : </label>
<input type="text" name="adress" value="${pers.adress }"><br><br>
<label>Municpalite : </label>
<input type="text" name="municpalite" value="${pers.municipalite }"><br><br>
<label>Cin : </label>
<input type="text" name="cin" value="${pers.cin }"><br><br>
<label>Email : </label>
<input type="text" name="email" value="${pers.email }"><br><br>
<label>Phone : </label>
<input type="text" name="phone" value="${pers.phone}"><br><br>
<label>Password : </label>
<input type="text" name="password" value="${pers.password }"><br><br>
<input type="submit" value="Send">
</form>
 
<!-- Get passed parameter value -->
 
</body>
</html>