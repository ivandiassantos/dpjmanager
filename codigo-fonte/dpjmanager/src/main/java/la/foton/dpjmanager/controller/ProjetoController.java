package la.foton.dpjmanager.controller;

import java.util.List;

import la.foton.dpjmanager.entidades.rhour.Projeto;
import la.foton.dpjmanager.service.ProjetoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/projeto")
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class ProjetoController {
	@Autowired
	private ProjetoService projetoService;
	
	@RequestMapping(value = "/listarProjetosPorCliente/{codCliente}", method = RequestMethod.GET)
	public ModelAndView listarProjetosPorCliente(@PathVariable("codCliente")Long codCliente){
		ModelAndView retorno = new ModelAndView("/restrito/projetos");
		List<Projeto> listaProjetos =  projetoService.listaPorCliente(codCliente);
		retorno.addObject("listaProjetos", listaProjetos);
	   return retorno;
	}
}
