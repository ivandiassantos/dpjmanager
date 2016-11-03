package br.com.dpjmanager.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import br.com.dpjmanager.enums.URLRetorno;

/**
 * Classe para controle de fluxo para a página principal.
 * 
 * @author Outubro/2016: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class PrincipalController
{

   public static final String URL_RETORNO_PAGINA_PRINCIPAL = "/restrito/principal";
   
   /**
    * Retorna para a página principal.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = URL_RETORNO_PAGINA_PRINCIPAL, method = RequestMethod.GET)
   public ModelAndView principal()
   {
      return new ModelAndView(URLRetorno.PAGINA_PRINCIPAL.getUrl());
   }
}
