<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://vaccination.ma/tld/extratags" prefix="component" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <title>Vaccination</title>
        <link rel="stylesheet" href="local/styles/bootstrap.css"/> 
        <link rel="stylesheet" type="text/css" href="local/styles/home.css" />
        <link rel="stylesheet" type="text/css" href="local/styles/contenu.css" />
        <link rel="stylesheet" type="text/css" href="local/styles/login.css" />
	</head>
	<body>
        <div class="menu">
        
        	<component:MenuBar></component:MenuBar>
        	
            <div class="contenu">
	            <div class="contenu-bloc">
	                <a name="info1"></a>
	                <h3>Signaler un effet secondaire suite à votre vaccination</h3>
	                <div>
	                    <form action="" method="POST" >
	                        <div class="login-box">
	                        
	                            <h4>Authentification</h4>
	                            <div class="textbox">
	                                  <span class="glyphicon glyphicon-user"></span>
	                                  <input type="text" placeholder="CIN" name="txtCIN" autofocus>
	                            </div>
	                            
	                            <div class="textbox">
	                              <span class="glyphicon glyphicon-lock"></span>
	                              <input type="password" placeholder="Password" name="txtPassword" autofocus>
	                            </div>
	                            </br>
	                            <h4>Message</h4>
	                            <div >
	                                <textarea type="text" name="txtMessage" rows="4" cols="75" ></textarea>
	                              </div>
	                            <input class="btn btn-success btn-lg" type="submit" value='Signaler'/>
	                            <br/><br/>
	                            <div class="errorMessage">${errorMessage}</div>
	                            
	                        </div>
	                    </form>
	                </div>
	            </div>
        	</div>
        	
        </div>
        
        <component:FooterBar></component:FooterBar>
        
    </body>
</html>