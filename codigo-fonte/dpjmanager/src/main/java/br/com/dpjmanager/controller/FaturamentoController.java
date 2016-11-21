package br.com.dpjmanager.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import br.com.dpjmanager.enums.PaginaRetorno;


@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping("/restrito/faturamentos")
public class FaturamentoController {
	
	@RequestMapping(value = "/iniciarPesquisaFaturamento", method=RequestMethod.GET)
	public ModelAndView iniciarPesquisaFaturamento(){
		
		
		return new ModelAndView(PaginaRetorno.PAGINA_PESQUISA_FATURAMENTO.getUrl());
		
		
	}
}