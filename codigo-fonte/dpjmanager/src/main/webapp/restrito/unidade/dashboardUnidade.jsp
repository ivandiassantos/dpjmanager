<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<customTags:templateFuncionalidades nomeIconeFuncionalidade="icon-dashboard" tituloFuncionalidade="Dashboard - UPJ BASA">
   <fieldset>
      <c:forEach items="${listaDashboardUnidade}" var="dashboardUnidadeDTO">
	      <table class="table table-striped table-bordered">
	        <thead>
	           <tr>
	              <th colspan="2">Pacote&nbsp;${dashboardUnidadeDTO.nomePacote}</th>
	           </tr>
	           <tr>
                 <th>Solicitação</th>
                 <th>Produtos</th>
              </tr>
	        </thead>
	        <tbody>
	           <c:forEach items="${dashboardUnidadeDTO.listaSolicitacoes}" var="solicitacao">
	              <tr>
	                 <td>
	                    ${solicitacao.idSolicitacao}&nbsp;-&nbsp;${solicitacao.descricaoSolicitacao}
	                 </td>
	              </tr>
	           </c:forEach>
	        </tbody>
	      </table>
      </c:forEach>
   </fieldset>
</customTags:templateFuncionalidades>