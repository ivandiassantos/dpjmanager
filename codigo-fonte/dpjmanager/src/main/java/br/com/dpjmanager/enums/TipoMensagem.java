
package br.com.dpjmanager.enums;

public enum TipoMensagem
{
   MENSAGEM_ERRO("mensagemErro"),
      MENSAGEM_ALERTA("mensagemAlerta"),
      MENSAGEM_SUCESSO("mensagemSucesso"),
      MENSAGEM_INFORMATIVA("mensagemInformativa");

   private TipoMensagem(String nomeTipoMensagem)
   {
      this.nomeTipoMensagem = nomeTipoMensagem;
   }

   private String nomeTipoMensagem;

   public String getNomeTipoMensagem()
   {
      return nomeTipoMensagem;
   }
}
