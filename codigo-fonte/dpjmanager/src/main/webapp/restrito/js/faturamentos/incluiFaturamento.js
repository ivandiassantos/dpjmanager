/**
 * Codificação Javascript para a inclusão de faturamento.
 */
$(document).ready(function() {
	$("#pontoFuncaoFaturado").mask("#.##0,00", {reverse: true});
	$("#valorFaturado").mask("#.##0,00", {reverse: true});
	$("#valorRecebido").mask("#.##0,00", {reverse: true});
	$("#pontoFuncaoEstimado").mask("#.##0,00", {reverse: true});
	$("#pontoFuncaoDetalhado").mask("#.##0,00", {reverse: true});
	$("#totalHoras").mask("99:99", {reverse: true});
	$('input[name=tipoFaturamento]').change(function(){
	    if($('input[name=tipoFaturamento]:checked').val() === 'horas'){
	    	$(".campoHoras").show();
	    	$(".campoPontoFuncao").hide();
	    }else{
	    	$(".campoHoras").hide();
	    	$(".campoPontoFuncao").show();
	    }
	});
	$(".campoHoras").hide();
	$("#pacote").change(function() {
		$.getJSON(window.location.origin+"/dpjmanager/restrito/solicitacoes/listaSolicitacoesPorCodPacote?codPacote="+$("#pacote").val(), 
			function(result) {
				$("#solicitacao").empty();
				$("#solicitacao").append($("<option>Selecione</option>").val(""));
				$.each(result, function(i, item){
					$("#solicitacao").append($("<option></option>").val(item.idSolicitacao).html(item.descricaoSolicitacao));
				});
        	}
		);
	});
	
	$("#solicitacao").change(function() {
		obtemProjetosPorSolicitacao();
	});
});

function obtemProjetosPorSolicitacao(){
	$.getJSON(window.location.origin+"/dpjmanager/restrito/projetos/obtemProjetosPorSolicitacao?numeroSolicitacao="+$("#solicitacao").val(), 
		function(result) {
			$("#projeto").empty();
			$("#projeto").append($("<option>Selecione</option>").val(""));
			$.each(result, function(i, item){
				$("#projeto").append($("<option></option>").val(item.codProjeto).html(item.descricaoProjeto));
			});
		}
	);
}