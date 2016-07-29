package br.com.dpjmanager.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import br.com.dpjmanager.enums.URLRetorno;

@Controller
@RequestMapping("/restrito")
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class PrincipalController
{

   @RequestMapping(value = "/principal", method = RequestMethod.GET)
   public ModelAndView principal()
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.PAGINA_PRINCIPAL.getUrl());
      return retorno;
   }
}
