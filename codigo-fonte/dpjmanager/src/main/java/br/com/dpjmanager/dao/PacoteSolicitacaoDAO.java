
package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;

/**
 * Dao referente a persistência do relacionamento entre pacote e solicitação.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
public interface PacoteSolicitacaoDAO
{

   /**
    * Inclui o relacionamento entre pacote e solicitação.
    * 
    * @param pacoteSolicitacao
    */
   void salvar(PacoteSolicitacao pacoteSolicitacao);

   /**
    * Lista os registros entre pacote e solicitação pelo código do pacote.
    * 
    * @param codPacote
    * @return {@link List<PacoteSolicitacao>}
    */
   List<PacoteSolicitacao> obtemPorPacote(Long codPacote);

   /**
    * Remove o relacionamento entre pacote e solicitação.
    * 
    * @param pacoteSolicitacao
    */
   void remover(PacoteSolicitacao pacoteSolicitacao);
}
