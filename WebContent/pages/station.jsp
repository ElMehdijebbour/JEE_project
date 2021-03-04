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
                  <div class="row">
                     <div class="col-md-6">
                        <div class="card ">
                           <div class="card-header ">
                              <h4 class="card-title">Veuillez saisir les informations avant la vaccination</h4>
                           </div>
                           <div class="card-body ">
                              <form action="station.html" method="POST" >
                                 <div class="login-box">
                                    <label><br/>Information de la personne</label>
                                    <div class="form-group">
                                       <span class="glyphicon glyphicon-user"></span>
                                       <input class="form-control" type="text" placeholder="CIN" name="txtCIN" required>
                                    </div>
                                    <label ><br/>Information du vaccin</label>
                                    <div class="form-group">
                                       <input  class="form-control" type="number" placeholder="Numéro de la série" name="txtSerie" required>
                                    </div>
                                    <div class="form-group">
                                       <input class="form-control" type="number" placeholder="Numéro de la dose" name="txtDose" required>
                                    </div>
                                    <div class="form-group">
                                       <label >Marque : </label>
                                       <select name="txtBrand" class="form-control" required>
                                          <option>Sinopharm</option>
                                          <option selected>Astrazenica</option>
                                       </select>
                                    </div>
                                    <input class="btn btn-primary" type="submit" value='Vacciner'/>
                                    <div class="errorMessage">${errorMessage}</div>
                                 </div>
                              </form>
                           </div>
                        </div>
                     </div>
                     <div class="col-md-6">
                        <div class="card ">
                           <div class="card-header ">
                              <h4 class="card-title">Statistiques</h4>
                           </div>
                           <div class="card-body ">
                                <div id="piechart"></div>    
                              <div class="stats">
                                 <i class="fa fa-clock-o"></i> Data collected from database
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
   </body>

   <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
   <script type="text/javascript">
	// Load google charts
	google.charts.load('current', {'packages':['corechart']});
	google.charts.setOnLoadCallback(drawChart);
	
	// Draw the chart and set the chart values
	function drawChart() {
	  var data = google.visualization.arrayToDataTable([
	  ['Task', 'Hours per Day'],
	  ['Nombre de personnes vaccinées',${rdvPresent}],
	  ["Nombre dinscrits", ${inscrits}],
	  ['Nombre de rendez-vous', ${rdv}],
	  ['Nombre de personnes absentes au rendez-vous', ${rdvAbsent}],

	]);
	
	  // Optional; add a title and set the width and height of the chart
	  var options = {'title':'Statistiques', 'width':550, 'height':400};
	
	  // Display the chart inside the <div> element with id="piechart"
	  var chart = new google.visualization.PieChart(document.getElementById('piechart'));
	  chart.draw(data, options);
}
</script>
   <!--   Core JS Files   -->
   <script src="local/js/core/jquery.3.2.1.min.js" type="text/javascript"></script>
   <script src="local/js/core/popper.min.js" type="text/javascript"></script>
   <script src="lcoal/js/core/bootstrap.min.js" type="text/javascript"></script>
   <script src="local/js/light-bootstrap-dashboard.js?v=2.0.0 " type="text/javascript"></script>

</html>