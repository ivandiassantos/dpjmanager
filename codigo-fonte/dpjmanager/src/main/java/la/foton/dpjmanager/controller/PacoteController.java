/*
 * Criação : 11/04/2016
 */
package la.foton.dpjmanager.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import la.foton.dpjmanager.enums.URLRetorno;

/**
 * Controlador das funcionalidades referentes a pacotes.
 * 
 * @author Abril/2016: Ivan Dias <DD>
 */
@Controller
@RequestMapping("/pacote")
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class PacoteController
{

   /**
    * Redireciona para a página de pesquisa de pacotes.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = "/iniciarPesquisaPacotes", method = RequestMethod.GET)
   public ModelAndView iniciarPesquisaPacotes()
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.INICIAR_PESQUISA_PACOTES.getUrl());
      return retorno;
   }

   /**
    * Redireciona para a página de inclusão de pacote.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = "/iniciarInclusaoPacote", method = RequestMethod.GET)
   public ModelAndView iniciarInclusaoPacote()
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.INICIAR_INCLUSAO_PACOTE.getUrl());
      return retorno;
   }
}
