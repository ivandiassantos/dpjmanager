package br.com.dpjmanager.service;

import br.com.dpjmanager.entidades.dpjmanager.Usuario;
import br.com.dpjmanager.exception.BusinessException;

/**
 * Interface de serviço para as funcionalidades referentes aos usuários.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
public interface UsuarioService
{

   /**
    * Obtém um usuário a partir do login.
    * 
    * @param login
    * @return {@link Usuario}
    */
   Usuario obtemPorLogin(String login);

   /**
    * Atualiza os dados do usuário.
    * 
    * @param usuario
    */
   void atualizar(Usuario usuario);

   /**
    * Valida e altera a senha do usuário no primeiro acesso.
    * 
    * @param login
    * @param senhaAtual
    * @param novaSenha
    * @param confirmacaoNovaSenha
    * @throws BusinessException
    */
   void alterarSenhaPrimeiroAcessoUsuario(String login, String senhaAtual, String novaSenha, String confirmacaoNovaSenha)
      throws BusinessException;
}
