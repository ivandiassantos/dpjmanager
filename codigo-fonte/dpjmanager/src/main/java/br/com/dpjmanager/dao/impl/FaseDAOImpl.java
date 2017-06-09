package br.com.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.FaseDAO;
import br.com.dpjmanager.entidades.dpjmanager.Fase;

/**
 * DAO para a entidade Fase.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
@Repository
public class FaseDAOImpl extends DaoImpl implements FaseDAO
{

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.FaseDAO#listar()
    */
   @SuppressWarnings("unchecked")
   @Override
   public List<Fase> listar()
   {
      Query query = getEntityManagerDpjManager().createNamedQuery(Fase.QUERY_LISTAR_FASES);
      return query.getResultList();
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.FaseDAO#obtemPorId(java.lang.Long)
    */
   @Override
   public Fase obtemPorId(Long codFase)
   {
      return getEntityManagerDpjManager().find(Fase.class, codFase);
   }
}
