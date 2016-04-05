<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<customTags:template>
   <div class="col-md-12 col-sm-12 col-xs-12">
      <ol class="breadcrumb">
        <li><a href="#">Home</a></li>
        <li><a href="#">Library</a></li>
        <li class="active">Data</li>
      </ol>
      <div class="x_panel" style="height:600px;">
         <div class="x_title">
             <h2>Disciplinas</h2>
             <div class="clearfix"></div>
         </div>
         <div class="x_content">
	         <c:if test="${!empty listaDisciplinas}">
	           <table id="example" class="table table-striped responsive-utilities jambo_table">
	              <thead>
                    <tr class="headings">
	                    <th>Disciplina</th>
	                 </tr>
	              </thead>
	              <tbody>
	                 <c:forEach var="dashboardDisciplina" items="${listaDashboardDisciplina}">
		                 <tr class="even pointer">
		                    <td>
		                       ${dashboardDisciplina.nomeDisciplina}
		                    </td>
		                 </tr>
	                 </c:forEach>
	              </tbody>
	           </table>
	        </c:if>
        </div>
       </div>
   </div>
</customTags:template>