/*
 * Criação : 11/04/2016
 */

package la.foton.dpjmanager.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Contém as URL's de retorno do sistema.
 * 
 * @author Abril/2016: Ivan Dias <DD>
 */
@AllArgsConstructor
public enum URLRetorno
{
   INICIAR_PESQUISA_PACOTES("restrito/pacote/pesquisarPacotes"),
      INICIAR_INCLUSAO_PACOTE("restrito/pacote/incluirPacote"),
      REDIRECT_INICIAR_PESQUISA_PACOTES("redirect:/pacote/iniciarPesquisaPacotes"),
      DETALHAR_PACOTE("restrito/pacote/detalharPacote"),
      DASHBOARD_UNIDADES("/restrito/unidades"),
      DASHBOARD_POR_UNIDADE("/restrito/unidade/dashboardUnidade"),
      INICIAR_EDICAO_PACOTE("/restrito/pacote/editarPacote");

   @Getter
   private String url;

}
