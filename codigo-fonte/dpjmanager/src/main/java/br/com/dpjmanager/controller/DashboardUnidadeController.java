
package br.com.dpjmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import br.com.dpjmanager.constantes.UrlRetorno;
import br.com.dpjmanager.enums.PaginaRetorno;
import br.com.dpjmanager.service.DashboardUnidadeService;

/**
 * Controlador referente ao dashboard por unidade.
 * 
 * @author Janeiro/2017: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = UrlRetorno.URL_PADRAO_DASHBOARD_UNIDADE)
public class DashboardUnidadeController
{

   @Autowired
   private DashboardUnidadeService dashboardUnidadeService;

   /**
    * Inicia o dashboard por unidade.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = UrlRetorno.URL_INICIAR_DASHBORD_POR_UNIDADE, method = RequestMethod.GET)
   public ModelAndView iniciarDashboardPorUnidade()
   {
      ModelAndView retorno = new ModelAndView(PaginaRetorno.PAGINA_DASHBOARD_UNIDADE.getUrl());
      retorno.addObject("listaDashboardUnidade", dashboardUnidadeService.obtemDashbardUnidade());
      return retorno;
   }
}
