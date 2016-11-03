
package br.com.dpjmanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.UsuarioDAO;
import br.com.dpjmanager.entidades.dpjmanager.Usuario;

/**
 * Serviço para a autenticação do usuário.
 * 
 * @author <Mês por extenso>/2016: <Nome Completo do Implementador> <DD>
 */
@Service("autenticacaoUsuarioService")
public class AutenticacaoUsuarioService implements UserDetailsService
{

   @Autowired
   private UsuarioDAO usuarioDAO;

   /**
    * Busca o usuário pelo login.
    * 
    * @param login
    * @return {@link Usuario}
    * @throws UsernameNotFoundException
    */
   @Override
   public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException
   {
      return usuarioDAO.obtemUsuarioPorLogin(login);
   }

}
