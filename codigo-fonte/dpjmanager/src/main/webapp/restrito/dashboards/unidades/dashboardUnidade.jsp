<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib tagdir="/WEB-INF/tags/template" prefix="customTags"%>
<customTags:templateDashboard tituloFuncionalidade="Dashboard - UPJ BASA">
   <div class="page-title">
      <div class="title_left">
         <h3>Dashboard - UPJ BASA</h3>
      </div>
   </div>
   <div class="clearfix"></div>
   <div class="row">
      <c:forEach var="dashboardUnidadeDTO" items="${listaDashboardUnidade}">
         <div class="col-md-6 col-sm-6 col-xs-12">
            <div class="x_panel fixed_height_320">
               <div class="x_title">
                  <h2>${dashboardUnidadeDTO.pacoteDTO.nomePacote} <small><fmt:formatDate value="${dashboardUnidadeDTO.pacoteDTO.dataInicio}" pattern="dd/MM/yyyy"/> a <fmt:formatDate value="${dashboardUnidadeDTO.pacoteDTO.dataFinal}" pattern="dd/MM/yyyy"/></small></h2>
                  <div class="clearfix"></div>
               </div>
               <div class="x_content">
                  <div class="row">
                     <div class="col-sm-4">
                      <div class="weather-icon">
                        <span>
                            <canvas height="84" width="84" id="partly-cloudy-day"></canvas>
                        </span>
                      </div>
                    </div>
                  </div>
               </div>
            </div>
         </div>
      </c:forEach>
   </div>
   <script>
   var icons = new Skycons({
       "color": "#73879C"
     }),
     list = [
       "clear-day", "clear-night", "partly-cloudy-day",
       "partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
       "fog"
     ],
     i;

   for (i = list.length; i--;)
     icons.set(list[i], list[i]);

   icons.play();
 </script>
</customTags:templateDashboard>