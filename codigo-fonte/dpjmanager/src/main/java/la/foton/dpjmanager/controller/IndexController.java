
package la.foton.dpjmanager.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import la.foton.dpjmanager.enums.URLRetorno;

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
    * Redireciona para a página principal do sistema.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(method = RequestMethod.GET, value = "/")
   public ModelAndView index()
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.DASHBOARD_UNIDADES.getUrl());
      return retorno;
   }
}
