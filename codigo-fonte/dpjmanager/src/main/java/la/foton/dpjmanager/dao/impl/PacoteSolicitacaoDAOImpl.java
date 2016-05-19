
package la.foton.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import la.foton.dpjmanager.dao.PacoteSolicitacaoDAO;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;
import la.foton.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;

@Repository
public class PacoteSolicitacaoDAOImpl extends DaoImpl<PacoteSolicitacao> implements PacoteSolicitacaoDAO
{

   public PacoteSolicitacaoDAOImpl()
   {
      super(PacoteSolicitacao.class);
   }

   @Override
   public void salvar(PacoteSolicitacao pacoteSolicitacao)
   {
      getEntityManagerDpjManager().persist(pacoteSolicitacao);
   }

   @SuppressWarnings("unchecked")
   @Override
   public List<PacoteSolicitacao> obtemPorPacote(Pacote pacote)
   {
      TypedQuery<PacoteSolicitacao> query =
         (TypedQuery<PacoteSolicitacao>) getEntityManagerDpjManager().createNamedQuery("obtemPorSolicitacao");
      query.setParameter("pacote", pacote);
      return query.getResultList();
   }

}
