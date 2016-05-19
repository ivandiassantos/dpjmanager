<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<customTags:templateFuncionalidades nomeIconeFuncionalidade="icon-briefcase" tituloFuncionalidade="Pesquisar Pacotes">
	<form class="form-horizontal">
		<fieldset>
			<div class="control-group">											
				<label class="control-label" for="nomePacote">Nome:</label>
				<div class="controls">
					<input type="text" class="span6" id="nomePacote" name="nomePacote" />
				</div>		
			</div>
			<div class="control-group">											
				<label class="control-label" for="dataInicio">Data de Início:</label>
				<div class="controls">
					<input type="date" class="span6" id="dataInicio" name="dataInicio" />
				</div>		
			</div>
			<div class="control-group">											
				<label class="control-label" for="dataTermino">Data de Término:</label>
				<div class="controls">
					<input type="date" class="span6" id="dataTermino" name="dataTermino" />
				</div>		
			</div>
			<div class="form-actions">
				<button type="submit" class="btn btn-primary">Pesquisar</button>
				<button class="btn">Limpar</button>
				<a href="<c:url value='/pacote/iniciarInclusaoPacote'/>" class="btn btn-info">Novo</a>
			</div>
		</fieldset>
		<fieldset>
			<c:if test="${!empty listaPacotes}">
				<table id="listaPacotes" class="display">
					<thead>
            			<tr>
            				<th>Nome do Pacote</th>
            				<th>Data de Início</th>
            				<th>Data de Término</th>
            				<th>Solicitações</th>
            				<th>Ações</th>
            			</tr>
            		</thead>
            		<tbody>
	            		<c:forEach items="${listaPacotes}" var="pacote">
	            			<tr>
	            				<td>
	            					${pacote.nomePacote}
	            				</td>
	            				<td>
	            					${pacote.dataInicio}
	            				</td>
	            				<td>
	            					${pacote.dataFinal}
	            				</td>
	            				<td>
	            					<c:forEach items="${pacote.pacotesSolicitacao}" var="pacoteSolicitacao">
	            						${pacoteSolicitacao.idSolicitacao}<br/>
	            					</c:forEach>
	            				</td>
	            				<td>
	            					<a href="<c:url value='/pacote/detalharPacote/${pacote.codPacote}'/>" class="btn btn-success btn-small" title="Visualizar"><i class="btn-icon-only icon-search"></i></a>
	            					<a href="<c:url value='/pacote/iniciarEdicaoPacote/${pacote.codPacote}'/>" class="btn btn-primary btn-small" title="Editar"><i class="btn-icon-only icon-edit"></i></a>
	            					<a href="#myModal" role="button" data-toggle="modal" class="btn btn-danger btn-small" title="Excluir"><i class="btn-icon-only icon-trash"></i></a>
	            					<!-- Modal -->
						            <div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
						                 <div class="modal-header">
						                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
						                    <h3 id="myModalLabel">Thank you for visiting EGrappler.com</h3>
						                 </div>
						                 <div class="modal-body">
						                    <p>One fine body…</p>
						                 </div>
						                 <div class="modal-footer">
						                      <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
						                      <button class="btn btn-primary">Save changes</button>
						                 </div>
						            </div>
	            				</td>
	            			</tr>	
	            		</c:forEach>
            		</tbody>
				</table>
			</c:if>
		</fieldset>
	</form>
	<script src="<c:url value='/resources/js/jquery.dataTables.js'/>"></script>
	<script>
		$('#listaPacotes').DataTable();
	</script>
</customTags:templateFuncionalidades>