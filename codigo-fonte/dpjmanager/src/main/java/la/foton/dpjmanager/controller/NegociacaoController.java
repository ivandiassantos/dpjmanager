
package la.foton.dpjmanager.controller;

import java.text.ParseException;
import java.util.List;

import la.foton.dpjmanager.entidades.rhour.Negociacao;
import la.foton.dpjmanager.formularios.FormularioPesquisaNegociacao;
import la.foton.dpjmanager.service.NegociacaoService;
import la.foton.dpjmanager.util.DataUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class NegociacaoController
{

   @Autowired
   private NegociacaoService negociacaoService;

   @RequestMapping(value = "/listarNegociacoes", method = RequestMethod.POST)
   public ModelAndView listarNegociacoes(FormularioPesquisaNegociacao formularioPesquisaNegociacao)
   {
      ModelAndView retorno = new ModelAndView("/principal");
      try
      {
         List<Negociacao> listaNegociacoes = negociacaoService.listarNegociacoes(
            formularioPesquisaNegociacao.getCodigoIntegrante(),
            DataUtil.converteStringParaDate("yyyy-MM-dd", formularioPesquisaNegociacao.getDataInicio()),
               DataUtil.converteStringParaDate("yyyy-MM-dd", formularioPesquisaNegociacao.getDataFinal()));
         retorno.addObject("listaNegociacoes", listaNegociacoes);
      }
      catch (ParseException e)
      {
         e.printStackTrace();
      }
      return retorno;
   }
}
