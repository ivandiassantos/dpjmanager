<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/template" prefix="customTags"%>
<customTags:templateFuncionalidades tituloFuncionalidade="Faturamento">
	<form id="demo-form2" data-parsley-validate
		class="form-horizontal form-label-left">

		<div class="form-group">
			<label class="control-label col-md-3 col-sm-3 col-xs-12"
				for="pacote">Pacote <span class="required">*</span>
			</label>
			<div class="col-md-6 col-sm-6 col-xs-12">
				<input type="text" id="pacote" required="required"
					class="form-control col-md-7 col-xs-12">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3 col-sm-3 col-xs-12"
				for="solicitacao">Solicitação <span class="required">*</span>
			</label>
			<div class="col-md-6 col-sm-6 col-xs-12">
				<input type="text" id="solicitacao" name="solicitacao"
					required="required" class="form-control col-md-7 col-xs-12">
			</div>
		</div>
		
		<div class="form-group">
			<label for="projeto"
				class="control-label col-md-3 col-sm-3 col-xs-12">Projeto</label>
			<div class="col-md-6 col-sm-6 col-xs-12">
				<input id="projeto" class="form-control col-md-7 col-xs-12"
					type="text" name="fase">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-md-3 col-sm-3 col-xs-12">Fase</label>
			<div class="col-md-6 col-sm-6 col-xs-12">
				<select class="form-control">
					<option>Selecione</option>

				</select>
			</div>
		</div>

		
		<div class="ln_solid"></div>
		<div class="form-group">
			<div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
				<button type="submit" class="btn btn-primary">Pesquisar</button>
				<button type="submit" class="btn btn-success">Novo</button>
			</div>
		</div>
          
          <div class="col-md-12 col-sm-12 col-xs-12">
			<table id="tabelaPacotes"
				class="table table-striped table-bordered dt-responsive nowrap"
				cellspacing="0" width="100%">
				<thead>
					<tr>
                        <th>Pacote</th>
                        <th>Solicitação</th>
                        <th>Projeto</th>
                        <th>Fase</th>
                        <th>Nº OS</th>
                        <th>Nº Nota Fiscal</th>
                        <th>PF</th>
                        <th>Data Cadastro</th>
                        <th>Faturado R$</th>
                        <th>Data Fat.</th>
                        <th>Recebido R$</th>
                        <th>PF/Horas</th>
                        <th>Ações</th>
					</tr>
				</thead>
				<tbody>
				   <c:forEach var="pacoteDTO" items="${listaPacotes}">
			         <tr>
			            <td></td>
                     <td></td>
                     <td></td>
                     <td></td>
                     <td></td>
                  </tr>
				   </c:forEach>
				</tbody>
			</table>
		</div>
	</form>
	<script src="<c:url value='/restrito/js/pacotes/pacotes.js'/>"></script>
	
	
</customTags:templateFuncionalidades>
