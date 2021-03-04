<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://vaccination.ma/tld/extratags" prefix="component" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="utf-8" />
      <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
      <link rel="icon" type="image/png" href="../assets/img/favicon.ico">
      <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
      <title>Vaccination</title>
      <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
      <!--     Fonts and icons     -->
      <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
      <!-- CSS Files -->
      <link href="local/css/bootstrap.min.css" rel="stylesheet" />
      <link href="local/css/light-bootstrap-dashboard.css?v=2.0.0 " rel="stylesheet" />
      <!-- CSS Just for demo purpose, don't include it in your project -->
      <link href="local/css/demo.css" rel="stylesheet" />
   </head>
   <body>
      <div class="wrapper">
         <div class="sidebar" data-image="local/images/insc.png" data-color="black">
            <!--
               Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"
               
               Tip 2: you can also add an image using data-image tag
               -->
            <div class="sidebar-wrapper">
               <div class="logo">
                  <a href="index.html" class="simple-text">
                  Vaccination Home
                  </a>
               </div>
               <ul class="nav">
                  <li class="nav-item active">
                     <a class="nav-link" href="station.html">
                     <i class="nc-icon nc-chart-pie-35"></i>
                     Dashboard
                     </a>
                  </li>
                  <li>
                     <a class="nav-link" href="exportation.html">
                     <i class="nc-icon nc-circle-09"></i>
                     Exporter des données
                     </a>
                  </li>
                  <li>
                     <a class="nav-link" href="feedback.html">
                     <i class="nc-icon nc-notes"></i>
                     Voir les feedback
                     </a>
                  </li>
               </ul>
            </div>
         </div>
         <div class="main-panel">
            <!-- Navbar -->
            <nav class="navbar navbar-expand-lg " >
               <div class="container-fluid">
                  <a class="navbar-brand" href="station.html"> Dashboard </a>
                  <div class="collapse navbar-collapse justify-content-end" id="navigation">
                     <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                           <a class="nav-link" href="index.html">
                           <span class="no-icon">Log out</span>
                           </a>
                        </li>
                     </ul>
                  </div>
               </div>
            </nav>
            <!-- End Navbar -->
            <div class="content">
               <div class="container-fluid">
                  <c:forEach items="#{messages}" var="message">
                     <div class="col-md-12">
                        <div class="card ">
                           <div class="card-body ">
                              <p>
                                 ${message.feedback.fb_description}
                              </p>
                              <h4><span style="color:#1273eb">Age :</span> ${message.person.age} ans</h4>
                              <p style="color:#1273eb"><span class="glyphicon glyphicon-earphone"></span> &nbsp;  ${message.person.phone}</p>
                              <p style="color:#1273eb"><span class="glyphicon glyphicon-envelope"></span> &nbsp;  ${message.person.email}</p>
                              <h4><span style="color:#1273eb">Date d'envoi :</span> ${message.feedback.fb_date}</h4>
                           </div>
                        </div>
                     </div>
                  </c:forEach>
               </div>
            </div>
         </div>
      </div>
   </body>
   <!--   Core JS Files   -->
   <script src="local/js/core/jquery.3.2.1.min.js" type="text/javascript"></script>
   <script src="local/js/core/popper.min.js" type="text/javascript"></script>
   <script src="lcoal/js/core/bootstrap.min.js" type="text/javascript"></script>
   <script src="local/js/light-bootstrap-dashboard.js?v=2.0.0 " type="text/javascript"></script>
</html>