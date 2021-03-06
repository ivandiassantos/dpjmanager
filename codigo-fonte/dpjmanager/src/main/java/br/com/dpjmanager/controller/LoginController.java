
package br.com.dpjmanager.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import br.com.dpjmanager.constantes.UrlRetorno;

/**
 * Controladora responsável pelo redirecionamento para a página de login.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class LoginController
{

   /**
    * Redireciona para a página de login da aplicação conteúdo
    * 
    * @return pagina de login.
    */
   @RequestMapping(value = UrlRetorno.PAGINA_LOGIN, method = RequestMethod.GET)
   public ModelAndView login()
   {
      return new ModelAndView(UrlRetorno.PAGINA_LOGIN);
   }
}
