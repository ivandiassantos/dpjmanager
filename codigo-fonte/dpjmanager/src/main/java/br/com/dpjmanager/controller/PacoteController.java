package br.com.dpjmanager.controller;

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
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.enums.ChaveMensagem;
import br.com.dpjmanager.enums.URLRetorno;
import br.com.dpjmanager.exception.BusinessException;
import br.com.dpjmanager.service.PacoteService;
import br.com.dpjmanager.util.MensagemUtil;

/**
 * Controladora responsável pelas funcionalidades referentes a pacotes.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(PacoteController.URL_PADRAO_PACOTES)
public class PacoteController
{

   private static Logger logger = Logger.getLogger(PacoteController.class);

   public static final String URL_PADRAO_PACOTES = "/restrito/pacotes";
   private static final String URL_INICIAR_PESQUISA_PACOTES = "/iniciarPesquisaPacotes";
   private static final String URL_CADASTRA_PACOTES = "/cadastrarPacote";

   @Autowired
   private MensagemUtil mensagemUtil;

   @Autowired
   private PacoteService pacoteService;

   /**
    * Inicia e redireciona para a página de pesquisa de pacotes.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = URL_INICIAR_PESQUISA_PACOTES, method = RequestMethod.GET)
   public ModelAndView iniciarPesquisaPacotes()
   {
      return new ModelAndView(URLRetorno.PAGINA_PESQUISA_PACOTES.getUrl());
   }

   /**
    * Redireciona para a página de inclusão de pacotes.
    * 
    * @param {@link Pacote}
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = "/iniciarInclusaoPacote", method = RequestMethod.GET)
   public ModelAndView iniciarInclusaoPacote(Pacote pacote)
   {
      return new ModelAndView(URLRetorno.INICIAR_INCLUSAO_PACOTE.getUrl());
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
   @RequestMapping(value = URL_CADASTRA_PACOTES, method = RequestMethod.POST)
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
}
