<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<customTags:templateFuncionalidades nomeIconeFuncionalidade="icon-dashboard" tituloFuncionalidade="Dashboard - UPJ BASA">
   <fieldset>
      <table class="table table-striped table-bordered">
         <thead>
            <th>Executor</th>
            <th>Atividade</th>
            <th>Início</th>
            <th>Fim</th>
            <th>Quantidade de Horas</th>
         </thead>
         <tbody>
            <c:forEach items="${listaDetalhamentoAtividades}" var="detalhamentoAtividadeDTO">
               <tr>
                 <td>${detalhamentoAtividadeDTO.nomeExecutor}</td>
                 <td>${detalhamentoAtividadeDTO.nomeAtividade}</td>
                 <td>${detalhamentoAtividadeDTO.dataInicio}</td>
                 <td>${detalhamentoAtividadeDTO.dataFim}</td>
                 <td>${detalhamentoAtividadeDTO.quantidadeHoras}</td>
               </tr>
            </c:forEach>
         </tbody>
      </table>
   </fieldset>
</customTags:templateFuncionalidades>