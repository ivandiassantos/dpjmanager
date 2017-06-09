package br.com.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.FaturamentoDAO;
import br.com.dpjmanager.entidades.dpjmanager.Faturamento;

/**
 * Classe DAO para faturamento.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
@Repository
public class FaturamentoDAOImpl extends DaoImpl implements FaturamentoDAO
{

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.FaturamentoDAO#incluirFaturamento(br.com.dpjmanager.entidades.dpjmanager.Faturamento)
    */
   @Override
   public void incluirFaturamento(Faturamento faturamento)
   {
      getEntityManagerDpjManager().persist(faturamento);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.FaturamentoDAO#listar()
    */
   @SuppressWarnings("unchecked")
   @Override
   public List<Faturamento> listar()
   {
      Query query = getEntityManagerDpjManager().createNamedQuery(Faturamento.QUERY_LISTAR_FATURAMENTOS);
      return query.getResultList();
   }

}
