<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://vaccination.ma/tld/extratags" prefix="component" %>
<!DOCTYPE html>
<html lang="en">
   <head>
      <title>Vaccination</title>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=Edge">
      <meta name="description" content="">
      <meta name="keywords" content="">
      <meta name="author" content="">
      <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
      <link rel="stylesheet" href="local/css/bootstrap.min.css">
      <link rel="stylesheet" href="local/css/font-awesome.min.css">
      <link rel="stylesheet" href="local/css/aos.css">
      <link rel="stylesheet" href="local/css/owl.carousel.min.css">
      <link rel="stylesheet" href="local/css/owl.theme.default.min.css">
      <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
      <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.3.1/css/all.min.css" rel="stylesheet">
      <!-- MAIN CSS -->
      <link rel="stylesheet" href="local/css/templatemo-digital-trend.css">
   </head>
   <body>
      <component:MenuBar></component:MenuBar>
      <!-- CONTACT -->
      <section class="contact section-padding">
         <div class="container">
            <div class="row">
               <div class="col-lg-6 mx-auto col-md-7 col-12 py-5 mt-5 text-center" data-aos="fade-up">
                  <h1 class="mb-4">Bonjour, vous avez des  <strong>reclamations </strong> ou avez vous besoin d'<strong> Aide </strong>n'hesitez pas de nous contacter!</h1>
               </div>
               <div class="col-lg-8 mx-auto col-md-10 col-12">
                  <form action="signal.html" method="post" class="contact-form" data-aos="fade-up" data-aos-delay="300" role="form">
                     <div class="row">
                        <div class="col-lg-6 col-12">
                           <input type="text" class="form-control" name="txtCIN" placeholder="CIN" value="${txtCIN}" autofocus required>
                        </div>
                        <div class="col-lg-6 col-12">
                           <input id="password" type="password" name="txtPassword" placeholder="Password" class="form-control">
                        </div>
                        <div class="col-lg-12 col-12">
                           <textarea class="form-control" rows="6" name="txtMessage" placeholder="description des effets secondaires" required>${txtMessage}</textarea>
                        </div>
                        <div class="col-lg-5 mx-auto col-7">
                           <button type="submit" class="form-control" id="submit-button" name="envoyer">Signaler</button>
                        </div>
                        <div class="errorMessage">${errorMessage}</div>
                     </div>
                  </form>
               </div>
            </div>
         </div>
      </section>
      <component:FooterBar></component:FooterBar>
   </body>
</html>