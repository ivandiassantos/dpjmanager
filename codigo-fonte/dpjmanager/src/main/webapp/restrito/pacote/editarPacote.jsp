<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="customTags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<customTags:templateFuncionalidades nomeIconeFuncionalidade="icon-briefcase" tituloFuncionalidade="Incluir Pacote">
   <form:form cssClass="form-horizontal" servletRelativeAction="/pacote/editarPacote" method="post">
      <input type="hidden" id="solicitacoes" name="solicitacoes"/>
      <fieldset>
         <div class="control-group">                                 
            <label class="control-label" for="nomePacote">Nome:</label>
            <div class="controls">
               <input type="text" class="span6" id="nomePacote" name="nomePacote" value="${pacote.nomePacote}" required maxlength="200"/>
            </div>      
         </div>
         <div class="control-group">                                 
            <label class="control-label" for="dataInicio">Data de Início:</label>
            <div class="controls">
               <input type="date" class="span6" id="dataInicio" name="dataInicio" required value="${pacote.dataInicio}"/>
            </div>      
         </div>
         <div class="control-group">                                 
            <label class="control-label" for="dataFinal">Data de Término:</label>
            <div class="controls">
               <input type="date" class="span6" id="dataFinal" name="dataFinal" required value="${pacote.dataFinal}"/>
            </div>      
         </div>
         <div class="control-group">                                 
            <label class="control-label" for="nomeSolicitacao">Solicitação:</label>
            <div class="controls">
               <input type="text" class="span6" id="nomeSolicitacao" name="nomeSolicitacao" maxlength="50"/>
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
                  <c:forEach items="${listaSolicitacoes}" var="solicitacao">
	                  <tr>
	                    <td>
	                       ${solicitacao.idSolicitacao}&nbsp;-&nbsp;${solicitacao.descricaoSolicitacao}
	                    </td>
	                    <td>
	                       <button class='btn btn-danger btn-small botaoRemoverSolicitacao' title='Remover' onclick='removerSolicitacao(${solicitacao.idSolicitacao});'>
	                          <i class='btn-icon-only icon-remove'></i>
	                       </button>
	                    </td>
	                  </tr>
                  </c:forEach>
               </tbody>
         </table>
         <div class="form-actions">
            <button type="submit" class="btn btn-primary">Salvar</button>
            <button type="reset" class="btn">Limpar</button>
            <a href="<c:url value='/pacote/iniciarPesquisaPacotes'/>" class="btn btn-info">Cancelar</a>
         </div>
         <br/>
      </fieldset>
   </form:form>
   <script>
       var campoHiddenSolicitacoes = [];
      $("#nomeSolicitacao").autocomplete({
         minLength: 4,
           delay: 500,
           source: function (request, response) {
               $.getJSON("${pageContext.request.contextPath}/solicitacao/listaSolicitacoesPorNome?nomeSolicitacao="+$("#nomeSolicitacao").val()+"&solicitacoes="+$("#solicitacoes").val(), request, function(result) {
                   response($.map(result, function(item) {
                       return {
                           label: item.idSolicitacao + " - " + item.descricaoSolicitacao,
                           value: item.idSolicitacao
                       }
                   }));
               });
           },
         select : function(event, ui) {
            if (ui.item) {
               $("#tabelaSolicitacoes").show();
               atualizaCampoHiddenSolicitacoes(ui.item.value);
               $('#tabelaSolicitacoes > tbody:last').append("<tr><td>"+ui.item.label+"</td><td><button class='btn btn-danger btn-small botaoRemoverSolicitacao' title='Remover' onclick='removerSolicitacao('"+ui.item.value+"');'><i class='btn-icon-only icon-remove'></i></button></td></tr>");
            }
         }                
      });
      function atualizaCampoHiddenSolicitacoes(idSolicitacao){
         campoHiddenSolicitacoes.push(idSolicitacao);
         $('#solicitacoes').val(JSON.stringify(campoHiddenSolicitacoes));
      }
      $(document).on('click','button.botaoRemoverSolicitacao', function() {
         var solicitacao = $(this).closest('tr').children('td').text();
         var idSolicitacao = solicitacao.substring(0,11);
         removerSolicitacao(idSolicitacao);
         $(this).closest('tr').remove();
         return false;
      });

      function removerSolicitacao(idSolicitacao){
         for(var i = campoHiddenSolicitacoes.length - 1; i >= 0; i--) {
             if(campoHiddenSolicitacoes[i] === idSolicitacao) {
                campoHiddenSolicitacoes.splice(i, 1);
             }
         }
      }
   </script>
</customTags:templateFuncionalidades>