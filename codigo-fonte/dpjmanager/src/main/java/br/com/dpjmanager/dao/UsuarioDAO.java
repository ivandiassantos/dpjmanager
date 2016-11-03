
package br.com.dpjmanager.dao;

import br.com.dpjmanager.entidades.dpjmanager.Usuario;

/**
 * Interface DAO para usuários.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
public interface UsuarioDAO
{

   /**
    * Obtém o usuário pelo login.
    * 
    * @param login
    * @return {@link Usuario}
    */
   Usuario obtemUsuarioPorLogin(String login);

   /**
    * Atualiza os dados de um usuário.
    * 
    * @param usuario
    */
   void atualizar(Usuario usuario);
}
