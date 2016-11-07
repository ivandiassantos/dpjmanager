<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
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
  <link href="<c:url value='/resources/js/datatables/jquery.dataTables.min.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/js/datatables/buttons.bootstrap.min.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/js/datatables/fixedHeader.bootstrap.min.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/js/datatables/responsive.bootstrap.min.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/js/datatables/scroller.bootstrap.min.css'/>" rel="stylesheet" type="text/css" />
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
            <div class="row">
               <div class="col-md-12 col-sm-12 col-xs-12">
                  <div class="x_panel">
                     <div class="x_title">
                        <h2>${tituloFuncionalidade}</h2>
                        <div class="clearfix"></div>
                     </div>
                     <div class="x_content">
                        <c:if test="${!empty mensagemSucesso}">
	                        <div class="alert alert-success alert-dismissible fade in" role="alert">
	                           <button type="button" class="close" data-dismiss="alert" aria-label="Close">
	                              <span aria-hidden="true">×</span>
	                           </button>
	                           <span class="glyphicon glyphicon-ok-sign"></span> <strong>Sucesso!</strong> <c:out value="${mensagemSucesso}"/>
	                        </div>
                        </c:if>
                        <c:if test="${!empty mensagemAlerta}">
	                        <div class="alert alert-warning alert-dismissible fade in" role="alert">
	                           <button type="button" class="close" data-dismiss="alert" aria-label="Close">
	                              <span aria-hidden="true">×</span>
	                           </button>
	                           <span class="glyphicon glyphicon-warning-sign"></span> <strong>Alerta!</strong> <c:out value="${mensagemAlerta}"/>
	                        </div>
                        </c:if>
                        <c:if test="${!empty mensagemErro}">
	                        <div class="alert alert-danger alert-dismissible fade in" role="alert">
	                           <button type="button" class="close" data-dismiss="alert" aria-label="Close">
	                              <span aria-hidden="true">×</span>
	                           </button>
	                           <span class="glyphicon glyphicon-warning-sign"></span> <strong>Erro!</strong> <c:out value="${mensagemErro}"/>
	                        </div>
                        </c:if>
                        <br />
                        <jsp:doBody />
                     </div>
                  </div>
               </div>
            </div>
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
  <script src="<c:url value='/resources/js/datatables/jquery.dataTables.min.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/dataTables.bootstrap.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/dataTables.buttons.min.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/buttons.bootstrap.min.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/jszip.min.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/pdfmake.min.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/vfs_fonts.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/buttons.html5.min.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/buttons.print.min.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/dataTables.fixedHeader.min.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/dataTables.keyTable.min.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/dataTables.responsive.min.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/responsive.bootstrap.min.js'/>"></script>
  <script src="<c:url value='/resources/js/datatables/dataTables.scroller.min.js'/>"></script>
</body>
</html>