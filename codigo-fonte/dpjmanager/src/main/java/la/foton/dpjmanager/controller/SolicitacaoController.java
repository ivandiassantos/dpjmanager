
package la.foton.dpjmanager.controller;

import la.foton.dpjmanager.service.AtividadeService;

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
@RequestMapping("/solicitacao")
public class SolicitacaoController
{
   @Autowired
   private AtividadeService atividadeService;
   
   @RequestMapping(value = "/listarSolicitacoesPorProjeto/{codProjeto}", method = RequestMethod.GET)
   public ModelAndView listarSolicitacoesPorCliente(@PathVariable("codProjeto") Long codProjeto)
   {
      ModelAndView retorno = new ModelAndView("restrito/solicitacoes");
      retorno.addObject("listaSolicitacoes", atividadeService.listaSolicitacoesPorProjeto(codProjeto));
      return retorno;
   }
}
