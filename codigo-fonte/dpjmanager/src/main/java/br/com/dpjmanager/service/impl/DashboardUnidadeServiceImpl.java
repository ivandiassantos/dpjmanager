
package br.com.dpjmanager.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dto.DashboardUnidadeDTO;
import br.com.dpjmanager.dto.DetalhamentoAtividadeDTO;
import br.com.dpjmanager.dto.DetalhamentoDisciplinaDTO;
import br.com.dpjmanager.dto.ProjetoDTO;
import br.com.dpjmanager.dto.SolicitacaoDTO;
import br.com.dpjmanager.entidades.dpjmanager.ClassificacaoAtividade;
import br.com.dpjmanager.entidades.dpjmanager.Disciplina;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.entidades.rhour.Atividade;
import br.com.dpjmanager.entidades.rhour.Negociacao;
import br.com.dpjmanager.service.AtividadeService;
import br.com.dpjmanager.service.ClassificacaoAtividadeService;
import br.com.dpjmanager.service.DashboardUnidadeService;
import br.com.dpjmanager.service.DefeitoService;
import br.com.dpjmanager.service.NegociacaoService;
import br.com.dpjmanager.service.PacoteService;
import br.com.dpjmanager.service.ProjetoService;
import br.com.dpjmanager.service.SolicitacaoService;

@Service("dashboardUnidadeService")
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

   @Autowired
   private NegociacaoService negociacaoService;

   @Override
   public List<DashboardUnidadeDTO> obtemDashboardUnidade()
   {
      List<DashboardUnidadeDTO> listaDashboardUnidade = new ArrayList<>();
      List<Pacote> listaPacotes = pacoteService.listarPacotes();
      for (Pacote pacote : listaPacotes)
      {
         List<SolicitacaoDTO> listaSolicitacoes = criarListaSolicitacoes(pacote);
         listaDashboardUnidade.add(new DashboardUnidadeDTO(pacote.getNomePacote(), pacote.getDataInicio(), pacote
                  .getDataFinal(), listaSolicitacoes));
      }
      return listaDashboardUnidade;
   }


   private List<SolicitacaoDTO> criarListaSolicitacoes(Pacote pacote)
   {
      List<SolicitacaoDTO> listaSolicitacoes = new ArrayList<>();
      List<Atividade> atividades = solicitacaoService.listaPorPacote(pacote);
      for (Atividade atividade : atividades)
      {
         SolicitacaoDTO solicitacaoDTO = new SolicitacaoDTO();
         solicitacaoDTO.setCodSolicitacao(atividade.getCodAtividade());
         solicitacaoDTO.setDescricaoSolicitacao(atividade.getDescricaoAtividade());
         List<ProjetoDTO> listaProjetos = projetoService.listaPorIdSolicitacao(atividade.getDescricaoAtividade());
         // for (ProjetoDTO projetoDTO : listaProjetos)
         // {
         // List<DetalhamentoDisciplinaDTO> listaDisciplinas =
         // obtemDetalhamentoPorProjetoSolicitacao(projetoDTO.getCodProjeto(), atividade.getCodAtividade());
         // projetoDTO.setListaDisciplinas(listaDisciplinas);
         //
         // }
         solicitacaoDTO.setProjetosEnvolvidos(listaProjetos);
         listaSolicitacoes.add(solicitacaoDTO);
      }
      return listaSolicitacoes;
   }

   @Override
   public List<DetalhamentoDisciplinaDTO> obtemDetalhamentoPorProjetoSolicitacao(Long codProjeto, Long codSolicitacao)
   {
      List<DetalhamentoDisciplinaDTO> listaDetalhamentoDisciplina = new ArrayList<>();
      List<Negociacao> listaNegociacoes = negociacaoService.obtemPorSolicitacaoProjeto(codSolicitacao, codProjeto);
      List<ClassificacaoAtividade> listaClassificacaoAtividade = classificacaoAtividadeService.listaClassificacaoAtividade();
      Map<Disciplina, List<Negociacao>> mapa = new HashMap<>();
      for (Negociacao negociacao : listaNegociacoes)
      {
         for (ClassificacaoAtividade classificacaoAtividade : listaClassificacaoAtividade)
         {
            if (negociacao.getAtividade().getNomeAtividade().contains(classificacaoAtividade.getDescricaoAtividade())
               || negociacao.getAtividade().getDescricaoAtividade().contains(classificacaoAtividade.getDescricaoAtividade()))
            {
               if (mapa.containsKey(classificacaoAtividade.getDisciplina()))
               {
                  mapa.get(classificacaoAtividade.getDisciplina()).add(negociacao);
               }
               else
               {
                  List<Negociacao> negociacoes = new ArrayList<>();
                  negociacoes.add(negociacao);
                  mapa.put(classificacaoAtividade.getDisciplina(), negociacoes);
               }
               break;
            }
         }
      }

      mapa.forEach((chave, valor) ->
               preencheDadosDetalhamentoPorDisciplina(chave, valor, listaDetalhamentoDisciplina, codProjeto, codSolicitacao)
               );

      return listaDetalhamentoDisciplina;
   }

   private void preencheDadosDetalhamentoPorDisciplina(Disciplina disciplina, List<Negociacao> negociacoes,
      List<DetalhamentoDisciplinaDTO> listaDetalhamentoDisciplina, Long codProjeto, Long idSolicitacao)
   {
      DetalhamentoDisciplinaDTO detalhamentoDisciplinaDTO = new DetalhamentoDisciplinaDTO();
      detalhamentoDisciplinaDTO.setNomeDisciplina(disciplina.getDescricaoDisciplina());
      Long qtdHorasPlanejadas = 0L;
      Long qtdHorasRealizadas = 0L;
      for (Negociacao negociacao : negociacoes)
      {
         qtdHorasPlanejadas += negociacao.getTotalHorasPrevistas();
         qtdHorasRealizadas += negociacao.getTotalHorasAlocadas();
      }
      detalhamentoDisciplinaDTO.setTotalHorasPlanejadas(qtdHorasPlanejadas.toString());
      detalhamentoDisciplinaDTO.setTotalHorasRealizadas(qtdHorasRealizadas.toString());
      Atividade atividade = atividadeService.obtemAtividadePorId(idSolicitacao);
      detalhamentoDisciplinaDTO.setQuantidadeDefeitos(defeitoService.obtemQuantidadeDefeitosPorDisciplinaSolicitacao(
         disciplina.getDescricaoDisciplina(), StringUtils.substring(atividade.getDescricaoAtividade(), 0, 11)));
      detalhamentoDisciplinaDTO.setQuantidadeHorasGastasDefeitos(defeitoService
               .obtemQuantidadeHorasGastasDefeitoPorProjetoDisciplinaSolicitacao(atividade.getDescricaoAtividade(),
                  StringUtils.substring(atividade.getDescricaoAtividade(), 0, 11)));
      listaDetalhamentoDisciplina.add(detalhamentoDisciplinaDTO);
   }

   @Override
   public List<DetalhamentoAtividadeDTO> obtemDetalhamentoAtividadePorProjetoDisciplinaSolicitacao(Long codProjeto, String nomeDisciplina,
      Long codSolicitacao)
   {
      List<DetalhamentoAtividadeDTO> listaDetalhamentoAtividades = new ArrayList<>();
      List<Negociacao> negociacoes = negociacaoService.obtemPorSolicitacaoProjetoDisciplina(codProjeto, codSolicitacao, nomeDisciplina);
      for (Negociacao negociacao : negociacoes)
      {
         DetalhamentoAtividadeDTO detalhamentoAtividadeDTO = new DetalhamentoAtividadeDTO();
         detalhamentoAtividadeDTO.setNomeExecutor(negociacao.getIntegrante().getNomeIntegrante());
         detalhamentoAtividadeDTO.setNomeAtividade(negociacao.getAtividade().getDescricaoAtividade());
         detalhamentoAtividadeDTO.setDataFim(negociacao.getDataFechamento());
         detalhamentoAtividadeDTO.setDataInicio(negociacao.getDataNegociacao());
         detalhamentoAtividadeDTO.setQuantidadeHoras(negociacao.getTotalHorasAlocadas());
         listaDetalhamentoAtividades.add(detalhamentoAtividadeDTO);
      }
      return listaDetalhamentoAtividades;
   }

}
