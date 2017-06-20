<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/template" prefix="customTags"%>
<customTags:templateFuncionalidades>
   <table class="table table-bordered data-table" id="resultadoPesquisa">
      <thead>
         <tr>
            <th></th>
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
</customTags:templateFuncionalidades>