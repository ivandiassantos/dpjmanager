
package la.foton.dpjmanager.enums;

public enum ChaveMensagem
{
   SUCESSO_INCLUSAO("sucesso_inclusao");

   private ChaveMensagem(String chave)
   {
      this.chave = chave;
   }

   private String chave;

   public String getChave()
   {
      return chave;
   }
}
