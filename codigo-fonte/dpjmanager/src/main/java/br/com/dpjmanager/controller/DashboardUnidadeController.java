
package br.com.dpjmanager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import br.com.dpjmanager.dto.DashboardUnidadeDTO;
import br.com.dpjmanager.dto.DetalhamentoAtividadeDTO;
import br.com.dpjmanager.dto.DetalhamentoDisciplinaDTO;
import br.com.dpjmanager.enums.URLRetorno;
import br.com.dpjmanager.service.DashboardUnidadeService;

/**
 * Controlador para o Dashboard por Unidade.
 * 
 * @author Maio/2016: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = DashboardUnidadeController.URL_PADRAO_DASHBOARD_UNIDADE)
public class DashboardUnidadeController
{

   public static final String URL_PADRAO_DASHBOARD_UNIDADE = "/restrito/dashboardUnidade";
   private static final String URL_INICIO_DASHBOARD_UNIDADE = "/iniciarDashboardUnidade";

   @Autowired
   private DashboardUnidadeService dashboardUnidadeService;

   /**
    * Inicia e redireciona para o Dashboard principal por unidade.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = URL_INICIO_DASHBOARD_UNIDADE, method = RequestMethod.GET)
   public ModelAndView iniciarDashboardUnidade()
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.DASHBOARD_POR_UNIDADE.getUrl());
      List<DashboardUnidadeDTO> listaDashboardUnidade = dashboardUnidadeService.obtemDashboardUnidade();
      retorno.addObject("listaDashboardUnidade", listaDashboardUnidade);
      return retorno;
   }

   @RequestMapping(value = "/obtemDashboardPorProjetoSolicitacao/{codProjeto}/{codSolicitacao}", method = RequestMethod.GET)
   public ModelAndView obtemDashboardPorProjetoSolicitacao(@PathVariable("codProjeto") Long codProjeto,
      @PathVariable("codSolicitacao") Long codSolicitacao)
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.DETALHAMENTO_ATIVIDADES_POR_PROJETO_SOLICITACAO.getUrl());
      List<DetalhamentoDisciplinaDTO> listaDetalhamentoDisciplina =
         dashboardUnidadeService.obtemDetalhamentoPorProjetoSolicitacao(codProjeto, codSolicitacao);
      retorno.addObject("listaDetalhamentoDisciplina", listaDetalhamentoDisciplina);
      retorno.addObject("codProjeto", codProjeto);
      retorno.addObject("codSolicitacao", codSolicitacao);
      return retorno;
   }

   @RequestMapping(value = "/obtemDetalhamentoDisciplinaPorProjetoSolicitacao", method = RequestMethod.GET)
   public @ResponseBody List<DetalhamentoDisciplinaDTO> obtemDetalhamentoDisciplinaPorProjetoSolicitacao(
      @RequestParam("codProjeto") Long codProjeto,
      @RequestParam("codSolicitacao") Long codSolicitacao)
   {
      List<DetalhamentoDisciplinaDTO> listaDetalhamentoDisciplina =
         dashboardUnidadeService.obtemDetalhamentoPorProjetoSolicitacao(codProjeto, codSolicitacao);
      return listaDetalhamentoDisciplina;
   }

   @RequestMapping(value = "/obtemAtividadesPorProjetoDisciplinaSolicitacao", method = RequestMethod.GET)
   public @ResponseBody List<DetalhamentoAtividadeDTO> obtemAtividadesPorProjetoDisciplinaSolicitacao(
      @RequestParam("codProjeto") Long codProjeto, @RequestParam("nomeDisciplina") String nomeDisciplina,
      @RequestParam("codSolicitacao") Long codSolicitacao)
   {
      List<DetalhamentoAtividadeDTO> listaDetalhamentoAtividade =
         dashboardUnidadeService.obtemDetalhamentoAtividadePorProjetoDisciplinaSolicitacao(codProjeto, nomeDisciplina, codSolicitacao);
      return listaDetalhamentoAtividade;
   }

   @RequestMapping(value = "/obtemDetalhamentoAtividadesPorProjetoDisciplinaSolicitacao", method = RequestMethod.GET)
   public ModelAndView obtemDetalhamentoAtividadesPorProjetoDisciplinaSolicitacao(@RequestParam("codProjeto") Long codProjeto,
      @RequestParam("nomeDisciplina") String nomeDisciplina, @RequestParam("codSolicitacao") Long codSolicitacao)
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.DETALHAMENTO_ATIVIDADES_POR_PROJETO_DISCIPLINA_SOLICITACAO.getUrl());
      List<DetalhamentoAtividadeDTO> listaDetalhamentoAtividades =
         dashboardUnidadeService.obtemDetalhamentoAtividadePorProjetoDisciplinaSolicitacao(codProjeto, nomeDisciplina, codSolicitacao);
      retorno.addObject("listaDetalhamentoAtividades", listaDetalhamentoAtividades);
      return retorno;
   }
}