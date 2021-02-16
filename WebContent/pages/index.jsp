<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://vaccination.ma/tld/extratags" prefix="component" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <title>Vaccination</title>
        <link rel="stylesheet" href="local/styles/bootstrap.css"/> 
        <link rel="stylesheet" type="text/css" href="local/styles/home.css" />
        <link rel="stylesheet" type="text/css" href="local/styles/index.css" />
        <link rel="stylesheet" type="text/css" href="local/styles/contenu.css" />
	</head>
	<body>
        <div class="menu">
        
            <component:MenuBar></component:MenuBar>
            
            <div class="contenu">
                <div class="bienvenu">
                    <h2>Bienvenue sur le portail de la campagne de </br>
                        <span>vaccination contre le coronavirus</span>
                    </h2>
                </div>

                <div class="contenu-bloc">
                    <h3>Statistiques</h3>
                    <div>
                        <div>

                        </div>
                    </div>
                </div>

                <div class="contenu-bloc">
                    <h3 >Opération de vaccination</h3>
                    <div>
                        <p> La campagne de vaccination contre le virus de la Covid-19 va couvrir tout le territoire 
                        marocain et concernera une population de plus de 18 ans,
                        en priorisant les Professionnels de Santé, les autorités publiques,
                        les forces de sécurité et le personnel de l’Education Nationale, et par la suite, 
                        et de façon progressive et par tranche d’âge, au reste de la population, et ce,  
                        conformément aux recommandations de l’Organisation Mondiale de la Santé.</br></br>
                        Pour assurer l’immunité du groupe et par conséquent mitiger la transmission du virus, 
                        il faut vacciner au moins 80% de la population cible qui est de l’ordre de 25 millions de personnes.</p>
                    </div>
                </div>
                
            </div>

        </div>
        
        <component:FooterBar></component:FooterBar>
        
    </body>
</html>