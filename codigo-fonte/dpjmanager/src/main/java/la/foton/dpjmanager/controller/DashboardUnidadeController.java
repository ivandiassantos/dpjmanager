package la.foton.dpjmanager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import la.foton.dpjmanager.dto.DashboardUnidadeDTO;
import la.foton.dpjmanager.enums.URLRetorno;
import la.foton.dpjmanager.service.DashboardUnidadeService;

/**
 * Controlador para o Dashboard por Unidade.
 * 
 * @author Maio/2016: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping("/dashboardUnidade")
public class DashboardUnidadeController
{

   @Autowired
   private DashboardUnidadeService dashboardUnidadeService;
   /**
    * Inicia e redireciona para o Dashboard principal por unidade.
    * 
    * @return {@link ModelAndView}
    */
   @RequestMapping(value = "/iniciarDashboardUnidade", method = RequestMethod.GET)
   public ModelAndView iniciarDashboardUnidade()
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.DASHBOARD_POR_UNIDADE.getUrl());
      List<DashboardUnidadeDTO> listaDashboardUnidade = dashboardUnidadeService.obtemDashboardUnidade();
      retorno.addObject("listaDashboardUnidade", listaDashboardUnidade);
      return retorno;
   }
}
