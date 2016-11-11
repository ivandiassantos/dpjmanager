/*
 * Criação : 11/04/2016
 */

package br.com.dpjmanager.enums;

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
   PAGINA_AUTENTICACAO("/login"),
      REDIRECT_URL_LOGIN("redirect:/login"),
      PAGINA_PRINCIPAL("/restrito/principal"),
      PAGINA_PESQUISA_FATURAMENTO("/restrito/faturamentos/pesquisaFaturamento"),
      PAGINA_PESQUISA_PACOTES("/restrito/pacotes/pesquisaPacotes"),
      REDIRECT_INICIAR_PESQUISA_PACOTES("redirect:/restrito/pacotes/iniciarPesquisaPacotes"),
      INICIAR_INCLUSAO_PACOTE("restrito/pacotes/incluirPacote");

   @Getter
   private String url;

}
