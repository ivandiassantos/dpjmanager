<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>DPJ Manager</title>
    <!-- Bootstrap core CSS -->
    <link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/fonts/css/font-awesome.min.css'/>" rel="stylesheet"/>
    <link href="<c:url value='/resources/css/animate.min.css'/>" rel="stylesheet"/>

    <!-- Custom styling plus plugins -->
    <link href="<c:url value='/resources/css/custom.css'/>" rel="stylesheet"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/maps/jquery-jvectormap-2.0.1.css'/>" />
    <link href="<c:url value='/resources/css/icheck/flat/green.css'/>" rel="stylesheet" />
    <link href="<c:url value='/resources/css/floatexamples.css'/>" rel="stylesheet" type="text/css" />
    <script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
    <script src="<c:url value='/resources/js/nprogress.js'/>"></script>
    <script>
        NProgress.start();
    </script>
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
            	<%@include file="/WEB-INF/template/menuLateral.jsp" %>
            </div>

            <!-- top navigation -->
            <%@include file="/WEB-INF/template/menuSuperior.jsp" %>
            <!-- /top navigation -->


            <!-- page content -->
            <div class="right_col" role="main">
                <div class="row">
                    <jsp:doBody/>
                </div>
                <br />
                <!-- footer content -->
				<%@include file="/WEB-INF/template/rodape.jsp" %>
                <!-- /footer content -->
            </div>
            <!-- /page content -->
        </div>
    </div>

    <script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/gauge/gauge.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/gauge/gauge_demo.js'/>"></script>
    <script src="<c:url value='/resources/js/chartjs/chart.min.js'/>"></script>
    <script src="<c:url value='/resources/js/progressbar/bootstrap-progressbar.min.js'/>"></script>
    <script src="<c:url value='/resources/js/nicescroll/jquery.nicescroll.min.js'/>"></script>
    <script src="<c:url value='/resources/js/icheck/icheck.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/moment.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/datepicker/daterangepicker.js'/>"></script>
    <script src="<c:url value='/resources/js/custom.js'/>"></script>
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
    <script type="text/javascript" src="<c:url value='/resources/js/maps/jquery-jvectormap-2.0.1.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/maps/gdp-data.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/maps/jquery-jvectormap-world-mill-en.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/maps/jquery-jvectormap-us-aea-en.js'/>"></script>
    <script src="<c:url value='/resources/js/skycons/skycons.js'/>"></script>
</body>
</html>