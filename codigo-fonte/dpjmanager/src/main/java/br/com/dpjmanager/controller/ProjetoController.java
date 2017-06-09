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
import br.com.dpjmanager.constantes.UrlRetorno;
import br.com.dpjmanager.entidades.cq.ProjetoCQ;
import br.com.dpjmanager.service.ProjetoCQService;

/**
 * Controladora para funcionalidades referentes a projetos.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(UrlRetorno.URL_PADRAO_PROJETOS)
public class ProjetoController
{

   @Autowired
   private ProjetoCQService projetoCQService;
   
   /**
    * Retorna os projetos por solicitação
    * 
    * @return {@link List<Projeto>}
    * @param numeroSolicitacao
    */
   @ResponseBody
   @RequestMapping(value = UrlRetorno.URL_CONSULTA_PROJETOS_POR_SOLICITACAO, method = RequestMethod.GET)
   public List<ProjetoCQ> obtemProjetosPorSolicitacao(@RequestParam("numeroSolicitacao") String numeroSolicitacao)
   {
      return projetoCQService.listarPorSolicitacao(numeroSolicitacao);
   }
}
