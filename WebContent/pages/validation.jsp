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
      <style >
         .container-fluid {
         margin: 30px;
         }
      </style>
   </head>
   <body>
      <component:MenuBar></component:MenuBar>
      <div class="container-fluid">
         <div class="row justify-content-center">
            <div class="col-12 col-md-5 col-sm-12 col-xs-12">
               <div class="card px-5 py-5 p-md-5 text-white">
                  <div class="row">
                     <div class="col-3 col-md-3 text-center"> <img src="https://i.imgur.com/CFDCwbv.png" alt="" height="60px" width="70px" class=""> </div>
                     <div class="col-9 col-md-9">
                        <h4 class="font-weight-bold mb-3">Validation</h4>
                        <p>Votre ${operation} ${validation}</p>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <component:FooterBar></component:FooterBar>
   </body>
</html>