
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.entidades.cq.Solicitacao;

/**
 * Serviço para funcionalidades referentes a solicitação.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
public interface SolicitacaoService
{

   /**
    * Lista as solicitações por nome ou id.
    * 
    * @param nomeSolicitacao
    * @param solicitacoes
    * @return {@link List<Solicitacao>}
    */
   List<Solicitacao> listaSolicitacaoPorNome(String nomeSolicitacao, String solicitacoes);

   /**
    * Obtém a solicitação por id.
    * 
    * @param idSolicitacao
    * @return {@link Solicitacao}
    */
   Solicitacao obtemPorId(String idSolicitacao);

   /**
    * Lista as solicitações relacionadas a um pacote.
    * 
    * @param codPacote
    * @return {@link List<Solicitacao>}
    */
   List<Solicitacao> listaPorCodPacote(Long codPacote);
}
