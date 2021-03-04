<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://vaccination.ma/tld/extratags" prefix="component" %>
<!DOCTYPE html>
<html lang="en">
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
      <link href="local/assets/demo/demo.css" rel="stylesheet" />
   </head>
   <body class="register-page sidebar-collapse">
      <div class="page-header" style="background-image: url('local/images/back.jpg');filter:1.0;background-color: rgba(255,255,255,1);
         background-blend-mode: luminosity;">
         <div class="filter"></div>
         <div class="container">
            <div class="row" >
               <div class="col-lg-4 ml-auto mr-auto">
                  <div class="card card-register">
                     <h3 class="title mx-auto">Authentification</h3>
                     <form class="register-form"  method="POST" >
                        <label>CIN</label>
                        <input type="text" class="form-control" placeholder="CIN" name="txtCIN" required>
                        <label>Password</label>
                        <input type="password" class="form-control" placeholder="Password" name="txtPassword" required>
                        <button class="btn btn-danger btn-block btn-round">Sign in</button>
                     </form>
                     <div class="errorMessage">${errorMessage}</div>
                     <div class="forgot">
                        <a href="index.html" class="btn btn-link btn-danger">Go HomePage</a>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
   </body>
</html>