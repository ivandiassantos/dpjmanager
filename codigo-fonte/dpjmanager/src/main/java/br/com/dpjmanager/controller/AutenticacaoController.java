package br.com.dpjmanager.controller;

import java.util.Locale;
import javax.persistence.NoResultException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import br.com.dpjmanager.constantes.UrlRetorno;
import br.com.dpjmanager.entidades.dpjmanager.Usuario;
import br.com.dpjmanager.enums.ChaveMensagem;
import br.com.dpjmanager.enums.PaginaRetorno;
import br.com.dpjmanager.util.MensagemUtil;

/**
 * Controladora responsável pela autenticação de usuários.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class AutenticacaoController
{

   @Autowired
   private AuthenticationManager authenticationManager;
   
   @Autowired
   private MensagemUtil mensagemUtil;

   private static final Logger logger = Logger.getLogger(AutenticacaoController.class);

   /**
    * Realiza a autenticação de um usuário.
    * 
    * @param login
    * @param senha
    * @param redirectAttributes
    * @param locale
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = "/autenticar", method = RequestMethod.POST)
   public ModelAndView autenticar(@RequestParam(name = "login") String login,
      @RequestParam(name = "senha") String senha, RedirectAttributes redirectAttributes, Locale locale)
   {
      ModelAndView viewRetorno = new ModelAndView();
      try
      {
         Authentication request = new UsernamePasswordAuthenticationToken(login, senha);
         Authentication result = authenticationManager.authenticate(request);
         SecurityContextHolder.getContext().setAuthentication(result);
         Usuario usuario = (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
         if (usuario.isPrimeiroAcesso())
         {
            viewRetorno.setViewName(UrlRetorno.REDIRECT_PAGINA_INICIAR_ALTERACAO_SENHA_PRIMEIRO_ACESSO);
         }
         else
         {
            viewRetorno.setViewName(PaginaRetorno.PAGINA_PRINCIPAL.getUrl());
         }
      }
      catch (DisabledException e)
      {
         mensagemUtil.adicionarMensagemErro(redirectAttributes, locale, ChaveMensagem.ERRO_LOGIN_SENHA_INVALIDOS.getChave(),
            new Object[]{});
         viewRetorno.setViewName(UrlRetorno.REDIRECT_URL_LOGIN);
         logger.error(e.getMessage(), e);
      }
      catch (BadCredentialsException e)
      {
         mensagemUtil.adicionarMensagemErro(redirectAttributes, locale, ChaveMensagem.ERRO_LOGIN_SENHA_INVALIDOS.getChave(),
            new Object[]{});
         viewRetorno.setViewName(UrlRetorno.REDIRECT_URL_LOGIN);
         logger.error(e.getMessage(), e);
      }
      catch (AuthenticationException e)
      {
         if (e.getCause() instanceof NoResultException)
         {
            mensagemUtil.adicionarMensagemErro(redirectAttributes, locale, ChaveMensagem.ERRO_LOGIN_SENHA_INVALIDOS.getChave(),
               new Object[]{});
            viewRetorno.setViewName(UrlRetorno.REDIRECT_URL_LOGIN);
         }
         logger.error(e.getMessage(), e);
      }

      return viewRetorno;
   }

}
