
package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;

/**
 * Interface para operações que envolvem persisência da entidade pacote.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
public interface PacoteDAO
{

   /**
    * Inclui um pacote.
    * 
    * @param pacote
    */
   void salvar(Pacote pacote);

   /**
    * Pesquisa o pacote de acordo com os parâmetros informados.
    * 
    * @param pacote
    * @return {@link List<Pacote>}
    */
   List<Pacote> pesquisarPacotes(Pacote pacote);

   /**
    * Lista os pacotes cadastrados.
    * 
    * @return {@link List<Pacote>}
    */
   List<Pacote> listarPacotes();

   /**
    * Verifica se existe um pacote cadastrado com o mesmo nome.
    * 
    * @param pacote
    * @return {@link Long}
    */
   Long validaNomePacote(Pacote pacote);

   /**
    * Obtém os dados do pacote pelo id.
    * 
    * @param codPacote
    * @return {@link Pacote}
    */
   Pacote obtemPorId(Long codPacote);
}
