
package br.com.dpjmanager.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.log4j.Logger;
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
import br.com.dpjmanager.entidades.cq.Solicitacao;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.enums.ChaveMensagem;
import br.com.dpjmanager.enums.PaginaRetorno;
import br.com.dpjmanager.exception.BusinessException;
import br.com.dpjmanager.service.PacoteService;
import br.com.dpjmanager.service.PacoteSolicitacaoService;
import br.com.dpjmanager.service.SolicitacaoService;
import br.com.dpjmanager.util.MensagemUtil;

/**
 * Controladora responsável pelas funcionalidades referentes a pacotes.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(UrlRetorno.URL_PADRAO_PACOTES)
public class PacoteController
{

   private static Logger logger = Logger.getLogger(PacoteController.class);

   @Autowired
   private MensagemUtil mensagemUtil;

   @Autowired
   private PacoteService pacoteService;

   @Autowired
   private PacoteSolicitacaoService pacoteSolicitacaoService;

   @Autowired
   private SolicitacaoService solicitacaoService;

   /**
    * Inicia e redireciona para a página de pesquisa de pacotes.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = UrlRetorno.URL_INICIAR_PESQUISA_PACOTES, method = RequestMethod.GET)
   public ModelAndView iniciarPesquisaPacotes()
   {
      ModelAndView retorno = new ModelAndView(PaginaRetorno.PAGINA_PESQUISA_PACOTES.getUrl());
      retorno.addObject("listaPacotes", pacoteService.listarPacotes());
      return retorno;
   }

   /**
    * Redireciona para a página de inclusão de pacotes.
    * 
    * @param pacote
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = UrlRetorno.URL_INICIAR_INCLUSAO_PACOTE, method = RequestMethod.GET)
   public ModelAndView iniciarInclusaoPacote(Pacote pacote)
   {
      return new ModelAndView(PaginaRetorno.INICIAR_INCLUSAO_PACOTE.getUrl());
   }

   /**
    * Realiza o cadastro de pacotes.
    * 
    * @param pacote
    * @param solicitacoes
    * @param redirectAttributes
    * @param locale
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = UrlRetorno.URL_CADASTRA_PACOTES, method = RequestMethod.POST)
   public ModelAndView cadastrarPacote(Pacote pacote, @RequestParam("solicitacoes") String solicitacoes,
      RedirectAttributes redirectAttributes, Locale locale)
   {
      try
      {
         ModelAndView retorno = new ModelAndView(UrlRetorno.REDIRECT_INICIAR_PESQUISA_PACOTES);
         pacoteService.incluirPacote(pacote, solicitacoes);
         mensagemUtil.adicionarMensagemSucesso(redirectAttributes, locale, ChaveMensagem.SUCESSO_INCLUSAO.getChave(), "Pacote");
         return retorno;
      }
      catch (BusinessException e)
      {
         mensagemUtil.adicionarMensagemErro(redirectAttributes, locale, e.getCodigoErro(), new Object[]{});
         logger.error(e.getCodigoErro(), e);
         return iniciarInclusaoPacote(pacote);
      }
   }

   /**
    * Obtem o pacote pelo código para edição.
    * 
    * @param codPacote
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = UrlRetorno.URL_INICIAR_EDICAO_PACOTE, method = RequestMethod.GET)
   public ModelAndView iniciarEdicaoPacote(@RequestParam("codPacote") Long codPacote)
   {
      ModelAndView retorno = new ModelAndView(PaginaRetorno.PAGINA_EDICAO_PACOTE.getUrl());
      Pacote pacote = pacoteService.obtemPorId(codPacote);
      List<Solicitacao> listaSolicitacoes = solicitacaoService.listaPorCodPacote(codPacote);
      List<String> listaIdsSolicitacoes = new ArrayList<>();
      listaSolicitacoes.forEach(solicitacao -> listaIdsSolicitacoes.add(solicitacao.getIdSolicitacao()));
      retorno.addObject("solicitacoes", listaIdsSolicitacoes);
      retorno.addObject("pacote", pacote);
      retorno.addObject("listaSolicitacoes", listaSolicitacoes);
      return retorno;
   }

   /**
    * Realiza a edição do pacote cadastrado.
    * 
    * @param pacote
    * @param solicitacoes
    * @param redirectAttributes
    * @param locale
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = UrlRetorno.URL_EDITA_PACOTE, method = RequestMethod.POST)
   public ModelAndView editarPacote(Pacote pacote, @RequestParam("solicitacoes") String solicitacoes,
      RedirectAttributes redirectAttributes, Locale locale)
   {
      ModelAndView retorno = new ModelAndView();
      try
      {
         pacoteService.editarPacote(pacote, solicitacoes);
         retorno.setViewName(UrlRetorno.REDIRECT_INICIAR_PESQUISA_PACOTES);
      }
      catch (BusinessException e)
      {
         retorno.setViewName(PaginaRetorno.REDIRECT_PAGINA_EDICAO_PACOTE.getUrl());
         mensagemUtil.adicionarMensagemErro(redirectAttributes, locale, e.getCodigoErro(), new Object[]{""});
         logger.error(e.getCodigoErro(), e);
      }
      return retorno;
   }

}
