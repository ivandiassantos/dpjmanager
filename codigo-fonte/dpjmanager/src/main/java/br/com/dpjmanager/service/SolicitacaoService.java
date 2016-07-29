
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.entidades.cq.Solicitacao;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.entidades.rhour.Atividade;

public interface SolicitacaoService
{

   List<Solicitacao> listaSolicitacaoPorNome(String nomeSolicitacao, String solicitacoes);

   Solicitacao buscaPorCodigoSolicitacao(Long codSolicitacao);

   Solicitacao buscaPorIdSolicitacao(String idSolicitacao);

   List<Atividade> listaPorPacote(Pacote pacote);
}
