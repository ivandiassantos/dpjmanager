<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags/template" prefix="customTags"%>
<customTags:templateFuncionalidades tituloFuncionalidade="Incluir Faturamento">
   <form:form class="form-horizontal form-label-left" servletRelativeAction="/restrito/faturamentos/incluirFaturamento" method="post">
      <input type="hidden" id="solicitacoes" name="solicitacoes"/>
      <div class="form-group">
         <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nomePacote">Pacote:</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <select class="form-control">
					<option>Selecione</option>
					 <c:forEach var="pacote" items="${listaPacotes}">
					 	<option value="${pacote.codPacote}">${pacote.nomePacote }</option>
					 </c:forEach>
				</select>
         </div>
      </div>
      <div class="form-group">
			<label class="control-label col-md-3 col-sm-3 col-xs-12">Solicitação</label>
			<div class="col-md-6 col-sm-6 col-xs-12">
				<select class="form-control">
					<option>Selecione</option>
				</select>
			</div>
	 </div>
	 <div class="form-group">
			<label class="control-label col-md-3 col-sm-3 col-xs-12">Projeto</label>
			<div class="col-md-6 col-sm-6 col-xs-12">
				<select class="form-control">
					<option>Selecione</option>
				</select>
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
	  <div class="form-group">
         <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nomeSolicitacao">Nº da OS:</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="nomeSolicitacao" name="nomeSolicitacao" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>

	  <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nomeSolicitacao">Nº da Nota Fiscal</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="nomeSolicitacao" name="nomeSolicitacao" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
      
      <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nomeSolicitacao">PF</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="nomeSolicitacao" name="nomeSolicitacao" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
      <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nomeSolicitacao">Faturado(R$)</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="nomeSolicitacao" name="nomeSolicitacao" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
      

      <div class="form-group">
         <label class="control-label col-md-3 col-sm-3 col-xs-12" for="dataInicio">Data Faturamento:</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="date" id="dataInicio" name="dataInicio" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
      
       <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nomeSolicitacao">Recebido(R$)</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="nomeSolicitacao" name="nomeSolicitacao" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>

      <div class="form-group">
		 <label class="control-label col-md-3 col-sm-3 col-xs-12">Tipo Faturamento *:</label>
           <div class="col-md-6 col-sm-6 col-xs-12">
            <p>
              Ponto de Função:
              <input type="radio" class="flat" name="gender" id="genderM" value="M" checked="" required /> 
              Total de Horas:
              <input type="radio" class="flat" name="gender" id="genderF" value="F" />
            </p>
			</div>
      </div> 
      <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nomeSolicitacao">Ponto de Função:</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="nomeSolicitacao" name="nomeSolicitacao" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
       <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nomeSolicitacao">Horas</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="nomeSolicitacao" name="nomeSolicitacao" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
      

      <table class="table table-striped table-bordered" id="tabelaSolicitacoes">
         <thead>
             <tr>
                <th>Solicitação</th>
                <th class="td-actions">Remover</th>
             </tr>
         </thead>
         <tbody>
         </tbody>
      </table>
      <div class="ln_solid"></div>
      <div class="form-group">
         <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
            <input type="submit" class="btn btn-primary" value="Incluir"/>
            <a href="<c:url value='/restrito/pacotes/iniciarPesquisaPacotes'/>" class="btn btn-primary">Cancelar</a>
         </div>
      </div>
   </form:form>
   <script src="<c:url value='/restrito/js/faturamentos/incluiFaturamento.js'/>"></script>
</customTags:templateFuncionalidades>