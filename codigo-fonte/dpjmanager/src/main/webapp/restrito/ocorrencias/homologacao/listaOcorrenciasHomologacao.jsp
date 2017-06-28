<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/template" prefix="customTags"%>
<customTags:layout nomeIconeFuncionalidade="icon-home" tituloFuncionalidade="Principal" detalheFuncionalidade="teste">
   <div class="row">
      <div class="col-xs-12">
         <div>
	         <table id="dynamic-table" class="table table-striped table-bordered table-hover">
			      <thead>
			         <tr>
			            <th>Solicitação</th>
			            <th>Projeto</th>
			            <th>ID da Ocorrência</th>
			            <th>Descrição</th>
			            <th>Situação</th>
			            <th>Data e Hora de Abertura</th>
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
			               <td>${ocorrenciaDTO.dataAbertura}</td>
			            </tr>
			         </c:forEach>
			      </tbody>
			   </table>
		   </div>
	   </div>
   </div>
</customTags:layout>