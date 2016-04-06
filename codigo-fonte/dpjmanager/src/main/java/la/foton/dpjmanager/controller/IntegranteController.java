
package la.foton.dpjmanager.controller;

import java.util.List;

import la.foton.dpjmanager.entidades.rhour.Integrante;
import la.foton.dpjmanager.service.ClassificacaoAtividadeService;
import la.foton.dpjmanager.service.IntegranteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping("/integrante")
public class IntegranteController
{
   @Autowired
   private IntegranteService integranteService;
   
   @Autowired
   private ClassificacaoAtividadeService classificacaoAtividadeService;

   @RequestMapping(value = "/listaIntegrantesPorDisciplina/{codDisciplina}", method = RequestMethod.GET)
   public ModelAndView listarIntegrantePorDisciplina(@PathVariable("codDisciplina") Long codDisciplina)
   {
      ModelAndView retorno = new ModelAndView("principal");
      List<String> descricoesAtividades = classificacaoAtividadeService.obtemListaDescricaoAtividadePorCodigoDisciplina(codDisciplina);
      List<Integrante> integrantes = integranteService.listaPorDisciplina(descricoesAtividades);
      retorno.addObject("listaIntegrantes", integrantes);
      return retorno;
   }
}
