
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
import br.com.dpjmanager.entidades.cq.Solicitacao;
import br.com.dpjmanager.service.SolicitacaoService;

/**
 * Controladora referente as funcionalidades relacionadas a solicitação.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(UrlRetorno.URL_PADRAO_SOLICITACOES)
public class SolicitacaoController
{

   @Autowired
   private SolicitacaoService solicitacaoService;

   /**
    * Lista as solicitações por nome.
    * 
    * @param nomeSolicitacao
    * @param solicitacoes
    * @return {@link ResponseBody}
    */
   @RequestMapping(value = UrlRetorno.URL_LISTA_SOLICITACOES_POR_NOME, method = RequestMethod.GET)
   @ResponseBody
   public List<Solicitacao> listaSolicitacoesPorNome(@RequestParam("nomeSolicitacao") String nomeSolicitacao,
      @RequestParam("solicitacoes") String solicitacoes)
   {
      return solicitacaoService.listaSolicitacaoPorNome(nomeSolicitacao, solicitacoes);
   }

   /**
    * Lista as solicitações pelo código do pacote.
    * 
    * @param codPacote
    * @param solicitacoes
    * @return {@link ResponseBody}
    */
   @RequestMapping(value = UrlRetorno.URL_LISTA_SOLICITACOES_POR_COD_PACOTE, method = RequestMethod.GET)
   @ResponseBody
   public List<Solicitacao> listaSolicitacoesPorCodPacote(@RequestParam("codPacote") Long codPacote)
   {
      return solicitacaoService.listaPorCodPacote(codPacote);
   }
}
