<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@attribute name="nomeIconeFuncionalidade" required="true" %>
<%@attribute name="tituloFuncionalidade" required="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Dashboard - Bootstrap Admin Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">
<link href="<c:url value='/resources/css/bootstrap-responsive.min.css'/>"	rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">
<link href="<c:url value='/resources/css/font-awesome.css'/>" rel="stylesheet">
<link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet">
<link href="<c:url value='/resources/css/pages/dashboard.css'/>" rel="stylesheet">
<link href="<c:url value='/resources/css/jquery-ui.css'/>" rel="stylesheet">
<link href="<c:url value='/resources/css/jquery.dataTables.css'/>" rel="stylesheet">
<link href="<c:url value='/resources/css/pages/plans.css'/>" rel="stylesheet"> 
<!-- Placed at the end of the document so the pages load faster -->
<script src="<c:url value='/resources/js/jquery.js'/>"></script>
<script src="<c:url value='/resources/js/excanvas.min.js'/>"></script>
<script src="<c:url value='/resources/js/chart.min.js'/>" type="text/javascript"></script>
<script src="<c:url value='/resources/js/bootstrap.js'/>"></script>
<script language="javascript" type="text/javascript"  src="<c:url value='/resources/js/full-calendar/fullcalendar.min.js'/>"></script>
<script src="<c:url value='/resources/js/base.js'/>"></script>
<script src="<c:url value='/resources/js/jquery-ui.js'/>"></script>
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<%@include file="/WEB-INF/template/topo.jsp"%>
	</div>
	<!-- /navbar -->
	<div class="subnavbar">
		<%@include file="/WEB-INF/template/menu.jsp"%>
	</div>
	<!-- /subnavbar -->
	<div class="main">
		<div class="main-inner">
			<div class="container">
				<div class="row">
					<div class="span12">
						<div class="widget ">
							<div class="widget-header">
								<i class="${nomeIconeFuncionalidade}"></i>
								<h3>${tituloFuncionalidade}</h3>
							</div>
							<!-- /widget-header -->
							<div class="widget-content">
								<c:if test="${!empty mensagemErro}">
									<div class="alert alert-error">
										<button type="button" class="close" data-dismiss="error">×</button>
										<i class="icon-large icon-remove-sign"></i>&nbsp;<strong>Erro.</strong>&nbsp;&nbsp;&nbsp;<c:out value="${mensagemErro}"/>
									</div>
								</c:if>
								<c:if test="${!empty mensagemSucesso}">
									<div class="alert alert-success">
										<button type="button" class="close" data-dismiss="success">×</button>
										<i class="icon-large icon-check"></i>&nbsp;<strong>Sucesso.</strong>&nbsp;&nbsp;&nbsp;<c:out value="${mensagemSucesso}"/>
									</div>
								</c:if>
								<jsp:doBody />
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- /container -->
		</div>
		<!-- /main-inner -->
	</div>
	<!-- /main -->
	<div class="footer">
		<%@include file="/WEB-INF/template/rodape.jsp"%>
	</div>
	<!-- /footer -->
	<!-- Le javascript
================================================== -->
</body>
</html>
