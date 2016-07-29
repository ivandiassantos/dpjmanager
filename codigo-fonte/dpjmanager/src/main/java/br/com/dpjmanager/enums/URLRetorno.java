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
      PAGINA_PRINCIPAL("/restrito/principal"),
   INICIAR_PESQUISA_PACOTES("restrito/pacote/pesquisarPacotes"),
      INICIAR_INCLUSAO_PACOTE("restrito/pacote/incluirPacote"),
      REDIRECT_INICIAR_PESQUISA_PACOTES("redirect:/pacote/iniciarPesquisaPacotes"),
      DETALHAR_PACOTE("restrito/pacote/detalharPacote"),
      DASHBOARD_UNIDADES("/restrito/unidades"),
      DASHBOARD_POR_UNIDADE("/restrito/unidade/dashboardUnidade"),
      DETALHAMENTO_ATIVIDADES_POR_PROJETO_SOLICITACAO("/restrito/unidade/detalhamentoAtividadesPorProjetoSolicitacao"),
      DETALHAMENTO_ATIVIDADES_POR_PROJETO_DISCIPLINA_SOLICITACAO("/restrito/unidade/detalhamentoAtividadesPorProjetoDisciplinaSolicitacao"),
      INICIAR_EDICAO_PACOTE("/restrito/pacote/editarPacote");

   @Getter
   private String url;

}
