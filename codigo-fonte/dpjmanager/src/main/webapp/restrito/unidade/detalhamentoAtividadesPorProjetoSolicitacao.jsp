<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<customTags:templateFuncionalidades nomeIconeFuncionalidade="icon-dashboard" tituloFuncionalidade="Dashboard - UPJ BASA">
   <fieldset>
      <input type="hidden" id="codProjeto" value="${codProjeto}">
      <input type="hidden" id="codSolicitacao" value="${codSolicitacao}">
      <c:set var="index" value="${0}"/>
      <table class="table table-striped table-bordered">
         <thead>
            <th></th>
            <th>Disciplina</th>
            <th>Horas Planejadas</th>
            <th>Horas Realizadas</th>
            <th>Quantidade de Defeitos</th>
            <th>Horas com Defeito</th>
            <th>Percentual de Horas de Defeitos</th>
         </thead>
         <tbody>
            <c:forEach items="${listaDetalhamentoDisciplina}" var="detalhamentoDisciplinaDTO">
               <c:set var="index" value="${index + 1}"/>
	            <tr>
	              <td>
		              <a href="#" onclick="obtemAtividadesPorProjetoDisciplinaSolicitacao('${detalhamentoDisciplinaDTO.nomeDisciplina}', divDetalhamentoAtividades${index});">
		                 <img alt="Expandir" title="Expandir" src="<c:url value='/resources/images/icone_abre_detalhamento.png'/>"/>
		              </a>
		           </td>
	              <td>${detalhamentoDisciplinaDTO.nomeDisciplina}</td>
	              <td>${detalhamentoDisciplinaDTO.totalHorasPlanejadas}</td>
	              <td>${detalhamentoDisciplinaDTO.totalHorasRealizadas}</td>
	              <td>${detalhamentoDisciplinaDTO.quantidadeDefeitos}</td>
	              <td>${detalhamentoDisciplinaDTO.quantidadeHorasGastasDefeitos}</td>
	              <td></td>
	            </tr>
	            <tr>
                 <td colspan="7">
                    <div id="divDetalhamentoAtividades${index}">
                    </div>
                 </td>
               </tr>
            </c:forEach>
         </tbody>
      </table>
   </fieldset>
   <script>
   function obtemAtividadesPorProjetoDisciplinaSolicitacao(nomeDisciplina, nomeDivDetalhamentoAtividades){
	   $.getJSON("${pageContext.request.contextPath}/dashboardUnidade/obtemAtividadesPorProjetoDisciplinaSolicitacao?codProjeto="+$("#codProjeto").val()+"&nomeDisciplina="+nomeDisciplina+"&codSolicitacao="+$("#codSolicitacao").val(), function(resultado){
         $(nomeDivDetalhamentoAtividades).append("<table class='table table-striped table-bordered'>");
         $(nomeDivDetalhamentoAtividades).append("<th>Executor</th>");
         $(nomeDivDetalhamentoAtividades).append("<th>Atividade</th>");
         $(nomeDivDetalhamentoAtividades).append("<th>Início</th>");
         $(nomeDivDetalhamentoAtividades).append("<th>Fim</th>");
         $(nomeDivDetalhamentoAtividades).append("<th>Quantidade de Horas</th>");
         $(nomeDivDetalhamentoAtividades).append("</thead>");
         $(nomeDivDetalhamentoAtividades).append("<tbody>");
         $.each(resultado, function(i, detalhamentoAtividadeDTO){
	                $(nomeDivDetalhamentoAtividades).append("<tr><td>"+detalhamentoAtividadeDTO.nomeExecutor+"</td><td>"+detalhamentoAtividadeDTO.nomeAtividade+"</td><td>"+detalhamentoAtividadeDTO.dataInicio+"</td><td>"+detalhamentoAtividadeDTO.dataFim+"</td><td>"+detalhamentoAtividadeDTO.quantidadeHoras+"</td></tr>");
	            });
	            $(nomeDivDetalhamentoAtividades).append("</tbody>");
	            $(nomeDivDetalhamentoAtividades).append("</table>");
	        });
             
          }
   </script>
</customTags:templateFuncionalidades>