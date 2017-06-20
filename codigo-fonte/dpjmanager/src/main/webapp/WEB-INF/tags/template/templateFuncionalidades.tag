<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE html>
<html>
   <head>
		<title>DPJ Manager</title>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css'/>" />
		<link rel="stylesheet" href="<c:url value='/resources/css/bootstrap-responsive.min.css'/>" />
		<link rel="stylesheet" href="<c:url value='/resources/css/fullcalendar.css'/>" />
		<link rel="stylesheet" href="<c:url value='/resources/css/matrix-style.css'/>" />
		<link rel="stylesheet" href="<c:url value='/resources/css/matrix-media.css'/>" />
		<link href="<c:url value='/resources/font-awesome/css/font-awesome.css" rel="stylesheet'/>" />
		<link rel="stylesheet" href="<c:url value='/resources/css/jquery.gritter.css'/>" />
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
   </head>
   <body>
      <%@include file="topo.jsp"%>
      <%@include file="menu.jsp"%>
      <!--main-container-part-->
      <div id="content">
	      <!--breadcrumbs-->
	      <div id="content-header">
	         <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a></div>
	      </div>
	      <!--End-breadcrumbs-->
	      <!--Action boxes-->
	      <div class="container-fluid">    
	         <!--Chart-box-->    
	         <div class="row-fluid">
	            <div class="widget-box">
	               <div class="widget-title bg_lg">
	                  <span class="icon"><i class="icon-dashboard"></i></span>
	                  <h5>Dashboard</h5>
	               </div>
	               <div class="widget-content" >
	                  <div class="row-fluid">
	                    <jsp:doBody/>
	                  </div>
	               </div>
	            </div>
	         </div>
	         <!--End-Chart-box--> 
	         <hr/>
	      </div>
      </div>
      <!--end-main-container-part-->
		<script src="<c:url value='/resources/js/excanvas.min.js'/>"></script> 
		<script src="<c:url value='/resources/js/jquery.min.js'/>"></script> 
		<script src="<c:url value='/resources/js/jquery.ui.custom.js'/>"></script> 
		<script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script> 
		<script src="<c:url value='/resources/js/jquery.flot.min.js'/>"></script> 
		<script src="<c:url value='/resources/js/jquery.flot.resize.min.js'/>"></script> 
		<script src="<c:url value='/resources/js/jquery.peity.min.js'/>"></script> 
		<script src="<c:url value='/resources/js/fullcalendar.min.js'/>"></script> 
		<script src="<c:url value='/resources/js/matrix.js'/>"></script> 
		<script src="<c:url value='/resources/js/matrix.dashboard.js'/>"></script> 
		<script src="<c:url value='/resources/js/jquery.gritter.min.js'/>"></script> 
		<script src="<c:url value='/resources/js/matrix.interface.js'/>"></script> 
		<script src="<c:url value='/resources/js/matrix.chat.js'/>"></script> 
		<script src="<c:url value='/resources/js/jquery.validate.js'/>"></script> 
		<script src="<c:url value='/resources/js/matrix.form_validation.js'/>"></script> 
		<script src="<c:url value='/resources/js/jquery.wizard.js'/>"></script> 
		<script src="<c:url value='/resources/js/jquery.uniform.js'/>"></script> 
		<script src="<c:url value='/resources/js/select2.min.js'/>"></script> 
		<script src="<c:url value='/resources/js/matrix.popover.js'/>"></script> 
		<script src="<c:url value='/resources/js/jquery.dataTables.min.js'/>"></script> 
		<script src="<c:url value='/resources/js/matrix.tables.js'/>"></script> 
   </body>
</html>