<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@attribute name="tituloFuncionalidade" required="true" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>DPJ Manager</title>
  <!-- Bootstrap core CSS -->
  <link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">
  <link href="<c:url value='/resources/fonts/css/font-awesome.min.css'/>" rel="stylesheet">
  <link href="<c:url value='/resources/css/animate.min.css'/>" rel="stylesheet">
  <link href="<c:url value='/resources/css/custom.css'/>" rel="stylesheet">
  <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/maps/jquery-jvectormap-2.0.3.css'/>" />
  <link href="<c:url value='/resources/css/icheck/flat/green.css'/>" rel="stylesheet" />
  <link href="<c:url value='/resources/css/floatexamples.css'/>" rel="stylesheet" type="text/css" />
  <script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
  <script src="<c:url value='/resources/js/nprogress.js'/>"></script>
  <script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
  <!-- bootstrap progress js -->
  <script src="<c:url value='/resources/js/progressbar/bootstrap-progressbar.min.js'/>"></script>
  <script src="<c:url value='/resources/js/nicescroll/jquery.nicescroll.min.js'/>"></script>
  <!-- icheck -->
  <script src="<c:url value='/resources/js/icheck/icheck.min.js'/>"></script>
  <!-- daterangepicker -->
  <script type="text/javascript" src="<c:url value='/resources/js/moment/moment.min.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/datepicker/daterangepicker.js'/>"></script>
  <!-- chart js -->
  <script src="<c:url value='/resources/js/chartjs/chart.min.js'/>"></script>
  <script src="<c:url value='/resources/js/custom.js'/>"></script>
  <!-- flot js -->
  <!--[if lte IE 8]><script type="text/javascript" src="<c:url value='/resources/js/excanvas.min.js'/>"></script><![endif]-->
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.pie.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.orderBars.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.time.min.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/date.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.spline.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.stack.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/curvedLines.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/flot/jquery.flot.resize.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/maps/jquery-jvectormap-2.0.3.min.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/maps/gdp-data.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/maps/jquery-jvectormap-world-mill-en.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/maps/jquery-jvectormap-us-aea-en.js'/>"></script>
  <script src="<c:url value='/resources/js/pace/pace.min.js'/>"></script>
  <script src="<c:url value='/resources/js/skycons/skycons.min.js'/>"></script>
  <!--[if lt IE 9]>
      <script src="<c:url value='/resources/assets/js/ie8-responsive-file-warning.js'/>"></script>
  <![endif]-->
  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body class="nav-md">
   <div class="container body">
      <div class="main_container">
         <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
               <div class="navbar nav_title" style="border: 0;">
                  <a href="#" class="site_title"><span>DPJ Manager</span></a>
               </div>
               <div class="clearfix"></div>
               <!-- menu prile quick info -->
               <div class="profile">
                  <div class="profile_pic">
                  </div>
                  <div class="profile_info">
                  </div>
               </div>
               <!-- /menu prile quick info -->
               <br />
               <%@include file="menu.jsp"%>
            </div>
         </div>
         <%@include file="topo.jsp"%>
         <!-- page content -->
         <div class="right_col" role="main">
            <jsp:doBody />
            <%@include file="rodape.jsp"%>
         </div>
         <!-- /page content -->
      </div>
  </div>
  <div id="custom_notifications" class="custom-notifications dsp_none">
    <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group"></ul>
    <div class="clearfix"></div>
    <div id="notif-group" class="tabbed_notifications"></div>
  </div>
</body>
</html>