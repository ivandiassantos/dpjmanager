package br.com.dpjmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import br.com.dpjmanager.enums.URLRetorno;
import br.com.dpjmanager.service.UnidadeService;

@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = UnidadeController.URL_PADRAO_UNIDADE)
public class UnidadeController
{
   public static final String URL_PADRAO_UNIDADE = "/restrito/unidade";
   
   @Autowired
   private UnidadeService unidadeService;

   public ModelAndView iniciarPesquisaUnidades()
   {
      ModelAndView retorno = new ModelAndView(URLRetorno.INICIAR_PESQUISA_UNIDADES.getUrl());
      retorno.addObject("listaUnidades", unidadeService.listar());
      return retorno;
   }
}
