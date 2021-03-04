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
   </head>
   <body>
      <div class="menu">
         <component:MenuBar></component:MenuBar>
         <div class="contenu">
            <div class="contenu-bloc">
               <h3>Prendre un rendez-vous</h3>
               <div>
                  <p>Avant de prendre un rendez-vous, assurez-vous d'être inscrits sur notre site.
                     Vous utiliserez votre CIN et mot de passe pour vous connecter et fixer votre rendez-vous.
                  </p>
                  <div>
                     <a href="inscription.html" class="btn btn-success btn-lg">S'inscrire</a> 
                     <a href="rdv.html" class="btn btn-success btn-lg">Rendez-vous</a>
                  </div>
               </div>
            </div>
            <div class="contenu-bloc">
               <h3>Signaler un effet secondaire</h3>
               <div>
                  <p>
                     Suivez votre état de santé vaccinale et déclarez tout évènement observé après vaccination contre 
                     le virus de la covid-19.
                  </p>
                  <div>
                     <a href="signal.html" class="btn btn-success btn-lg">Signaler</a> 
                  </div>
               </div>
            </div>
            <div class="contenu-bloc">
               <h3>Telecharger le certificat de vaccination</h3>
               <div>
                  <p>
                     Après votre vaccination, veuillez télécharger votre certificat de vaccination.
                  </p>
                  <div>
                     <a href="certificat.html" class="btn btn-success btn-lg">Certificat</a> 
                  </div>
               </div>
            </div>
         </div>
      </div>
      <component:FooterBar></component:FooterBar>
   </body>
</html>