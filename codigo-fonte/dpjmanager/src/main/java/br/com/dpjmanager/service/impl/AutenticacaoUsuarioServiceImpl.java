
package br.com.dpjmanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.UsuarioDAO;

/**
 * Serviço para autenticação de usuários.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
@Service("autenticacaoUsuarioService")
public class AutenticacaoUsuarioServiceImpl implements UserDetailsService
{

   @Autowired
   private UsuarioDAO usuarioDAO;
   /**
    * (Ver Javadoc da super classe)
    * 
    * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
    */
   @Override
   public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException
   {
      return usuarioDAO.obtemUsuarioPorLogin(login);
   }

}
