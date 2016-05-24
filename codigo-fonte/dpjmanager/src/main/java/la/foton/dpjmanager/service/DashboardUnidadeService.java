package la.foton.dpjmanager.service;

import java.util.List;
import la.foton.dpjmanager.dto.DashboardUnidadeDTO;
import la.foton.dpjmanager.dto.DetalhamentoDisciplinaDTO;


public interface DashboardUnidadeService
{
   List<DashboardUnidadeDTO> obtemDashboardUnidade();

   List<DetalhamentoDisciplinaDTO> obtemDetalhamentoPorProjetoSolicitacao(Long codProjeto, String idSolicitacao);
}
