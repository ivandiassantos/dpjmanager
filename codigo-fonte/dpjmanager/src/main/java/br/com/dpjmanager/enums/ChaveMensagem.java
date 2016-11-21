
package br.com.dpjmanager.enums;

import lombok.Getter;

/**
 * Chaves das mensagens apresentadas ao usuário.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
public enum ChaveMensagem
{
   SUCESSO_INCLUSAO("sucesso_inclusao"),
      ERRO_LOGIN_SENHA_INVALIDOS("erro_login_e_ou_senha_invalido"),
      ERRO_NOVA_SENHA_DEVE_SER_DIFERENTE_ATUAL("erro_nova_senha_deve_ser_diferente_atual"),
      SUCESSO_SENHA_PRIMEIRO_ACESSO_ALTERADA_SUCESSO("sucesso_senha_primeiro_acesso_alterada_sucesso"),
      ERRO_NOVA_SENHA_E_SUA_CONFIRMACAO_DEVEM_SER_IGUAIS("erro_nova_senha_e_sua_confirmacao_devem_ser_iguais"),
      ERRO_LOGIN_INVALIDO("erro_login_invalido"),
      ERRO_SENHA_ATUAL_NAO_CONFERE("erro_senha_atual_nao_confere"),
      ERRO_NOME_PACOTE_EXISTENTE("nome_pacote_existente");

   private ChaveMensagem(String chave)
   {
      this.chave = chave;
   }

   @Getter
   private String chave;


}
