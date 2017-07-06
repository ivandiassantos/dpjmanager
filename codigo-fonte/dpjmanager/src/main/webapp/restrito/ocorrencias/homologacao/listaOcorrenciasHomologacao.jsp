<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib tagdir="/WEB-INF/tags/template" prefix="customTags"%>
<customTags:layout nomeIconeFuncionalidade="icon-home" tituloFuncionalidade="Principal" detalheFuncionalidade="teste">
   <div class="row">
      <form class="form-horizontal" role="form">
         <label class="col-sm-1 control-label no-padding-right">Solicitação</label>
         <div class="col-sm-1">
	        <input class="form-control" type="text">
	      </div>
	      <label class="col-sm-1 control-label no-padding-right">Ocorrência</label>
         <div class="col-sm-1">
           <input class="form-control" type="text">
         </div>
         <label class="col-sm-1 control-label no-padding-right">Data Inicial</label>
         <div class="col-sm-1">
           <input class="form-control" type="text">
         </div>
         <label class="col-sm-1 control-label no-padding-right">Data Final</label>
         <div class="col-sm-1">
           <input class="form-control" type="text">
         </div>
         <label class="col-sm-1 control-label no-padding-right">Situação</label>
         <div class="col-sm-1">
           <input class="form-control" type="text">
         </div>
      </form>
   </div>
   <div class="row">
      <div class="col-xs-12">
         <div class="tabbable">
            <ul class="nav nav-tabs" id="myTab">
               <li class="active">
                  <a data-toggle="tab" href="#listagem">
                     <i class="green ace-icon fa fa-list bigger-120"></i>
                     Listagem
                  </a>
               </li>
               <li>
                  <a data-toggle="tab" href="#dashboard">
                     <i class="green ace-icon fa fa-dashboard bigger-120"></i>
                     Dashboard
                  </a>
               </li>
            </ul>
            <div class="tab-content">
               <div id="listagem" class="tab-pane fade in active">
                  <table id="resultadoPesquisa" class="table table-striped table-bordered table-hover">
		               <thead>
		                  <tr>
		                     <th>Solicitação</th>
		                     <th>Projeto</th>
		                     <th>ID da Ocorrência</th>
		                     <th>Descrição</th>
		                     <th>Situação</th>
		                     <th>Data de Abertura</th>
		                  </tr>
		               </thead>
                     <tbody>
		                  <c:forEach items="${listaOcorrenciasHomologacao}" var="ocorrenciaDTO">
		                     <tr>
		                        <td></td>
		                        <td>${ocorrenciaDTO.nomeProjeto}</td>
		                        <td>${ocorrenciaDTO.idOcorrencia}</td>
		                        <td>${ocorrenciaDTO.descricao}</td>
		                        <td>${ocorrenciaDTO.situacao}</td>
		                        <td><fmt:formatDate value="${ocorrenciaDTO.dataAbertura}" pattern="dd/MM/yyyy"/></td>
		                     </tr>
		                  </c:forEach>
                     </tbody>
                  </table>
               </div>
               <div id="dashboard" class="tab-pane fade">
                 <p>Dashboard</p>
               </div>
            </div>
         </div>
	   </div>
   </div>
</customTags:layout>