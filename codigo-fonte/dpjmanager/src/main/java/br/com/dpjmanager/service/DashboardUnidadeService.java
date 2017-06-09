
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.dto.DashboardUnidadeDTO;

/**
 * Serviço para montagem do dashboard por unidade.
 * 
 * @author Janeiro/2017: Ivan Dias <DD>
 */
public interface DashboardUnidadeService
{

   /**
    * Obtém os dados para apresentação do dashbard da unidade.
    * 
    * @return {@link List<DashboardUnidadeDTO>}
    */
   List<DashboardUnidadeDTO> obtemDashbardUnidade();
}
