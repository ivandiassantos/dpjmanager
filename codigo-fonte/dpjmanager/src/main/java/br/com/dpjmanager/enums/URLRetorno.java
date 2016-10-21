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
      REDIRECT_PAGINA_INICIAR_ALTERACAO_SENHA_PRIMEIRO_ACESSO("redirect:/restrito/usuario/iniciarAlteracaoSenhaAcesso"),
      PAGINA_ALTERACAO_SENHA_PRIMEIRO_ACESSO("restrito/usuarios/alterarSenhaPrimeiroAcesso"),
      PAGINA_PRINCIPAL("/restrito/principal"),
      INICIAR_PESQUISA_PACOTES("restrito/pacotes/pesquisarPacotes"),
      INICIAR_INCLUSAO_PACOTE("restrito/pacote/incluirPacote"),
      REDIRECT_INICIAR_PESQUISA_PACOTES("redirect:/pacote/iniciarPesquisaPacotes"),
      DETALHAR_PACOTE("restrito/pacote/detalharPacote"),
      DASHBOARD_UNIDADES("/restrito/unidades"),
      DASHBOARD_POR_UNIDADE("/restrito/unidade/dashboardUnidade"),
      DETALHAMENTO_ATIVIDADES_POR_PROJETO_SOLICITACAO("/restrito/unidade/detalhamentoAtividadesPorProjetoSolicitacao"),
      DETALHAMENTO_ATIVIDADES_POR_PROJETO_DISCIPLINA_SOLICITACAO("/restrito/unidade/detalhamentoAtividadesPorProjetoDisciplinaSolicitacao"),
      INICIAR_EDICAO_PACOTE("/restrito/pacote/editarPacote"),
      INICIAR_DASHBOARD_UNIDADE("/restrito/unidade/dashboardUnidade1"),
      INICIAR_PESQUISA_UNIDADES("/restrito/unidade/pesquisarUnidades");

   @Getter
   private String url;

}
