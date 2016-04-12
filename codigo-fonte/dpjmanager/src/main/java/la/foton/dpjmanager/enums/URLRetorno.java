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
      INICIAR_INCLUSAO_PACOTE("restrito/pacote/incluirPacote");

   @Getter
   private String url;

}
