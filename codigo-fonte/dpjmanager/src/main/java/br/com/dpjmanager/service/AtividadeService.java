
package br.com.dpjmanager.service;

import br.com.dpjmanager.entidades.rhour.Atividade;


public interface AtividadeService
{
   // List<Atividade> obtemPorProjetoSolicitacao(Long codProjeto, String idSolicitacao);
   Atividade obtemSolicitacoesPorIdSolicitacao(String idSolicitacao);

   Atividade obtemAtividadePorId(Long codAtividade);
}
