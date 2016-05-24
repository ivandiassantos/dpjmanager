package la.foton.dpjmanager.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import la.foton.dpjmanager.dto.DashboardUnidadeDTO;
import la.foton.dpjmanager.dto.DetalhamentoDisciplinaDTO;
import la.foton.dpjmanager.dto.SolicitacaoDTO;
import la.foton.dpjmanager.entidades.cq.Atividade;
import la.foton.dpjmanager.entidades.cq.Projeto;
import la.foton.dpjmanager.entidades.cq.Solicitacao;
import la.foton.dpjmanager.entidades.dpjmanager.ClassificacaoAtividade;
import la.foton.dpjmanager.entidades.dpjmanager.Disciplina;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;
import la.foton.dpjmanager.service.AtividadeService;
import la.foton.dpjmanager.service.ClassificacaoAtividadeService;
import la.foton.dpjmanager.service.DashboardUnidadeService;
import la.foton.dpjmanager.service.DefeitoService;
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

   @Autowired
   private AtividadeService atividadeService;

   @Autowired
   private ClassificacaoAtividadeService classificacaoAtividadeService;

   @Autowired
   private DefeitoService defeitoService;

   @Override
   public List<DashboardUnidadeDTO> obtemDashboardUnidade()
   {
      List<DashboardUnidadeDTO> listaDashboardUnidade = new ArrayList<>();
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
         SolicitacaoDTO solicitacaoDTO = new SolicitacaoDTO();
         solicitacaoDTO.setIdSolicitacao(solicitacao.getIdSolicitacao());
         solicitacaoDTO.setDescricaoSolicitacao(solicitacao.getDescricaoSolicitacao());
         List<Projeto> listaProjetos = projetoService.listaPorIdSolicitacao(solicitacao.getIdSolicitacao());
         solicitacaoDTO.setProjetosEnvolvidos(listaProjetos);
         listaSolicitacoes.add(solicitacaoDTO);
      }
      return listaSolicitacoes;
   }

   @Override
   public List<DetalhamentoDisciplinaDTO> obtemDetalhamentoPorProjetoSolicitacao(Long codProjeto, String idSolicitacao)
   {
      List<DetalhamentoDisciplinaDTO> listaDetalhamentoDisciplina = new ArrayList<>();
      List<ClassificacaoAtividade> listaClassificacaoAtividade = classificacaoAtividadeService.listaClassificacaoAtividade();
      List<Atividade> listaAtividades = atividadeService.obtemPorProjetoSolicitacao(codProjeto, idSolicitacao);
      Map<Disciplina, List<Atividade>> mapa = new HashMap<>();
      for (Atividade atividade : listaAtividades)
      {
         for (ClassificacaoAtividade classificacaoAtividade : listaClassificacaoAtividade)
         {
            if (atividade.getTipoAtividade().contains(classificacaoAtividade.getDescricaoAtividade())
               || atividade.getSubTipoAtividade().contains(classificacaoAtividade.getDescricaoAtividade()))
            {
               if (mapa.containsKey(classificacaoAtividade.getDisciplina()))
               {
                  mapa.get(classificacaoAtividade.getDisciplina()).add(atividade);
               }
               else
               {
                  List<Atividade> atividades = new ArrayList<>();
                  atividades.add(atividade);
                  mapa.put(classificacaoAtividade.getDisciplina(), atividades);
               }
               break;
            }
         }
      }
      mapa.forEach((k, v) ->
               System.out.println(k.getDescricaoDisciplina() + " = " + v.size()));

      mapa.forEach((chave, valor) ->
               preencheDadosDetalhamentoPorDisciplina(chave, valor, listaDetalhamentoDisciplina, codProjeto, idSolicitacao)
               );

      return listaDetalhamentoDisciplina;
   }

   private void preencheDadosDetalhamentoPorDisciplina(Disciplina disciplina, List<Atividade> atividades,
      List<DetalhamentoDisciplinaDTO> listaDetalhamentoDisciplina, Long codProjeto, String idSolicitacao)
   {
      DetalhamentoDisciplinaDTO detalhamentoDisciplinaDTO = new DetalhamentoDisciplinaDTO();
      detalhamentoDisciplinaDTO.setNomeDisciplina(disciplina.getDescricaoDisciplina());
      Long qtdHorasPlanejadas = 0L;
      Long qtdHorasRealizadas = 0L;
      for (Atividade atividade : atividades)
      {
         qtdHorasPlanejadas += atividade.getHorasTrabalhoPlanejadas();
         qtdHorasRealizadas += atividade.getDuracaoHorasPlanejadas();
      }
      detalhamentoDisciplinaDTO.setTotalHorasPlanejadas(qtdHorasPlanejadas.toString());
      detalhamentoDisciplinaDTO.setTotalHorasRealizadas(qtdHorasRealizadas.toString());
      detalhamentoDisciplinaDTO.setQuantidadeDefeitos(defeitoService.obtemQuantidadeDefeitosPorDisciplinaSolicitacao(codProjeto,
         disciplina.getDescricaoDisciplina(), idSolicitacao));
      detalhamentoDisciplinaDTO.setQuantidadeHorasGastasDefeitos(defeitoService
               .obtemQuantidadeHorasGastasDefeitoPorProjetoDisciplinaSolicitacao(codProjeto, disciplina.getDescricaoDisciplina(),
                  idSolicitacao));
      listaDetalhamentoDisciplina.add(detalhamentoDisciplinaDTO);
   }

}
