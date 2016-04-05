package la.foton.dpjmanager.controller;

import java.util.List;

import la.foton.dpjmanager.entidades.Disciplina;
import la.foton.dpjmanager.service.DisciplinaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping("/disciplina")
public class DisciplinaController {
	@Autowired
	private DisciplinaService disciplinaService;
	@RequestMapping("/listarDisciplinas/{codProjeto}/{codSolicitacao}")
	public ModelAndView listarDisciplinas(@PathVariable("codProjeto") Long codProjeto, @PathVariable("codSolicitacao") Long codSolicitacao){
		ModelAndView retorno = new ModelAndView("restrito/disciplinas");
		List<Disciplina> listaDisciplinas = disciplinaService.listarDisciplinas();
		retorno.addObject("listaDisciplinas", listaDisciplinas);
		return retorno;
	}
}
