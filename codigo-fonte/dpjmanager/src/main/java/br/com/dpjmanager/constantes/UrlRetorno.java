
package br.com.dpjmanager.constantes;

/**
 * Contém as url's d retorno para utilização nas controladoras.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
public class UrlRetorno
{

   public static final String URL_PADRAO_PACOTES = "/restrito/pacotes";
   public static final String URL_PADRAO_SOLICITACOES = "/restrito/solicitacoes";
   public static final String URL_INICIAR_PESQUISA_PACOTES = "/iniciarPesquisaPacotes";
   public static final String URL_CADASTRA_PACOTES = "/cadastrarPacote";
   public static final String URL_INICIAR_INCLUSAO_PACOTE = "/iniciarInclusaoPacote";
   public static final String URL_INICIAR_EDICAO_PACOTE = "/iniciarEdicaoPacote";
   public static final String REDIRECT_INICIAR_PESQUISA_PACOTES = "redirect:/restrito/pacotes/iniciarPesquisaPacotes";
   public static final String REDIRECT_URL_LOGIN = "redirect:/login";
   public static final String URL_PADRAO_FATURAMENTO = "/restrito/faturamentos";
   public static final String URL_INICIAR_INCLUSAO_FATURAMENTO = "/iniciarInclusaoFaturamento";
   public static final String REDIRECT_PAGINA_INICIAR_ALTERACAO_SENHA_PRIMEIRO_ACESSO =
      "redirect:/restrito/usuarios/iniciarAlteracaoSenhaAcesso";
   public static final String URL_PADRAO_FUNCIONALIDADES_USUARIOS = "/restrito/usuarios";
   public static final String URL_INICIAR_ALTERACAO_SENHA_ACESSO = "/iniciarAlteracaoSenhaAcesso";
   public static final String URL_ALTERACAO_SENHA_ACESSO = "/alterarSenhaAcesso";
   public static final String URL_LISTA_SOLICITACOES_POR_NOME = "/listaSolicitacoesPorNome";
   public static final String URL_LISTA_SOLICITACOES_POR_COD_PACOTE = "/listaSolicitacoesPorCodPacote";
   public static final String URL_INICIAR_PESQUISA_FATURAMENTO = "/iniciarPesquisaFaturamento";
   public static final String REDIRECT_URL_INICIAR_PESQUISA_FATURAMENTO = "redirect:/iniciarPesquisaFaturamento";
   public static final String URL_PADRAO_PROJETOS = "/restrito/projetos";
   public static final String URL_CONSULTA_PROJETOS_POR_SOLICITACAO = "/obtemProjetosPorSolicitacao";
   public static final String URL_PADRAO_ORDENS_SERVICO = "/restrito/ordensServico";
   public static final String URL_INCLUIR_FATURAMENTO = "/incluirFaturamento";
   public static final String URL_EDITA_PACOTE = "/editarPacote";
   public static final String URL_PADRAO_DASHBOARD_UNIDADE = "/restrito/dashboardUnidade";
   public static final String URL_INICIAR_DASHBORD_POR_UNIDADE = "/iniciarDashboardPorUnidade";
}
