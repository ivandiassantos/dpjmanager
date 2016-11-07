package br.com.dpjmanager.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import br.com.dpjmanager.enums.URLRetorno;

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
   public static final String URL_PADRAO_PACOTES = "/restrito/pacotes";
   private static final String URL_INICIAR_PESQUISA_PACOTES = "/iniciarPesquisaPacotes";

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
}
