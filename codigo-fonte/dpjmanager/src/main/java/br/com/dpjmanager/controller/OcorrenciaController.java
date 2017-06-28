
package br.com.dpjmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import br.com.dpjmanager.constantes.UrlRetorno;
import br.com.dpjmanager.service.OcorrenciaService;

/**
 * Controladora responsável pela listagem, dashboard e associação de ocorrências a solicitação.
 * 
 * @author Junho/2017: Ivan Dias <DD>
 */
@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@RequestMapping(value = UrlRetorno.URL_PADRAO_OCORRENCIAS)
public class OcorrenciaController
{

   @Autowired
   private OcorrenciaService ocorrenciaService;

   /**
    * Lista as ocorrências de homologação cadastradas no CQ.
    * 
    * @return
    */
   @RequestMapping(value = UrlRetorno.URL_LISTAGEM_OCORRENCIAS_HOMOLOGACAO, method = RequestMethod.GET)
   public ModelAndView listaOcorrenciasHomologacao()
   {
      return new ModelAndView(UrlRetorno.PAGINA_LISTAGEM_OCORRENCIAS_HOMOLOGACAO).addObject("listaOcorrenciasHomologacao",
         ocorrenciaService.listaOcorrenciasHomologacao());
   }

   /**
    * Inicia a associação entre ocorrência e solicitação.
    * 
    * @param idOcorrencia
    * @return
    */
   @RequestMapping(value = UrlRetorno.URL_INICIO_ASSOCIACAO_OCORRENCIA_SOLICITACAO, method = RequestMethod.GET)
   public ModelAndView iniciaAssociacaoOcorrenciaHomologacao(@PathVariable("idOcorrencia") Long idOcorrencia)
   {
      return new ModelAndView();
   }
}
