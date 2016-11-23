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
public enum PaginaRetorno
{
   PAGINA_AUTENTICACAO("/login"),
      PAGINA_PRINCIPAL("/restrito/principal"),
      PAGINA_PESQUISA_FATURAMENTO("/restrito/faturamentos/pesquisaFaturamento"),
      PAGINA_PESQUISA_PACOTES("/restrito/pacotes/pesquisaPacotes"),
      INICIAR_INCLUSAO_PACOTE("/restrito/pacotes/incluirPacote"),
<<<<<<< HEAD
      PAGINA_EDICAO_PACOTE("/restrito/pacotes/editarPacote"),
      INICIAR_INCLUSAO_FATURAMENTO("/restrito/faturamentos/incluirFaturamento");
   
=======
      PAGINA_EDICAO_PACOTE("/restrito/pacotes/editarPacote");

>>>>>>> branch 'master' of https://github.com/ivandiassantos/dpjmanager
   @Getter
   private String url;

}
