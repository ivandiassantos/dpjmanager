
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.entidades.cq.Solicitacao;

public interface SolicitacaoService
{

   List<Solicitacao> listaSolicitacaoPorNome(String nomeSolicitacao, String solicitacoes);
}
