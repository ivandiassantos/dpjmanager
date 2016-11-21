/**
 * Codificação Javascript para a edição de pacotes.
 */
$(document).ready(function() {
	$("#nomeSolicitacao").autocomplete({
		minLength: 5,
	    delay: 500,
	    source: function (request, response) {
	        $.getJSON(window.location.origin+"/dpjmanager/restrito/solicitacao/listaSolicitacoesPorNome?nomeSolicitacao="+$("#nomeSolicitacao").val()+"&solicitacoes="+$("#solicitacoes").val(), request, function(result) {
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
				atualizaCampoHiddenSolicitacoes(ui.item.value);
				$('#tabelaSolicitacoes > tbody:last').append("<tr><td>"+ui.item.label+"</td><td><button class='btn btn-danger botaoRemoverSolicitacao' title='Remover' onclick='removerSolicitacao('"+ui.item.value+"');'><i class='fa fa-trash'></i></button></td></tr>");
			}
		}                
	});
	$(document).on('click','button.botaoRemoverSolicitacao', function() {
		var solicitacao = $(this).closest('tr').children('td').text();
		var idSolicitacao = solicitacao.substring(0,11);
		removerSolicitacao(idSolicitacao);
	  	$(this).closest('tr').remove();
	  	return false;
	});
});

function atualizaCampoHiddenSolicitacoes(idSolicitacao){
	campoHiddenSolicitacoes.push(idSolicitacao);
	$('#solicitacoes').val(JSON.stringify(campoHiddenSolicitacoes));
}

function removerSolicitacao(idSolicitacao){
	for(var i = campoHiddenSolicitacoes.length - 1; i >= 0; i--) {
	    if(campoHiddenSolicitacoes[i] === idSolicitacao) {
	       campoHiddenSolicitacoes.splice(i, 1);
	    }
	}
}

