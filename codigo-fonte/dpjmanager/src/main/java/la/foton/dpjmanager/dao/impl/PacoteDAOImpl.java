
package la.foton.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import la.foton.dpjmanager.dao.PacoteDAO;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;

@Repository
public class PacoteDAOImpl extends DaoImpl<Pacote> implements PacoteDAO
{

   public void salvar(Pacote pacote)
   {
      getEntityManagerDpjManager().persist(pacote);
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<Pacote> pesquisarPacotes(Pacote pacote)
   {
      TypedQuery<Pacote> query = (TypedQuery<Pacote>) getEntityManagerDpjManager().createNamedQuery("pesquisarPacotes");
      query.setParameter("nomePacote", "%" + pacote.getNomePacote().toUpperCase() + "%");
      return query.getResultList();
   }

   @SuppressWarnings("unchecked")
   @Override
   public List<Pacote> listarPacotes()
   {
      TypedQuery<Pacote> query = (TypedQuery<Pacote>) getEntityManagerDpjManager().createNamedQuery("listarPacotes");
      return query.getResultList();
   }

   @SuppressWarnings("unchecked")
   @Override
   public Long validaNomePacote(Pacote pacote)
   {
      TypedQuery<Long> query = (TypedQuery<Long>) getEntityManagerDpjManager().createNamedQuery("validaNomePacote");
      query.setParameter("nomePacote", pacote.getNomePacote());
      return query.getSingleResult();
   }

   @Override
   public Pacote obtemPorCodigoPacote(Long codPacote)
   {
      return getEntityManagerDpjManager().find(Pacote.class, codPacote);
   }
}
