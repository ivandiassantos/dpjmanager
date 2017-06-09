<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags/template" prefix="customTags"%>
<customTags:templateFuncionalidades tituloFuncionalidade="Incluir Faturamento">
   <form:form class="form-horizontal form-label-left" servletRelativeAction="/restrito/faturamentos/incluirFaturamento" method="post">
      <input type="hidden" id="solicitacoes" name="solicitacoes"/>
      <div class="form-group">
         <label class="control-label col-md-3 col-sm-3 col-xs-12" for="pacote">Pacote:</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <select class="form-control" required name="codPacote" id="pacote">
					<option>Selecione</option>
					 <c:forEach var="pacote" items="${listaPacotes}">
					 	<option value="${pacote.codPacote}">${pacote.nomePacote}</option>
					 </c:forEach>
				</select>
         </div>
      </div>
      <div class="form-group">
			<label class="control-label col-md-3 col-sm-3 col-xs-12" for="solicitacao">Solicitação:</label>
			<div class="col-md-6 col-sm-6 col-xs-12">
				<select class="form-control" name="numeroSolicitacao" id="solicitacao" required>
					<option>Selecione</option>
				</select>
			</div>
	 </div>
	 <div class="form-group">
			<label class="control-label col-md-3 col-sm-3 col-xs-12">Projeto</label>
			<div class="col-md-6 col-sm-6 col-xs-12">
				<select class="form-control" id="projeto" name="codProjeto" required>
					<option>Selecione</option>
				</select>
			</div>
	 </div>
	 
	  <div class="form-group">
			<label class="control-label col-md-3 col-sm-3 col-xs-12" for="fase">Fase</label>
			<div class="col-md-6 col-sm-6 col-xs-12">
				<select class="form-control" name="codFase" required id="fase"> 
					<option>Selecione</option>
					<c:forEach items="${listaFases}" var="fase">
					    <option value="${fase.codFase}">${fase.descricaoFase}</option>
					</c:forEach>
				</select>
			</div>
	 </div>
	  <div class="form-group">
         <label class="control-label col-md-3 col-sm-3 col-xs-12" for="numeroOrdemServico">Nº da OS:</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="numeroOrdemServico" name="numeroOrdemServico" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>

	  <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="numeroNotaFiscal">Nº da Nota Fiscal</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="nomeSolicitacao" required name="numeroNotaFiscal" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
      
      <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="pontoFuncaoFaturado">Ponto de Função Faturado</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="pontoFuncaoFaturado" name="pontoFuncaoFaturado" required class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
      <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="valorFaturado">Valor Faturado(R$)</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="valorFaturado" name="valorFaturado" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
      

      <div class="form-group">
         <label class="control-label col-md-3 col-sm-3 col-xs-12" for="dataFaturamento">Data Faturamento:</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="date" id="dataFaturamento" name="dataRecebimento" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
      
      <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="valorRecebido">Recebido(R$)</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="valorRecebido" name="valorRecebimento" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>

      <div class="form-group radioTipoFaturamento">
		 <label class="control-label col-md-3 col-sm-3 col-xs-12">Tipo Faturamento:</label>
           <div class="col-md-6 col-sm-6 col-xs-12">
            <p>
              <input type="radio" name="tipoFaturamento" value="pf" required checked/> 
              Ponto de Função:
              <input type="radio" name="tipoFaturamento" value="horas" required/>
              Total de Horas:
            </p>
			</div>
      </div> 
      <div class="campoPontoFuncao">
         <div class="form-group">
	         <label class="control-label col-md-3 col-sm-3 col-xs-12" for="pontoFuncaoEstimado">Ponto de Função Estimado:</label>
	         <div class="col-md-6 col-sm-6 col-xs-12">
	            <input type="text" id="pontoFuncaoEstimado" name="pontoFuncaoEstimado" class="form-control col-md-7 csol-xs-12">
	         </div>
         </div>
         <div class="form-group">
            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="pontoFuncaoDetalhado">Ponto de Função Detalhado:</label>
            <div class="col-md-6 col-sm-6 col-xs-12">
               <input type="text" id="pontoFuncaoDetalhado" name="pontoFuncaoDetalhado" class="form-control col-md-7 csol-xs-12">
            </div>
         </div>
      </div>
      
       <div class="form-group campoHoras">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="totalHoras">Total de Horas</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="totalHoras" name="qtdHorasRealizadas" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
      <div class="ln_solid"></div>
      <div class="form-group">
         <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
            <input type="submit" class="btn btn-primary" value="Incluir"/>
            <a href="<c:url value='/restrito/faturamentos/iniciarPesquisaFaturamento'/>" class="btn btn-primary">Cancelar</a>
         </div>
      </div>
   </form:form>
   <script src="<c:url value='/restrito/js/faturamentos/incluiFaturamento.js'/>"></script>
</customTags:templateFuncionalidades>