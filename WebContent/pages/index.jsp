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
      <!-- HERO -->
      <section class="hero hero-bg d-flex justify-content-center align-items-center">
         <div class="container">
            <div class="row">
               <div class="col-lg-6 col-md-10 col-12 d-flex flex-column justify-content-center align-items-center">
                  <div class="hero-text">
                     <h1 class="text-white" data-aos="fade-up">Bienvenue dans la plateforme de vaccination de l'INPT</h1>
                     <a href="contact.html" class="custom-btn btn-bg btn mt-3" data-aos="fade-up" data-aos-delay="100">Obtenir du soutien</a>
                     <strong class="d-block py-3 pl-5 text-white" data-aos="fade-up" data-aos-delay="200"><i class="fa fa-phone mr-2"></i> +212 699443980</strong>
                  </div>
               </div>
               <div class="col-lg-6 col-12">
                  <div class="hero-image" data-aos="fade-up" data-aos-delay="300">
                     <img src="local/images/working-girl.png" class="img-fluid" alt="working girl">
                  </div>
               </div>
            </div>
         </div>
      </section>
      <!-- ABOUT -->
      <section class="about section-padding pb-0" id="about">
         <div class="container">
            <div class="row">
               <div class="col-lg-7 mx-auto col-md-10 col-12">
                  <div class="about-info">
                     <h2 class="mb-4" data-aos="fade-up">Opération de <strong> Vaccination </strong>contre le virus de la Covid-19 </h2>
                     <p class="mb-0" data-aos="fade-up">La campagne de vaccination contre le virus de la Covid-19 va couvrir tout le territoire marocain et concernera une population de plus de 18 ans, en priorisant les Professionnels de Santé, les autorités publiques, les forces de sécurité et le personnel de l’Education Nationale, et par la suite, et de façon progressive et par tranche d’âge, au reste de la population, et ce, conformément aux recommandations de l’Organisation Mondiale de la Santé.
                        <a href="blog.html">blog</a> pages, <a href="project-detail.html">project</a> page, and <a href="contact.html">contact</a> page. 
                        <br><br>Pour assurer <strong>l’immunité</strong> du groupe et par conséquent mitiger la transmission du virus, il faut vacciner au moins 80% de la population cible qui est de l’ordre de 25 millions de personnes. 
                     </p>
                  </div>
                  <div class="about-image" data-aos="fade-up" data-aos-delay="200">
                     <img src="local/images/office.png" class="img-fluid" alt="office">
                  </div>
               </div>
            </div>
         </div>
      </section>
      <!-- PROJECT -->
      <section class="project section-padding" id="project">
         <div class="bg-default">
            <div class="main-content">
               <div class="header bg-gradient-primary pb-8 pt-5 pt-md-8">
                  <div class="container-fluid">
                     <h1 style="text-align:center;margin:10px;color:#1273eb">Statistiques</h1>
                     <div class="header-body">
                        <div class="row">
                           <div class="col-xl-3 col-lg-6">
                              <div class="card card-stats mb-4 mb-xl-0">
                                 <div class="card-body">
                                    <div class="row">
                                       <div class="col">
                                          <h5 class="card-title text-uppercase text-muted mb-0">Nombre
                                          de personnes vaccinées</h5>
                                          <span class="h2 font-weight-bold mb-0">${rdvPresent}</span>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                           <div class="col-xl-3 col-lg-6">
                              <div class="card card-stats mb-4 mb-xl-0">
                                 <div class="card-body">
                                    <div class="row">
                                       <div class="col">
                                          <h5 class="card-title text-uppercase text-muted mb-0"> Nombre de personnes
                                          inscrits</h5>
                                          <span class="h2 font-weight-bold mb-0">${inscrits}</span>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                           <div class="col-xl-3 col-lg-6">
                              <div class="card card-stats mb-4 mb-xl-0">
                                 <div class="card-body">
                                    <div class="row">
                                       <div class="col">
                                          <h5 class="card-title text-uppercase text-muted mb-0">Nombre de personnes
                                          ayant rendez-vous</h5>
                                          <span class="h2 font-weight-bold mb-0">${rdv}</span>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                           <div class="col-xl-3 col-lg-6">
                              <div class="card card-stats mb-4 mb-xl-0">
                                 <div class="card-body">
                                    <div class="row">
                                       <div class="col">
                                          <h5 class="card-title text-uppercase text-muted mb-0">Nombre
                                          de personnes absentes au rendez-vous</h5>
                                          <span class="h2 font-weight-bold mb-0">${rdvAbsent}</span>
                                       </div>
                                    </div>
                                 </div>
                              </div>
                           </div>
                           <div class="contenu-bloc">
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
               <!-- Page content -->
            </div>
         </div>
      </section>
      <component:FooterBar></component:FooterBar>
   </body>
</html>