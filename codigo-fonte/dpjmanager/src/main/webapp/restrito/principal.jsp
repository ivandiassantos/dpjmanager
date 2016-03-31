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
	          <h2>Pesquisar</h2>
	          <div class="clearfix"></div>
	      </div>
         <div class="x_content">
           <form:form servletRelativeAction="/listarNegociacoes" method="post" cssClass="form-horizontal form-label-left">
               <div class="form-group">
	               <label for="integrantes" class="control-label col-md-1">Executor:</label>
	               <div class="col-md-3">
		               <select class="form-control" id="integrantes" name="codigoIntegrante">
		                  <option>Selecione</option>
		                  <c:forEach items="${listaIntegrantes}" var="integrante">
		                     <option value="${integrante.codigoIntegrante}">${integrante.nomeIntegrante}</option>
		                  </c:forEach>
		               </select>
	               </div>
	            </div>
	            <div class="form-group">
	               <label for="dataInicio" class="control-label col-md-1">Data de Início:</label>
                  <div class="col-md-3">
                     <input type="date" id="dataInicio" class="form-control" required name="dataInicio"/>
                  </div>
               </div>
               <div class="form-group">
                  <label for="dataTermino" class="control-label col-md-1">Data de Término:</label>
                  <div class="col-md-3">
                     <input type="date" id="dataTermino" class="form-control" required name="dataFinal"/>
                  </div>
               </div>
               <div class="ln_solid"></div>
               <div class="form-group">
                   <div class="col-md-3">
                       <button type="submit" class="btn btn-success">Pesquisar</button>
                       <button type="reset" class="btn">Limpar</button>
                   </div>
               </div>
           </form:form>
         </div>
             <c:if test="${!empty listaNegociacoes}">
            	<table id="example" class="table table-striped responsive-utilities jambo_table">
            		<thead>
                      	<tr class="headings">
            				<th>Executor</th>
            				<th>Atividade</th>
            				<th>Horas Previstas</th>
            				<th>Horas Alocadas</th>
            				<th>Data de Encerramento</th>
            			</tr>
            		</thead>
            		<tbody>
           			<c:forEach var="negociacao" items="${listaNegociacoes}">
           				<tr class="even pointer">
           					<td>
           						${negociacao.integrante.nomeIntegrante}
           					</td>
           					<td>
           						${negociacao.atividade.descricaoAtividade}
           					</td>
           					<td>
           						${negociacao.totalHorasPrevisao}
           					</td>
           					<td>
           						${negociacao.totalHorasRealizadas}
           					</td>
           					<td>
           						${negociacao.dataFechamento}
           					</td>
           				</tr>
          				</c:forEach>
            		</tbody>
            	</table>
           	</c:if>
             </div>
         </div>
</customTags:template>