package la.foton.dpjmanager.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import la.foton.dpjmanager.dto.DashboardUnidadeDTO;
import la.foton.dpjmanager.dto.SolicitacaoDTO;
import la.foton.dpjmanager.entidades.cq.Solicitacao;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;
import la.foton.dpjmanager.service.DashboardUnidadeService;
import la.foton.dpjmanager.service.PacoteService;
import la.foton.dpjmanager.service.ProjetoService;
import la.foton.dpjmanager.service.SolicitacaoService;

@Service("bashboardUnidadeService")
public class DashboardUnidadeServiceImpl implements DashboardUnidadeService
{

   @Autowired
   private PacoteService pacoteService;

   @Autowired
   private SolicitacaoService solicitacaoService;

   @Autowired
   private ProjetoService projetoService;

   @Override
   public List<DashboardUnidadeDTO> obtemDashboardUnidade()
   {
      List<DashboardUnidadeDTO> listaDashboardUnidade = new ArrayList<DashboardUnidadeDTO>();
      List<Pacote> listaPacotes = pacoteService.listarPacotes();
      for (Pacote pacote : listaPacotes)
      {
         List<SolicitacaoDTO> listaSolicitacoes = criarListaSolicitacoes(pacote);
         listaDashboardUnidade.add(new DashboardUnidadeDTO(pacote.getNomePacote(), listaSolicitacoes));
      }
      return listaDashboardUnidade;
   }

   private List<SolicitacaoDTO> criarListaSolicitacoes(Pacote pacote)
   {
      List<SolicitacaoDTO> listaSolicitacoes = new ArrayList<>();
      List<Solicitacao> solicitacoes = solicitacaoService.listaPorPacote(pacote);
      for (Solicitacao solicitacao : solicitacoes)
      {
         projetoService.listaPorIdSolicitacao(solicitacao.getIdSolicitacao());
      }
      return listaSolicitacoes;
   }

}
