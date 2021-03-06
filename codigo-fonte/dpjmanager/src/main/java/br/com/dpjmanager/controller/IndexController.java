
package br.com.dpjmanager.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import br.com.dpjmanager.constantes.UrlRetorno;

/**
 * Controlador para a url raiz do sistema.
 * 
 * @author Maio/2016: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class IndexController
{

   /**
    * Redireciona para a página de login do sistema.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(method = RequestMethod.GET, value = "/")
   public ModelAndView index()
   {
      return new ModelAndView(UrlRetorno.REDIRECT_URL_LOGIN);
   }
}
