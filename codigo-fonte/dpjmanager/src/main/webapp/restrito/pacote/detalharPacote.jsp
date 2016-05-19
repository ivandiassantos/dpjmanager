<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<customTags:templateFuncionalidades nomeIconeFuncionalidade="icon-briefcase" tituloFuncionalidade="Detalhar Pacote">
	<form class="form-horizontal">
		<fieldset>
			<div class="control-group">											
				<label class="control-label" for="nomePacote">Nome do Pacote:</label>
				<div class="controls">
					<label class="control-label" id="nomePacote">${pacote.nomePacote}</label>
				</div>		
			</div>
			<div class="control-group">											
				<label class="control-label" for="dataInicio">Data de Início:</label>
				<div class="controls">
					<label class="control-label" id="dataInicio">${pacote.dataInicio}</label>
				</div>		
			</div>
			<div class="control-group">											
				<label class="control-label" for="dataTermino">Data de Término:</label>
				<div class="controls">
					<label class="control-label" id="dataTermino">${pacote.dataFinal}</label>
				</div>		
			</div>
			<div class="control-group">											
				<label class="control-label" for="dataInclusao">Data de Criação:</label>
				<div class="controls">
					<label class="control-label" id="dataInclusao">${pacote.dataCriacao}</label>
				</div>		
			</div>
			<div class="control-group">											
				<table class="table table-striped table-bordered">
					<thead>
						<tr>
							<th>Solicitação</th>
							<th>Descrição</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listaSolicitacoes}" var="solicitacao">
							<tr>
								<td>
								    ${solicitacao.idSolicitacao}
								</td>
								<td>
								    ${solicitacao.descricaoSolicitacao}
                        </td>
							</tr>
						</c:forEach>
					</tbody>
				</table>	
			</div>
		</fieldset>
      <div class="form-actions">
         <a href="<c:url value='/pacote/iniciarPesquisaPacotes'/>" class="btn">Voltar</a>
      </div>
	</form>
</customTags:templateFuncionalidades>