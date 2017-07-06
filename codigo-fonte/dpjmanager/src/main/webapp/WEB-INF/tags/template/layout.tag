<%@tag pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ attribute name="nomeIconeFuncionalidade" required="true" %>
<%@ attribute name="tituloFuncionalidade" required="true" %>
<%@ attribute name="detalheFuncionalidade" required="true" %>
<security:authentication property="principal" var="usuario"/>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
      <meta charset="utf-8" />
      <title>DPJ Manager</title>
      <meta name="description" content="overview &amp; stats" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
      <!-- bootstrap & fontawesome -->
      <link rel="stylesheet" href="<c:url value='/resources/assets/css/bootstrap.min.css'/>"/>
      <link rel="stylesheet" href="<c:url value='/resources/assets/font-awesome/4.5.0/css/font-awesome.min.css'/>" />
      <!-- page specific plugin styles -->
      <!-- text fonts -->
      <link rel="stylesheet" href="<c:url value='/resources/assets/css/fonts.googleapis.com.css'/>" />
      <!-- ace styles -->
      <link rel="stylesheet" href="<c:url value='/resources/assets/css/ace.min.css'/>" class="ace-main-stylesheet" id="main-ace-style" />
      <!--[if lte IE 9]>
         <link rel="stylesheet" href="<c:url value='/resources/assets/css/ace-part2.min.css'/>" class="ace-main-stylesheet" />
      <![endif]-->
      <link rel="stylesheet" href="<c:url value='/resources/assets/css/ace-skins.min.css'/>" />
      <link rel="stylesheet" href="<c:url value='/resources/assets/css/ace-rtl.min.css'/>" />
      <!--[if lte IE 9]>
        <link rel="stylesheet" href="<c:url value='/resources/assets/css/ace-ie.min.css'/>"/>
      <![endif]-->
      <!-- inline styles related to this page -->
      <!-- ace settings handler -->
      <script src="<c:url value='/resources/assets/js/ace-extra.min.js'/>"></script>
      <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->
      <!--[if lte IE 8]>
         <script src="<c:url value='/resources/assets/js/html5shiv.min.js'/>"></script>
         <script src="<c:url value='/resources/assets/js/respond.min.js'/>"></script>
      <![endif]-->
   </head>
   <body class="no-skin">
      <%@include file="topo.jsp" %>
      <div class="main-container ace-save-state" id="main-container">
         <script type="text/javascript">
            try{ace.settings.loadState('main-container')}catch(e){}
         </script>
         <%@include file="menu.jsp" %>
         <div class="main-content">
            <div class="main-content-inner">
               <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                  <ul class="breadcrumb">
                     <li>
                        <i class="ace-icon fa fa-home home-icon"></i>
                        <a href="#" id="menuSelecionado">Principal</a>
                     </li>
                     <li class="active" id="subMenuSelecioado">Dashboard</li>
                  </ul>
               </div>
               <div class="page-content">
                  <div class="page-header">
                     <h1>
                        <span id="tituloFuncionalidade">Principal</span>
                        <small>
                           <span id="detalheFuncionalidade">Dashboard</span>
                        </small>
                     </h1>
                  </div>
                  <div class="row">
                     <div class="col-xs-12">
	                     <div class="space-6"></div>
	                     <jsp:doBody/>
                     </div>
                  </div>
               </div>
            </div>
         </div>
         <%@ include file="rodape.jsp" %>
         <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
            <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
         </a>
      </div><!-- /.main-container -->
      <!-- basic scripts -->
      <!--[if !IE]> -->
         <script src="<c:url value='/resources/assets/js/jquery-2.1.4.min.js'/>"></script>
      <!-- <![endif]-->
      <!--[if IE]>
         <script src="<c:url value='/resources/assets/js/jquery-1.11.3.min.js'/>"></script>
      <![endif]-->
      <script type="text/javascript">
         if('ontouchstart' in document.documentElement) document.write("<script src='<c:url value='/resources/assets/js/jquery.mobile.custom.min.js'/>'>"+"<"+"/script>");
      </script>
      <script src="<c:url value='/resources/assets/js/bootstrap.min.js'/>"></script>
      <!-- page specific plugin scripts -->
      <!--[if lte IE 8]>
        <script src="<c:url value='/resources/assets/assets/js/excanvas.min.js'/>"></script>
      <![endif]-->
      <script src="<c:url value='/resources/assets/js/jquery-ui.custom.min.js'/>"></script>
      <script src="<c:url value='/resources/assets/js/jquery.ui.touch-punch.min.js'/>"></script>
      <script src="<c:url value='/resources/assets/js/jquery.easypiechart.min.js'/>"></script>
      <script src="<c:url value='/resources/assets/js/jquery.sparkline.index.min.js'/>"></script>
      <script src="<c:url value='/resources/assets/js/jquery.flot.min.js'/>"></script>
      <script src="<c:url value='/resources/assets/js/jquery.flot.pie.min.js'/>"></script>
      <script src="<c:url value='/resources/assets/js/jquery.flot.resize.min.js'/>"></script>
      <!-- ace scripts -->
      <script src="<c:url value='/resources/assets/js/ace-elements.min.js'/>"></script>
      <script src="<c:url value='/resources/assets/js/ace.min.js'/>"></script>
      <script src="<c:url value='/resources/assets/js/jquery.dataTables.min.js'/>"></script>
      <script src="<c:url value='/resources/assets/js/jquery.dataTables.bootstrap.min.js'/>"></script>
      <script src="<c:url value='/resources/assets/js/dataTables.buttons.min.js'/>"></script>
      <script src="<c:url value='/resources/assets/js/dpjmanager.js'/>"></script>
      <!-- inline scripts related to this page -->
      <script type="text/javascript">
         jQuery(function($) {

            /////////////////////////////////////
            $(document).one('ajaxloadstart.page', function(e) {
               $tooltip.remove();
            });

            //show the dropdowns on top or bottom depending on window height and menu position
            $('#task-tab .dropdown-hover').on('mouseenter', function(e) {
               var offset = $(this).offset();
         
               var $w = $(window)
               if (offset.top > $w.scrollTop() + $w.innerHeight() - 100) 
                  $(this).addClass('dropup');
               else $(this).removeClass('dropup');
            });
         
         })
      </script>
   </body>
</html>
