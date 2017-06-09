
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.Faturamento;

/**
 * Serviço para funcionalidades referentes a faturamento.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
public interface FaturamentoService
{

   /**
    * Inclui um faturamento.
    * 
    * @param faturamento
    * @param codFase
    * @param codProjeto
    * @param codPacote
    */
   void incluirFaturamento(Faturamento faturamento, Long codPacote, Long codProjeto, Long codFase);

   /**
    * Lista os faturamentos cadastrados.
    * 
    * @return {@link List<Faturamento>}
    */
   List<Faturamento> listar();
}
