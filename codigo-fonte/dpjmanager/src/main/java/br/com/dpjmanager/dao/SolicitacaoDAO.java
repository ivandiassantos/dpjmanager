package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.cq.Solicitacao;


public interface SolicitacaoDAO extends Dao
{

   List<Solicitacao> listaSolicitacoesPorNome(String nomeSolicitacao, List<String> listaIdsSolicitacoes);
   
   Solicitacao buscaPorCodigoSolicitacao(Long codSolicitacao);
   
   Solicitacao buscaPorIdSolicitacao(String idSolicitacao);
}
