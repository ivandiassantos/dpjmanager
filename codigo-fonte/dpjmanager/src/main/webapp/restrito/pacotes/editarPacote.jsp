<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib tagdir="/WEB-INF/tags/template" prefix="customTags"%>
<customTags:templateFuncionalidades tituloFuncionalidade="Alterar Pacote">
   <form:form class="form-horizontal form-label-left" servletRelativeAction="/restrito/pacotes/editarPacote" method="post">
      <input type="hidden" id="codPacote" value="${pacote.codPacote}" name="codPacote"/>
      <input type="hidden" id="solicitacoes" name="solicitacoes"/>
      <div class="form-group">
         <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nomePacote">Nome:</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="nomePacote" required name="nomePacote" value="${pacote.nomePacote}" class="form-control col-md-7 col-xs-12">
         </div>
      </div>
      <div class="form-group">
         <label class="control-label col-md-3 col-sm-3 col-xs-12" for="dataInicio">Data de Início:</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="date" id="dataInicio" name="dataInicio" value="${pacote.dataInicio}" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
      <div class="form-group">
         <label class="control-label col-md-3 col-sm-3 col-xs-12" for="dataFinal">Data de Término:</label>
         <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="date" id="dataFinal" name="dataFinal" value="${pacote.dataFinal}" class="form-control col-md-7 csol-xs-12">
         </div>
      </div>
      <div class="form-group">
         <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nomeSolicitacao">Solicitação:</label>
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
            <input type="submit" class="btn btn-primary" value="Alterar"/>
            <a href="<c:url value='/restrito/pacotes/iniciarPesquisaPacotes'/>" class="btn btn-primary">Cancelar</a>
         </div>
      </div>
   </form:form>
   <script src="<c:url value='/restrito/js/pacotes/editarPacote.js'/>"></script>
</customTags:templateFuncionalidades>