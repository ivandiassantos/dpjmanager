
package br.com.dpjmanager.constantes;

/**
 * Contém as url's d retorno para utilização nas controladoras.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
public class UrlRetorno
{

   public static final String PAGINA_LOGIN = "/login";
   public static final String REDIRECT_URL_LOGIN = "redirect:" + PAGINA_LOGIN;
   public static final String URL_PRINCIPAL = "/restrito/principal";
   public static final String REDIRECT_URL_PRINCIPAL = "redirect:" + URL_PRINCIPAL;
   public static final String REDIRECT_PAGINA_ALTERACAO_SENHA_PRIMEIRO_ACESSO =
      "redirect:/restrito/usuarios/iniciaAlteracaoSenhaPrimeiroAcesso";
   public static final String URL_PADRAO_MANUTENCAO_USUARIOS = "/restrito/usuarios";
   public static final String PAGINA_ALTERACAO_SENHA_PRIMEIRO_ACESSO = URL_PADRAO_MANUTENCAO_USUARIOS + "/alteraSenhaPrimeiroAcesso";
   public static final String URL_INICIO_ALTERACAO_SENHA_PRIMEIRO_ACESSO = "/iniciaAlteracaoSenhaPrimeiroAcesso";
   public static final String ALTERAR_SENHA_ACESSO = "/alterarSenhaAcesso";
   public static final String URL_PADRAO_OCORRENCIAS = "/restrito/ocorrencias";
   public static final String URL_LISTAGEM_OCORRENCIAS_HOMOLOGACAO = "/homologacao/listaOcorrenciasHomologacao";
   public static final String PAGINA_LISTAGEM_OCORRENCIAS_HOMOLOGACAO = URL_PADRAO_OCORRENCIAS
      + URL_LISTAGEM_OCORRENCIAS_HOMOLOGACAO;
}
