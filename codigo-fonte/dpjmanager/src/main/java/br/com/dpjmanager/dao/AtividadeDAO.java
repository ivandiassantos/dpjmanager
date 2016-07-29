package br.com.dpjmanager.dao;

import br.com.dpjmanager.entidades.rhour.Atividade;

public interface AtividadeDAO extends Dao<Atividade>
{

   // List<Atividade> obtemAtividadePorIdSolicitacao(String idSolicitacao);

   Atividade obtemSolicitacaoPorIdSolicitacao(String idSolicitacao);

   Atividade obtemPorId(Long codAtividade);
}
