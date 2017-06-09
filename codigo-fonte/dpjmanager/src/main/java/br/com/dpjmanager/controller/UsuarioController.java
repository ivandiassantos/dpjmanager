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
import br.com.dpjmanager.constantes.UrlRetorno;
import br.com.dpjmanager.enums.ChaveMensagem;
import br.com.dpjmanager.enums.PaginaRetorno;
import br.com.dpjmanager.exception.BusinessException;
import br.com.dpjmanager.service.UsuarioService;
import br.com.dpjmanager.util.MensagemUtil;

/**
 * Controladora responsável pelas funcionalidades referentes aos usuários.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = UrlRetorno.URL_PADRAO_FUNCIONALIDADES_USUARIOS)
public class UsuarioController
{
   private static final Logger logger = Logger.getLogger(UsuarioController.class);
   
   @Autowired
   private UsuarioService usuarioService;

   @Autowired
   private MensagemUtil mensagemUtil;

   /**
    * Altera a senha de acesso de um usuário.
    * 
    * @param login
    * @param senhaAtual
    * @param novaSenha
    * @param confirmacaoNovaSenha
    * @param redirectAttributes
    * @param locale
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = UrlRetorno.URL_ALTERACAO_SENHA_ACESSO, method = RequestMethod.POST)
   public ModelAndView alterarSenhaAcesso(@RequestParam(name = "login") String login,
      @RequestParam(name = "senhaAtual") String senhaAtual, @RequestParam(name = "novaSenha") String novaSenha, @RequestParam(
               name = "confirmacaoNovaSenha") String confirmacaoNovaSenha,
      RedirectAttributes redirectAttributes, Locale locale)
   {
      ModelAndView retorno = new ModelAndView();
      try
      {
         usuarioService.alterarSenhaPrimeiroAcessoUsuario(login, senhaAtual, novaSenha, confirmacaoNovaSenha);
         mensagemUtil.adicionarMensagemSucesso(redirectAttributes, locale,
            ChaveMensagem.SUCESSO_SENHA_PRIMEIRO_ACESSO_ALTERADA_SUCESSO.getChave(),
            new Object[]{});
         retorno.setViewName(PaginaRetorno.REDIRECT_URL_LOGIN.getUrl());
      }
      catch (BusinessException e)
      {
         retorno.setViewName(UrlRetorno.REDIRECT_PAGINA_INICIAR_ALTERACAO_SENHA_PRIMEIRO_ACESSO);
         mensagemUtil.adicionarMensagemErro(redirectAttributes, locale, e.getCodigoErro(), new Object[]{});
         logger.error(e.getMessage(), e);
      }
      return retorno;
   }

   /**
    * Redireciona para a página de alteração de senha no primeiro acesso.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = UrlRetorno.URL_INICIAR_ALTERACAO_SENHA_ACESSO, method = RequestMethod.GET)
   public ModelAndView iniciarAlteracaoSenhaPrimeiroAcesso()
   {
      return new ModelAndView(PaginaRetorno.PAGINA_ALTERACAO_SENHA_PRIMEIRO_ACESSO.getUrl());
   }
}
