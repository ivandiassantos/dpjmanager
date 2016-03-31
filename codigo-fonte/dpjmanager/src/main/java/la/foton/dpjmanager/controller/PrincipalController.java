package la.foton.dpjmanager.controller;

import la.foton.dpjmanager.service.NegociacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class PrincipalController {
	@Autowired
	private NegociacaoService negociacaoService;
	
	@RequestMapping(value = "/principal", method = RequestMethod.GET)
	public ModelAndView principal(){
		ModelAndView retorno = new ModelAndView("/principal");
//		retorno.addObject("listaNegociacoes", negociacaoService.listarNegociacoes());
		return retorno;
	}
}
