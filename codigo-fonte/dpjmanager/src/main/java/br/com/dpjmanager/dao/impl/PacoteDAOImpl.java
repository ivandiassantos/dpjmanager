
package br.com.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.PacoteDAO;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;

/**
 * Classe DAO para operações relacionadas a persistência de pacotes.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
@Repository
public class PacoteDAOImpl extends DaoImpl implements PacoteDAO
{

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.PacoteDAO#salvar(br.com.dpjmanager.entidades.dpjmanager.Pacote)
    */
   public void salvar(Pacote pacote)
   {
      getEntityManagerDpjManager().persist(pacote);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.PacoteDAO#pesquisarPacotes(br.com.dpjmanager.entidades.dpjmanager.Pacote)
    */
   @Override
   @SuppressWarnings("unchecked")
   public List<Pacote> pesquisarPacotes(Pacote pacote)
   {
      TypedQuery<Pacote> query = (TypedQuery<Pacote>) getEntityManagerDpjManager().createNamedQuery("pesquisarPacotes");
      query.setParameter("nomePacote", "%" + pacote.getNomePacote().toUpperCase() + "%");
      return query.getResultList();
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.PacoteDAO#listarPacotes()
    */
   @SuppressWarnings("unchecked")
   @Override
   public List<Pacote> listarPacotes()
   {
      TypedQuery<Pacote> query = (TypedQuery<Pacote>) getEntityManagerDpjManager().createNamedQuery(Pacote.NOME_QUERY_LISTAR_PACOTES);
      return query.getResultList();
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.PacoteDAO#validaNomePacote(br.com.dpjmanager.entidades.dpjmanager.Pacote)
    */
   @SuppressWarnings("unchecked")
   @Override
   public Long validaNomePacote(Pacote pacote)
   {
      TypedQuery<Long> query = (TypedQuery<Long>) getEntityManagerDpjManager().createNamedQuery(Pacote.NOME_QUERY_VALIDA_NOME_PACOTE);
      query.setParameter("nomePacote", pacote.getNomePacote());
      return query.getSingleResult();
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.PacoteDAO#obtemPorCodigoPacote(java.lang.Long)
    */
   @Override
   public Pacote obtemPorId(Long codPacote)
   {
      return getEntityManagerDpjManager().find(Pacote.class, codPacote);
   }
}
