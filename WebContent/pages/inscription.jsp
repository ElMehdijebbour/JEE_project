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
      <!-- BLOG -->
      <section class="blog section-padding">
         <div class="container">
            <div class="row py-5 mt-4 align-items-center">
               <!-- For Demo Purpose -->
               <div class="col-md-5 pr-lg-5 mb-5 mb-md-0">
                  <img src="local/images/office.png" alt="" class="img-fluid mb-3 d-none d-md-block">
               </div>
               <!-- Registeration Form -->
               <div class="col-md-7 col-lg-6 ml-auto">
                  <form action="#" method="POST">
                     <div class="row">
                        <!-- CIN -->
                        <div class="input-group col-lg-6 mb-4">
                           <div class="input-group-prepend">
                              <span class="input-group-text bg-white px-4 border-md border-right-0">
                              <i class="fa fa-user text-muted"></i>
                              </span>
                           </div>
                           <input id="firstName" type="text" name="txtCIN" placeholder="CIN" class="form-control bg-white border-left-0 border-md" autofocus required>
                        </div>
                        <!-- Age -->
                        <div class="input-group col-lg-6 mb-4">
                           <div class="input-group-prepend">
                              <span class="input-group-text bg-white px-4 border-md border-right-0">
                              <i class="fa fa-child text-muted"></i>
                              </span>
                           </div>
                           <input type="number" placeholder="Age" name="txtAge" class="form-control bg-white border-left-0 border-md" required>	
                        </div>
                        <!-- Last Name -->
                        <div class="input-group col-lg-6 mb-4">
                           <div class="input-group-prepend">
                              <span class="input-group-text bg-white px-4 border-md border-right-0">
                              <i class="fa fa-user text-muted"></i>
                              </span>
                           </div>
                           <input id="lastName" type="text" name="txtPrenom" placeholder="Prenom" class="form-control bg-white border-left-0 border-md" required>
                        </div>
                        <!-- Name -->
                        <div class="input-group col-lg-6 mb-4">
                           <div class="input-group-prepend">
                              <span class="input-group-text bg-white px-4 border-md border-right-0">
                              <i class="fa fa-user text-muted"></i>
                              </span>
                           </div>
                           <input id="lastName" type="text" name="txtNom" placeholder="Nom" class="form-control bg-white border-left-0 border-md" required>
                        </div>
                        <!-- Email Address -->
                        <div class="input-group col-lg-12 mb-4">
                           <div class="input-group-prepend">
                              <span class="input-group-text bg-white px-4 border-md border-right-0">
                              <i class="fa fa-envelope text-muted"></i>
                              </span>
                           </div>
                           <input id="email" type="email" name="txtEmail" placeholder="Email" class="form-control bg-white border-left-0 border-md" required>
                        </div>
                        <!-- Address -->
                        <div class="input-group col-lg-12 mb-4">
                           <div class="input-group-prepend">
                              <span class="input-group-text bg-white px-4 border-md border-right-0">
                              <i class="fa fa-home text-muted"></i>
                              </span>
                           </div>
                           <input id="email" type="text" name="txtAdress" placeholder="Addresse" class="form-control bg-white border-left-0 border-md" required>
                        </div>
                        <!-- Phone Number -->
                        <div class="input-group col-lg-12 mb-4">
                           <div class="input-group-prepend">
                              <span class="input-group-text bg-white px-4 border-md border-right-0">
                              <i class="fa fa-phone-square text-muted"></i>
                              </span>
                           </div>
                           <select id="countryCode" name="countryCode" style="max-width: 80px" class="custom-select form-control bg-white border-left-0 border-md h-100 font-weight-bold text-muted">
                              <option value="">+212</option>
                           </select>
                           <input id="phoneNumber" type="tel" name="txtPhone" placeholder="Phone Number" class="form-control bg-white border-md border-left-0 pl-3" required>
                        </div>
                        <!-- Job -->
                        <div class="input-group col-lg-12 mb-4">
                           <div class="input-group-prepend">
                              <span class="input-group-text bg-white px-4 border-md border-right-0">
                              <i class="fa fa-briefcase text-muted"></i>
                              </span>
                           </div>
                           <select id="job" name="txtProfession" class="form-control custom-select bg-white border-left-0 border-md">
                              <option selected>Etudiant</option>
                              <option>Professeur</option>
                              <option>Responsable administratif</option>
                              <option>Vigil de surveillance</option>
                              <option>Menagere</option>
                              <option>Autre</option>
                           </select>
                        </div>
                        <!-- Password -->
                        <div class="input-group col-lg-6 mb-4">
                           <div class="input-group-prepend">
                              <span class="input-group-text bg-white px-4 border-md border-right-0">
                              <i class="fa fa-lock text-muted"></i>
                              </span>
                           </div>
                           <input id="password" type="password" name="txtPassword" placeholder="Password" class="form-control bg-white border-left-0 border-md">
                        </div>
                        <!-- Submit Button -->
                        <div class="form-group col-lg-12 mx-auto mb-0">
                           <input class="btn btn-primary btn-block py-2" type="submit" value="S'inscrire"/>
                        </div>
                        <br/><br/>
                     </div>
                  </form>
               </div>
            </div>
         </div>
      </section>
      <component:FooterBar></component:FooterBar>
   </body>
</html>