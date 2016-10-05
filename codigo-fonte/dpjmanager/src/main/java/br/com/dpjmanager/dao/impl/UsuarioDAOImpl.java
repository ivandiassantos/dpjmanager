package br.com.dpjmanager.dao.impl;

import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.UsuarioDAO;
import br.com.dpjmanager.entidades.dpjmanager.Usuario;

/**
 * Classe DAO para usuários.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
@Repository
public class UsuarioDAOImpl extends DaoImpl implements UsuarioDAO
{

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.UsuarioDAO#obtemUsuarioPorLogin(java.lang.String)
    */
   @Override
   public Usuario obtemUsuarioPorLogin(String login)
   {
      Query query = getEntityManagerDpjManager().createNamedQuery(Usuario.QUERY_OBTEM_USUARIO_POR_LOGIN);
      query.setParameter("login", login);
      return (Usuario) query.getSingleResult();
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.UsuarioDAO#atualizar(br.com.dpjmanager.entidades.dpjmanager.Usuario)
    */
   @Override
   public void atualizar(Usuario usuario)
   {
      getEntityManagerDpjManager().merge(usuario);
   }

}
