<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<customTags:template>
   <div class="col-md-12 col-sm-12 col-xs-12">
         <div class="x_panel" style="height:600px;">
             <div class="x_title">
                 <h2>Clientes</h2>
                 <div class="clearfix"></div>
             </div>
             <div class="x_content">
               <div class="row">
                  <div class="col-md-4 col-sm-4 col-xs-12">
                     <div class="x_panel tile fixed_height_320">
                        <div class="x_title">
                            <h2>BASA</h2>
                            <div class="clearfix"></div>
                         </div>
                         <div class="x_content">
                             <div class="dashboard-widget-content">
                                 <ul class="quick-list">
                                     <li>
                                         <i class="fa fa-link"></i><a href="<c:url value='/projeto/listarProjetosPorCliente/41'/>">Detalhar</a>
                                     </li>
                                 </ul>
   
                                 <div class="sidebar-widget">
                                     <h4>Status</h4>
                                     <canvas width="150" height="80" id="foo" class="" style="width: 160px; height: 100px;"></canvas>
                                     <div class="goal-wrapper">
                                         <span class="gauge-value pull-left">$</span>
                                         <span id="gauge-text" class="gauge-value pull-left">3,200</span>
                                         <span id="goal-text" class="goal-value pull-right">$5,000</span>
                                     </div>
                                 </div>
                             </div>
                         </div>
                     </div>
                  </div>
               </div>
             </div>
         </div>
     </div>
</customTags:template>