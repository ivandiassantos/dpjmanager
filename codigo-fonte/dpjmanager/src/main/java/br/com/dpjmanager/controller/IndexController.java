
package br.com.dpjmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import br.com.dpjmanager.enums.URLRetorno;
import br.com.dpjmanager.service.DashboardUnidadeService;

/**
 * Controlador para a url raiz do sistema.
 * 
 * @author Maio/2016: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class IndexController
{

   @Autowired
   private DashboardUnidadeService dashboardUnidadeService;
   
   /**
    * Redireciona para a página de login do sistema.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(method = RequestMethod.GET, value = "/")
   public ModelAndView index()
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.PAGINA_AUTENTICACAO.getUrl());
      // ModelAndView retorno = new ModelAndView(URLRetorno.DASHBOARD_POR_UNIDADE.getUrl());
      // List<DashboardUnidadeDTO> listaDashboardUnidade = dashboardUnidadeService.obtemDashboardUnidade();
      // retorno.addObject("listaDashboardUnidade", listaDashboardUnidade);
      return retorno;
   }
}
