
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
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
    * Obtém o relacionamento por pacote.
    * 
    * @param pacote
    * @return {@link List<PacoteSolicitacao>}
    */
   List<PacoteSolicitacao> obtemPorPacote(Pacote pacote);
}
