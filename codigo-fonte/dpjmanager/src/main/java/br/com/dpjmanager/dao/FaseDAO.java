package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.Fase;

/**
 * DAO para a entidade Fase.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
public interface FaseDAO
{

   /**
    * Lista as fases cadastradas.
    * 
    * @return {@link List<Fase>}
    */
   List<Fase> listar();

   /**
    * Obtém uma fase pelo id.
    * 
    * @param codFase
    * @return {@link Fase}
    */
   Fase obtemPorId(Long codFase);
}
