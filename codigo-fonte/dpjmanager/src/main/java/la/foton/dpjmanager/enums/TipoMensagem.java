
package la.foton.dpjmanager.enums;

public enum TipoMensagem
{
   MENSAGEM_ERRO("mensagemErro"),
      MENSAGEM_ALERTA("mensagemAlerta"),
      MENSAGEM_SUCESSO("mensagemSucesso");

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
