
package la.foton.dpjmanager.service;

import java.util.List;
import la.foton.dpjmanager.entidades.cq.Solicitacao;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;

public interface SolicitacaoService
{

   List<Solicitacao> listaSolicitacaoPorNome(String nomeSolicitacao, String solicitacoes);

   Solicitacao buscaPorCodigoSolicitacao(Long codSolicitacao);

   Solicitacao buscaPorIdSolicitacao(String idSolicitacao);

   List<Solicitacao> listaPorPacote(Pacote pacote);
}
