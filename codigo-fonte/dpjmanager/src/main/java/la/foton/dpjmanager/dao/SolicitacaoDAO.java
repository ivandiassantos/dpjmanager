package la.foton.dpjmanager.dao;

import java.util.List;

import la.foton.dpjmanager.entidades.cq.Solicitacao;


public interface SolicitacaoDAO extends Dao<Solicitacao>
{

   List<Solicitacao> listaSolicitacoesPorNome(String nomeSolicitacao, List<String> listaIdsSolicitacoes);
   
   Solicitacao buscaPorCodigoSolicitacao(Long codSolicitacao);
   
   Solicitacao buscaPorIdSolicitacao(String idSolicitacao);
}
