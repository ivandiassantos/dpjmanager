
package la.foton.dpjmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import la.foton.dpjmanager.service.DisciplinaService;

@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class IndexController
{
   @Autowired
   private DisciplinaService disciplinaService;
   @RequestMapping(method = RequestMethod.GET, value="/")
   public ModelAndView index()
   {
      ModelAndView retorno = new ModelAndView("/restrito/unidades");
//      retorno.addObject("listaDisciplinas", disciplinaService.listarDisciplinas());
      return retorno;
   }
}
