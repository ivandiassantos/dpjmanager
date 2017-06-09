
package br.com.dpjmanager.controller;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import br.com.dpjmanager.constantes.UrlRetorno;
import br.com.dpjmanager.entidades.dpjmanager.Faturamento;
import br.com.dpjmanager.enums.ChaveMensagem;
import br.com.dpjmanager.enums.PaginaRetorno;
import br.com.dpjmanager.service.FaseService;
import br.com.dpjmanager.service.FaturamentoService;
import br.com.dpjmanager.service.PacoteService;
import br.com.dpjmanager.util.MensagemUtil;

/**
 * Controladora para funcionalidades referentes a faturamento.
 * 
 * @author Novembro/2016: Antônio Jousivan <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(UrlRetorno.URL_PADRAO_FATURAMENTO)
public class FaturamentoController
{

   @Autowired
   private PacoteService pacoteService;
   @Autowired
   private FaseService faseService;
   @Autowired
   private FaturamentoService faturamentoService;
   @Autowired
   private MensagemUtil mensagemUtil;

   /**
    * Inicia a pesquisa de faturamentos.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = UrlRetorno.URL_INICIAR_PESQUISA_FATURAMENTO, method = RequestMethod.GET)
   public ModelAndView iniciarPesquisaFaturamento()
   {
      ModelAndView retorno = new ModelAndView(PaginaRetorno.PAGINA_PESQUISA_FATURAMENTO.getUrl());
      retorno.addObject("listaFaturamentos", faturamentoService.listar());
      return retorno;
   }

   /**
    * Carrega os dados iniciais para inclusão de faturamento e redireciona para a página correspondente.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = UrlRetorno.URL_INICIAR_INCLUSAO_FATURAMENTO, method = RequestMethod.GET)
   public ModelAndView iniciarInclusaoFaturamento()
   {
      ModelAndView retorno = new ModelAndView(PaginaRetorno.INICIAR_INCLUSAO_FATURAMENTO.getUrl());
      retorno.addObject("listaFases", faseService.listar());
      retorno.addObject("listaPacotes", pacoteService.listarPacotes());

      return retorno;
   }

   /**
    * Inclui o faturamento
    * 
    * @param faturamento
    * @param redirectAttributes
    * @param locale
    * @param codPacote
    * @param codProjeto
    * @param codFase
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = UrlRetorno.URL_INCLUIR_FATURAMENTO, method = RequestMethod.POST)
   public ModelAndView incluirFaturamento(Faturamento faturamento, @RequestParam("codPacote") Long codPacote,
      @RequestParam("codProjeto") Long codProjeto, @RequestParam("codFase") Long codFase, RedirectAttributes redirectAttributes,
      Locale locale)
   {
      ModelAndView retorno = new ModelAndView(UrlRetorno.REDIRECT_URL_INICIAR_PESQUISA_FATURAMENTO);
      faturamentoService.incluirFaturamento(faturamento, codPacote, codProjeto, codFase);
      mensagemUtil.adicionarMensagemSucesso(redirectAttributes, locale, ChaveMensagem.SUCESSO_INCLUSAO.getChave(), "Faturamento");
      return retorno;
   }

}
