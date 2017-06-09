<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags/template" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<customTags:templateFuncionalidades tituloFuncionalidade="Pesquisar Pacotes">
	<form id="demo-form2" data-parsley-validate
		class="form-horizontal form-label-left">
		<div class="form-group">
			<label class="control-label col-md-3 col-sm-3 col-xs-12"
				for="nomePacote">Nome:</label>
			<div class="col-md-6 col-sm-6 col-xs-12">
				<input type="text" id="nomePacote" required name="nomePacote"
					class="form-control col-md-7 col-xs-12">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3 col-sm-3 col-xs-12"
				for="numeroSolicitacao">Número da Solicitação:</label>
			<div class="col-md-6 col-sm-6 col-xs-12">
				<input type="text" id="numeroSolicitacao" name="numeroSolicitacao"
					class="form-control col-md-7 csol-xs-12">
			</div>
		</div>
		<div class="form-group">
			<label for="descricaoSolicitacao"
				class="control-label col-md-3 col-sm-3 col-xs-12">Descrição
				da Solicitação:</label>
			<div class="col-md-6 col-sm-6 col-xs-12">
				<input name="descricaoSolicitacao"
					class="form-control col-md-7 col-xs-12" type="text"
					id="descricaoSolicitacao" name="middle-name">
			</div>
		</div>
		<div class="ln_solid"></div>
		<div class="form-group">
			<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
				<button type="submit" class="btn btn-primary">Pesquisar</button>
				<a href="<c:url value='/restrito/pacotes/iniciarInclusaoPacote'/>" class="btn btn-success">Novo</a>
			</div>
		</div>
		<div class="col-md-12 col-sm-12 col-xs-12">
			<table id="resultadoPesquisa"
				class="table table-striped table-bordered dt-responsive nowrap"
				cellspacing="0" width="100%">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Data de Início</th>
						<th>Data Final</th>
						<th>Solicitações</th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
				   <c:forEach var="pacoteDTO" items="${listaPacotes}">
			         <tr>
			            <td>${pacoteDTO.nomePacote}</td>
                     <td>
                        <fmt:formatDate value="${pacoteDTO.dataInicio}" pattern="dd/MM/yyyy"/> 
                     </td>
                     <td> 
                        <fmt:formatDate value="${pacoteDTO.dataFinal}" pattern="dd/MM/yyyy"/>
                     </td>
                     <td>
                        <c:forEach items="${pacoteDTO.solicitacoes}" var="solicitacaoDTO">
                           ${solicitacaoDTO.idSolicitacao}&nbsp;-&nbsp;${solicitacaoDTO.descricaoSolicitacao}
                           <br/>
                        </c:forEach>
                     </td>
                     <td>
                        <a href="<c:url value='/restrito/pacotes/iniciarEdicaoPacote?codPacote=${pacoteDTO.codPacote}'/>" class="btn btn-default" title="Editar"><i class="fa fa-edit"></i></a>
                        <a href="#" class="btn btn-default" title="Excluir"><i class="fa fa-trash"></i></a>
                     </td>
                  </tr>
				   </c:forEach>
				</tbody>
			</table>
		</div>
	</form>
	<script src="<c:url value='/restrito/js/pacotes/pesquisaPacotes.js'/>"></script>
</customTags:templateFuncionalidades>