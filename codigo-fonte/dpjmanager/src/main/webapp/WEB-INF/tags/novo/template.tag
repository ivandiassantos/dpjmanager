<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>DPJ Manager</title>
    <link href="<c:url value='/resources/novo/bootstrap/dist/css/bootstrap.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/novo/metisMenu/dist/metisMenu.min.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/novo/dist/css/timeline.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/novo/dist/css/sb-admin-2.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/novo/morrisjs/morris.css'/>" rel="stylesheet">
    <link href="<c:url value='/resources/novo/font-awesome/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css">
    <script src="<c:url value='/resources/novo/jquery/dist/jquery.min.js'/>"></script>
    <script src="<c:url value='/resources/novo/bootstrap/dist/js/bootstrap.min.js'/>"></script>
    <script src="<c:url value='/resources/novo/metisMenu/dist/metisMenu.min.js'/>"></script>
    <script src="<c:url value='/resources/novo/raphael/raphael-min.js'/>"></script>
    <script src="<c:url value='/resources/novo/morrisjs/morris.min.js'/>"></script>
    <script src="<c:url value='/resources/novo/dist/js/sb-admin-2.js'/>"></script>
    <script src="<c:url value='/resources/novo/datatables/media/js/jquery.dataTables.min.js'/>"></script>
    <script src="<c:url value='/resources/novo/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js'/>"></script>
    <script src="<c:url value='/resources/novo/datatables-responsive/js/dataTables.responsive.js'/>"></script>
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <div id="wrapper">
        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="<c:url value='/restrito/principal'/>">DPJ Manager</a>
            </div>
            <!-- /.navbar-header -->
            <%@include file="/WEB-INF/template/novo/topo.jsp" %>
            <div class="navbar-default sidebar" role="navigation">
                <%@include file="/WEB-INF/template/novo/menu.jsp" %>
            </div>
            <!-- /.navbar-static-side -->
        </nav>
        <div id="page-wrapper">
            <jsp:doBody/>
        </div>
    </div>
</body>
</html>