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
<<<<<<< HEAD
   	  PAGINA_PESQUISA_FATURAMENTO("/restrito/faturamentos/pesquisaFaturamento");
=======
      PAGINA_PESQUISA_FATURAMENTO("/restrito/faturamentos/pesquisaFaturamento"),
      PAGINA_PESQUISA_PACOTES("/restrito/pacotes/pesquisaPacotes");
>>>>>>> branch 'master' of https://github.com/ivandiassantos/dpjmanager

   @Getter
   private String url;

}
