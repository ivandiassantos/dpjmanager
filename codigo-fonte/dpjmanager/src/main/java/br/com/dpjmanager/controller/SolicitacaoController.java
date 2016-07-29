
package br.com.dpjmanager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import br.com.dpjmanager.entidades.cq.Solicitacao;
import br.com.dpjmanager.service.SolicitacaoService;

@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping("/solicitacao")
public class SolicitacaoController
{

   @Autowired
   private SolicitacaoService solicitacaoService;

   @RequestMapping(value = "/listaSolicitacoesPorNome", method = RequestMethod.GET)
   public @ResponseBody List<Solicitacao> listaSolicitacoesPorNome(@RequestParam("nomeSolicitacao") String nomeSolicitacao,
      @RequestParam("solicitacoes") String solicitacoes)
   {
      List<Solicitacao> listaSolicitacoes = solicitacaoService.listaSolicitacaoPorNome(nomeSolicitacao, solicitacoes);
      return listaSolicitacoes;
   }
}
