package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.Fase;

/**
 * Classe de serviço para as funcionalidades referentes a fase.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
public interface FaseService
{

   /**
    * Lista os faturamentos cadastrados.
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
