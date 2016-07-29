<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<customTags:templateFuncionalidades nomeIconeFuncionalidade="icon-dashboard" tituloFuncionalidade="Dashboard - UPJ BASA">
   <fieldset>
      <c:forEach items="${listaDashboardUnidade}" var="dashboardUnidadeDTO">
         <div class="info">
            <h3>${dashboardUnidadeDTO.nomePacote}</h3>
         </div>
         <br/>
         <div class="text">
           <c:set var="index" value="${0}"/>
	        <c:forEach items="${dashboardUnidadeDTO.listaSolicitacoes}" var="solicitacaoDTO">
		        <div class="info">
		          <h4>${solicitacaoDTO.descricaoSolicitacao}</h4>
		          Período:&nbsp;<fmt:formatDate value="${dashboardUnidadeDTO.dataInicio}" pattern="dd/MM/yyyy"/>&nbsp;a&nbsp;<fmt:formatDate value="${dashboardUnidadeDTO.dataFinal}" pattern="dd/MM/yyyy"/>
		        </div>
		        <table class="table table-striped">
		          <thead>
		             <th></th>
		             <th>Projetos</th>
		             <th>Qualidade</th>
		             <th>Produtividade</th>
		          </thead>
		          <tbody>
		             <c:forEach items="${solicitacaoDTO.projetosEnvolvidos}" var="projetoDTO">
			             <tr>
			               <td>
			                  <c:set var="index" value="${index + 1}"/>
			                  <a href="#" onclick="obtemDetalhamentoDisciplinasPorSolicitacaoProjeto(divDetalheDisciplina${index}, ${projetoDTO.codProjeto}, ${solicitacaoDTO.codSolicitacao});">
			                     <img alt="Expandir" title="Expandir" src="<c:url value='/resources/images/icone_abre_detalhamento.png'/>"/>
			                  </a>
			               </td>
			               <td>
			                  <a href="<c:url value='/dashboardUnidade/obtemDashboardPorProjetoSolicitacao/${projetoDTO.codProjeto}/${solicitacaoDTO.codSolicitacao}'/>">
	                          ${projetoDTO.nomeProjeto}
	                        </a>
			               </td>
			               <td>
			                  <i class="icon-thumbs-up-alt"></i>
			               </td>
			               <td>
			                  <i class="icon-thumbs-down-alt"></i>
			               </td>
			             </tr>
			             <tr>
			               <td colspan="4">
			                  <div id="divDetalheDisciplina${index}">
			                  </div>
			               </td>
			             </tr>
		             </c:forEach>
		          </tbody>
		        </table>
	        </c:forEach>
	      </div>
      </c:forEach>
   </fieldset>
   <script>
	   function obtemDetalhamentoDisciplinasPorSolicitacaoProjeto(nomeDivDetalhamento, codProjeto, codSolicitacao){
		    $.getJSON("${pageContext.request.contextPath}/dashboardUnidade/obtemDetalhamentoDisciplinaPorProjetoSolicitacao?codProjeto="+codProjeto+"&codSolicitacao="+codSolicitacao, function(resultado){
		    	  $(nomeDivDetalhamento).append("<table class='table table-striped table-bordered'>");
		    	  $(nomeDivDetalhamento).append("<th>Disciplina</th>");
		    	  $(nomeDivDetalhamento).append("<th>Horas Planejadas</th>");
		    	  $(nomeDivDetalhamento).append("<th>Horas Realizadas</th>");
		    	  $(nomeDivDetalhamento).append("<th>Quantidade de Defeitos</th>");
		    	  $(nomeDivDetalhamento).append("<th>Horas com Defeito</th>");
		    	  $(nomeDivDetalhamento).append("<th>Percentual de Horas de Defeitos</th>");
		    	  $(nomeDivDetalhamento).append("</thead>");
		    	  $(nomeDivDetalhamento).append("<tbody>");
		        $.each(resultado, function(i, detalhamentoDisciplinaDTO){
		        	   $(nomeDivDetalhamento).append("<tr><td><a href='${pageContext.request.contextPath}/dashboardUnidade/obtemDetalhamentoAtividadesPorProjetoDisciplinaSolicitacao?codProjeto="+codProjeto+"&nomeDisciplina="+detalhamentoDisciplinaDTO.nomeDisciplina+"&codSolicitacao="+codSolicitacao+"'>"+detalhamentoDisciplinaDTO.nomeDisciplina+"</a></td><td>"+detalhamentoDisciplinaDTO.totalHorasPlanejadas+"</td><td>"+detalhamentoDisciplinaDTO.totalHorasRealizadas+"</td><td>"+detalhamentoDisciplinaDTO.quantidadeDefeitos+"</td><td>"+detalhamentoDisciplinaDTO.quantidadeHorasGastasDefeitos+"</td><td></td></tr>");
		        });
		        $(nomeDivDetalhamento).append("</tbody>");
		        $(nomeDivDetalhamento).append("</table>");
		    });
		    
	   }

// 	   function obtemDetalhamentoAtividadesPorDisciplina(codProjeto, nomeDisciplina, codSolicitacao, nomeDivDetalhamentoAtividade){
// 	          $.getJSON("${pageContext.request.contextPath}/dashboardUnidade/obtemDetalhamentoAtividadesPorProjetoDisciplinaSolicitacao?codProjeto="+codProjeto+"&nomeDisciplina="+nomeDisciplina+"&codSolicitacao="+codSolicitacao, function(resultado){
// 	              $(nomeDivDetalhamentoAtividade).append("<table class='table table-striped table-bordered'>");
// 	              $(nomeDivDetalhamentoAtividade).append("<th>Executor</th>");
// 	              $(nomeDivDetalhamentoAtividade).append("<th>Atividade</th>");
// 	              $(nomeDivDetalhamentoAtividade).append("<th>Início</th>");
// 	              $(nomeDivDetalhamentoAtividade).append("<th>Fim</th>");
// 	              $(nomeDivDetalhamentoAtividade).append("<th>Quantidade de Horas</th>");
// 	              $(nomeDivDetalhamentoAtividade).append("</thead>");
// 	              $(nomeDivDetalhamentoAtividade).append("<tbody>");
// 	              $.each(resultado, function(i, detalhamentoAtividadeDTO){
// 	                  $(nomeDivDetalhamentoAtividade).append("<tr><td>"+detalhamentoAtividadeDTO.nomeExecutor+"</td><td>"+detalhamentoAtividadeDTO.nomeAtividade+"</td><td>"+detalhamentoAtividadeDTO.dataInicio+"</td><td>"+detalhamentoAtividadeDTO.dataFim+"</td><td>"+detalhamentoAtividadeDTO.quantidadeHoras+"</td></tr>");
// 	              });
// 	              $(nomeDivDetalhamentoAtividade).append("</tbody>");
// 	              $(nomeDivDetalhamentoAtividade).append("</table>");
// 	          });
	          
// 	      }
   </script>
   <script type="text/javascript" src=""/>
</customTags:templateFuncionalidades>