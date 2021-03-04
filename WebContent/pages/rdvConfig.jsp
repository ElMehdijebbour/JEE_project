<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://vaccination.ma/tld/extratags" prefix="component" %>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="utf-8" />
      <link rel="apple-touch-icon" sizes="76x76" href="local/assets/img//apple-icon.png">
      <link rel="icon" type="image/png" href="local/assets/img//favicon.png">
      <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
      <title>
         Vaccination
      </title>
      <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
      <!--     Fonts and icons     -->
      <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
      <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
      <!-- CSS Files -->
      <link href="local/css/bootstrap.min.css" rel="stylesheet" />
      <link href="local/css/paper-kit.css" rel="stylesheet" />
      <!-- CSS Just for demo purpose, don't include it in your project -->
      <link href="local/demo/demo.css" rel="stylesheet" />
   </head>
   <body class="register-page sidebar-collapse">
      <div class="page-header" style="background-image: url('local/images/back.jpg');background-color: rgba(255,255,255,1);
         background-blend-mode: luminosity;">
         <div class="filter"></div>
         <div class="container">
            <div class="row">
               <div class="col-lg-4 ml-auto mr-auto">
                  <div class="card card-register">
                     <h3 class="title mx-auto">Fixer les informations du rendez-vous</h3>
                     <h4 class="title mx-auto" >Attention respectez les horaires</h4>
                     <form action="rdvConfig.html" method="POST">
                        <div class="input-group date" id="datetimepicker">
                           <input name="txtDate" type="date" class="form-control" placeholder="03/03/2021">
                        </div>
                        <div class="textbox">
                           <h4 class="title mx-auto" >Heure :</h4>
                           <input class="form-control" type="time" min="09:00" max="17:00" id="forHeure" name="txtHeure" required >
                        </div>
                        <h4 class="title mx-auto" >Salle :</h4>
                        <div class="input-group col-lg-12 mb-4">
                           <div class="input-group-prepend">
                              <span class="input-group-text bg-white px-4 border-md border-right-0">
                              <i class="fa fa-briefcase text-muted"></i>
                              </span>
                           </div>
                           <select id="job" name="txtSalle" class="form-control custom-select bg-white border-left-0 border-md">
                              <option>B110</option>
                              <option>B112</option>
                              <option>B114</option>
                              <option selected>B206</option>
                              <option>B210</option>
                           </select>
                        </div>
                        <h4>Télécharger l'attestation de rendez-vous</h4>
                        <button class="btn btn-danger btn-block btn-round" type="submit"  >Telecharger</button>
                     </form>
                     <div class="forgot">
                        <a href="index.html" class="btn btn-link btn-danger">Go HomePage</a>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
</html>