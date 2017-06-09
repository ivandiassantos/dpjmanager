
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;

/**
 * Serviço para funcionalidades referentes a relação entre pacote e solicitação.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
public interface PacoteSolicitacaoService
{

   /**
    * Inclui o relacionamento entre pacote e solicitação.
    * 
    * @param pacoteSolicitacao
    */
   void incluirPacoteSolicitacao(PacoteSolicitacao pacoteSolicitacao);

   /**
    * Obtém os relacionamentos entre pacote e solicitação.
    * 
    * @param codPacote
    * @return {@link List<PacoteSolicitacao>}
    */
   List<PacoteSolicitacao> obtemPorPacote(Long codPacote);
   
   /**
    * Remove os relacionamentos pelo código do pacote.
    * 
    * @param codPacote
    */
   void removerPorCodigoPacote(Long codPacote);

}
