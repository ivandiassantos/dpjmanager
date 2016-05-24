<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<customTags:templateFuncionalidades nomeIconeFuncionalidade="icon-dashboard" tituloFuncionalidade="Dashboard - UPJ BASA">
   <fieldset>
      <ul class="messages_layout">
         <c:forEach items="${listaDashboardUnidade}" var="dashboardUnidadeDTO">
	         <li class="from_user left">
	            <div class="message_wrap">
	               <span class="arrow"></span>
	               <div class="info">
	                  <h3>Pacote&nbsp;${dashboardUnidadeDTO.nomePacote}</h3>
	               </div>
	               <div class="text">
	                  <c:forEach items="${dashboardUnidadeDTO.listaSolicitacoes}" var="solicitacaoDTO">
	                    <div class="info">
	                       <h4>${solicitacaoDTO.idSolicitacao}&nbsp;-&nbsp;${solicitacaoDTO.descricaoSolicitacao}</h4>
	                    </div>
	                    <table class="table-striped table-bordered">
	                       <thead>
	                          <th>Projetos</th>
	                          <th>Qualidade</th>
	                          <th>Produtividade</th>
	                       </thead>
                          <tbody>
                              <c:forEach items="${solicitacaoDTO.projetosEnvolvidos}" var="projeto">
                                 <tr>
                                    <td>
                                       <a href="<c:url value='/dashboardUnidade/obtemDashboardPorProjetoSolicitacao/${projeto.codProjeto}/${solicitacaoDTO.idSolicitacao}'/>">${projeto.nomeProjeto}</a>
                                    </td>
                                    <td>
                                       <i class="icon-thumbs-up icon-4"></i>
                                    </td>
                                    <td>
                                       <i class="icon-thumbs-down icon-4"></i>
                                    </td>
                                 </tr>
                              </c:forEach>
                          </tbody>
                        </table>
	                  </c:forEach>
	               </div>
	            </div>
	         </li>
         </c:forEach>
      </ul>
   </fieldset>
</customTags:templateFuncionalidades>