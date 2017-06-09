
package br.com.dpjmanager.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dto.DashboardUnidadeDTO;
import br.com.dpjmanager.dto.PacoteDTO;
import br.com.dpjmanager.service.DashboardUnidadeService;
import br.com.dpjmanager.service.PacoteService;

/**
 * Serviço para montagem do dashboard por unidade.
 * 
 * @author Janeiro/2017: Ivan Dias <DD>
 */
@Service("dashboardUnidadeService")
public class DashboardUnidadeServiceImpl implements DashboardUnidadeService
{

   @Autowired
   private PacoteService pacoteService;

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.DashboardUnidadeService#obtemDashbardUnidade()
    */
   @Override
   public List<DashboardUnidadeDTO> obtemDashbardUnidade()
   {
      List<DashboardUnidadeDTO> dashboardUnidade = new ArrayList<>();
      List<PacoteDTO> pacotes = pacoteService.listarPacotes();
      for (PacoteDTO pacoteDTO : pacotes)
      {
         DashboardUnidadeDTO dashboardUnidadeDTO = new DashboardUnidadeDTO();
         dashboardUnidadeDTO.setPacoteDTO(pacoteDTO);
         dashboardUnidade.add(dashboardUnidadeDTO);
      }
      return dashboardUnidade;
   }
}
