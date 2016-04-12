<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<customTags:template>
   <div class="col-md-12 col-sm-12 col-xs-12">
      <ol class="breadcrumb">
        <li><a href="#">Pacotes</a></li>
      </ol>
      <div class="x_panel" style="height:600px;">
         <div class="x_title">
             <h2>Incluir</h2>
             <div class="clearfix"></div>
         </div>
         <div class="x_content">
           <form:form servletRelativeAction="/pacote/incluirPacote" method="post" cssClass="form-horizontal form-label-left">
               <div class="form-group">
                  <label for="nomePacote" class="control-label col-md-1">Nome</label>
                  <div class="col-md-3">
                     <input type="text" id="nomePacote" class="form-control" required name="nomePacote"/>
                  </div>
               </div>
               <div class="form-group">
                  <label for="dataInicio" class="control-label col-md-1">Data de Início:</label>
                  <div class="col-md-3">
                     <input type="date" id="dataInicio" class="form-control" required name="dataInicio"/>
                  </div>
               </div>
               <div class="form-group">
                  <label for="dataTermino" class="control-label col-md-1">Data de Término:</label>
                  <div class="col-md-3">
                     <input type="date" id="dataTermino" class="form-control" required name="dataFinal"/>
                  </div>
               </div>
               <div class="form-group">
                  <label for="nomeSolicitacao" class="control-label col-md-1">Solicitação</label>
                  <div class="col-md-3">
                     <input type="text" id="nomeSolicitacao" class="form-control" required name="nomeSolicitacao"/>
                  </div>
               </div>
               <div class="ln_solid"></div>
               <div class="form-group">
                   <div class="col-md-3">
                       <button type="submit" class="btn btn-success">Incluir</button>
                       <button type="reset" class="btn">Limpar</button>
                       <button type="button" class="btn btn-default">Cancelar</button>
                   </div>
               </div>
           </form:form>
         </div>
      </div>
   </div>
</customTags:template>