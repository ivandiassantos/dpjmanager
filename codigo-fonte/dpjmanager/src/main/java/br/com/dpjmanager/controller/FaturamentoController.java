package br.com.dpjmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

<<<<<<< HEAD
import br.com.dpjmanager.constantes.UrlRetorno;
import br.com.dpjmanager.enums.PaginaRetorno;
import br.com.dpjmanager.service.PacoteService;
=======
import br.com.dpjmanager.enums.PaginaRetorno;
>>>>>>> branch 'master' of https://github.com/ivandiassantos/dpjmanager


@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(UrlRetorno.URL_PADRAO_FATURAMENTO)
public class FaturamentoController {
	
	
	@Autowired
	private PacoteService PacoteService;
	
	@RequestMapping(value = "/iniciarPesquisaFaturamento", method=RequestMethod.GET)
	public ModelAndView iniciarPesquisaFaturamento(){
		
		
		return new ModelAndView(PaginaRetorno.PAGINA_PESQUISA_FATURAMENTO.getUrl());
		
		
	}
	
	@RequestMapping(value = UrlRetorno.URL_INICIAR_INCLUSAO_FATURAMENTO, method=RequestMethod.GET)
	public ModelAndView iniciarInclusaoFaturamento(){
		
		ModelAndView retorno = new ModelAndView(PaginaRetorno.INICIAR_INCLUSAO_FATURAMENTO.getUrl());
		retorno.addObject("listaPacotes", PacoteService.listarPacotes());
		
		return retorno;
		
		
	}
	
}
