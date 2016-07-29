
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.dto.DashboardUnidadeDTO;
import br.com.dpjmanager.dto.DetalhamentoAtividadeDTO;
import br.com.dpjmanager.dto.DetalhamentoDisciplinaDTO;


public interface DashboardUnidadeService
{
   List<DashboardUnidadeDTO> obtemDashboardUnidade();

   List<DetalhamentoDisciplinaDTO> obtemDetalhamentoPorProjetoSolicitacao(Long codProjeto, Long codSolicitacao);

   List<DetalhamentoAtividadeDTO> obtemDetalhamentoAtividadePorProjetoDisciplinaSolicitacao(Long codProjeto, String nomeDisciplina,
      Long codSolicitacao);
}
