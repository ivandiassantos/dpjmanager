<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="sidebar" class="sidebar responsive ace-save-state">
   <script type="text/javascript">
      try{ace.settings.loadState('sidebar')}catch(e){}
   </script>
   <div class="sidebar-shortcuts" id="sidebar-shortcuts">
      <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
         <span class="btn btn-success"></span>
         <span class="btn btn-info"></span>
         <span class="btn btn-warning"></span>
         <span class="btn btn-danger"></span>
      </div>
   </div>
   <ul class="nav nav-list">
      <li class="">
	     <a href="#" class="dropdown-toggle">
	        <i class="menu-icon fa fa-tasks"></i>
	        <span class="menu-text"> Ocorr&ecirc;ncias </span>
	        <b class="arrow fa fa-angle-down"></b>
	     </a>
        <b class="arrow"></b>
         <ul class="submenu">
            <li class="">
               <a href="<c:url value='/restrito/ocorrencias/homologacao/listaOcorrenciasHomologacao'/>" >Homologa&ccedil;&atilde;o</a>
	            <b class="arrow"></b>
            </li>
         </ul>
      </li>
   </ul>
   <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
      <i id="sidebar-toggle-icon" class="ace-icon fa fa-angle-double-left ace-save-state" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
   </div>
</div>