package br.com.dpjmanager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import br.com.dpjmanager.entidades.dpjmanager.FaturamentoProjeto;
import br.com.dpjmanager.service.FaturamentoProjetoService;

@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = DashboardController.URL_PADRAO_DASHBOARD)
public class DashboardController
{

   @Autowired
   private FaturamentoProjetoService faturamentoProjetoService;

   public static final String URL_PADRAO_DASHBOARD = "/restrito/dashboard";
   private static final String URL_LISTA_FATURAMENTO_PROJETO = "/listarFaturamentoProjeto";

   @RequestMapping(value = URL_LISTA_FATURAMENTO_PROJETO, method = RequestMethod.GET)
   public @ResponseBody List<FaturamentoProjeto> listarFaturamentoProjeto()
   {
      return faturamentoProjetoService.listar();
   }
}
