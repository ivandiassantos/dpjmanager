package br.com.dpjmanager.dao.impl;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.ProjetoDAO;
import br.com.dpjmanager.entidades.dpjmanager.Projeto;

/**
 * Classe DAO para operações relacionadas a entidade Projeto.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
@Repository
public class ProjetoDAOImpl extends DaoImpl implements ProjetoDAO
{

   private static final Logger logger = Logger.getLogger(ProjetoDAOImpl.class);
   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.ProjetoDAO#incluirProjeto(br.com.dpjmanager.entidades.dpjmanager.Projeto)
    */
   @Override
   public void incluirProjeto(Projeto projeto)
   {
      getEntityManagerDpjManager().persist(projeto);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.ProjetoDAO#obtemPorCodProjetoCQ(java.lang.Long)
    */
   @Override
   public Projeto obtemPorCodProjetoCQ(Long codProjetoCQ)
   {
      Projeto projeto = null;
      try{
         Query query = getEntityManagerDpjManager().createNamedQuery(Projeto.QUERY_OBTEM_POR_CODIGO_PROJETO_CQ);
         query.setParameter("codProjetoCQ", codProjetoCQ);
         projeto = (Projeto) query.getSingleResult();
      }
      catch (NoResultException e)
      {
         logger.error(e.getMessage(), e);
         return null;
      }
      
      return projeto;
   }

}
