
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.dto.PacoteDTO;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.exception.BusinessException;

/**
 * Serviço para as funcionalidades referentes a pacote.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
public interface PacoteService
{

   /**
    * Cadastra um pacote e o relacionamento entre pacote e solicitações.
    * 
    * @param pacote
    * @param solicitacoes
    * @throws BusinessException
    */
   void incluirPacote(Pacote pacote, String solicitacoes) throws BusinessException;

   /**
    * Lista os pacotes cadastrados.
    * 
    * @return {@link List<PacoteDTO>}
    */
   List<PacoteDTO> listarPacotes();

   /**
    * Recupera os dados do pacote pelo id.
    * 
    * @param codPacote
    * @return {@link Pacote}
    */
   Pacote obtemPorId(Long codPacote);
}
