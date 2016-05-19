/*
 * Criação : 11/04/2016
 */

package la.foton.dpjmanager.controller;

import java.util.List;
import java.util.Locale;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import la.foton.dpjmanager.entidades.cq.Solicitacao;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;
import la.foton.dpjmanager.enums.ChaveMensagem;
import la.foton.dpjmanager.enums.URLRetorno;
import la.foton.dpjmanager.exception.BusinessException;
import la.foton.dpjmanager.service.PacoteService;
import la.foton.dpjmanager.service.SolicitacaoService;
import la.foton.dpjmanager.util.MensagemUtil;

/**
 * Controlador das funcionalidades referentes a Pacote.
 * 
 * @author Abril/2016: Ivan Dias <DD>
 */
@Controller
@RequestMapping("/pacote")
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class PacoteController
{

   private static Logger logger = Logger.getLogger(PacoteController.class);
   @Autowired
   private PacoteService pacoteService;

   @Autowired
   private MensagemUtil mensagemUtil;

   @Autowired
   private SolicitacaoService solicitacaoService;

   /**
    * Redireciona para a página de pesquisa de pacotes.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = "/iniciarPesquisaPacotes", method = RequestMethod.GET)
   public ModelAndView iniciarPesquisaPacotes()
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.INICIAR_PESQUISA_PACOTES.getUrl());
      List<Pacote> listaPacotes = pacoteService.listarPacotes();
      retorno.addObject("listaPacotes", listaPacotes);
      return retorno;
   }

   /**
    * Redireciona para a página de inclusão de pacote.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = "/iniciarInclusaoPacote", method = RequestMethod.GET)
   public ModelAndView iniciarInclusaoPacote(Pacote pacote)
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.INICIAR_INCLUSAO_PACOTE.getUrl());
      return retorno;
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
   @RequestMapping(value = "/cadastrarPacote", method = RequestMethod.POST)
   public ModelAndView cadastrarPacote(Pacote pacote, @RequestParam("solicitacoes") String solicitacoes,
      RedirectAttributes redirectAttributes, Locale locale)
   {
      try
      {
         ModelAndView retorno = new ModelAndView(URLRetorno.REDIRECT_INICIAR_PESQUISA_PACOTES.getUrl());
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
    * Detalha o pacote cadastrado.
    * 
    * @param codPacote
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = "/detalharPacote/{codPacote}", method = RequestMethod.GET)
   public ModelAndView detalharPacote(@PathVariable("codPacote") Long codPacote)
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.DETALHAR_PACOTE.getUrl());
      Pacote pacote = pacoteService.obtemPacotePorCodigoPacote(codPacote);
      List<Solicitacao> listaSolicitacoes = solicitacaoService.listaPorPacote(pacote);
      retorno.addObject("pacote", pacote);
      retorno.addObject("listaSolicitacoes", listaSolicitacoes);
      return retorno;
   }

   @RequestMapping(value = "/iniciarEdicaoPacote/{codPacote}", method = RequestMethod.GET)
   public ModelAndView iniciarEdicaoPacote(@PathVariable("codPacote") Long codPacote)
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.INICIAR_EDICAO_PACOTE.getUrl());
      Pacote pacote = pacoteService.obtemPacotePorCodigoPacote(codPacote);
      List<Solicitacao> listaSolicitacoes = solicitacaoService.listaPorPacote(pacote);
      retorno.addObject("pacote", pacote);
      retorno.addObject("listaSolicitacoes", listaSolicitacoes);
      return retorno;
   }
}
