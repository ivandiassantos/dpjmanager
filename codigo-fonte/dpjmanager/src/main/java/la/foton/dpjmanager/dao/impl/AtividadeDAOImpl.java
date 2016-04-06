
package la.foton.dpjmanager.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import la.foton.dpjmanager.dao.AtividadeDAO;
import la.foton.dpjmanager.entidades.rhour.Atividade;

import org.springframework.stereotype.Repository;

@Repository
public class AtividadeDAOImpl extends DaoImpl<Atividade> implements AtividadeDAO
{

   public AtividadeDAOImpl()
   {
      super(Atividade.class);
   }

   @SuppressWarnings("unchecked")
   @Override
   public List<Atividade> listaSolicitacoesPorProjeto(Long codProjeto)
   {
      TypedQuery<Atividade> query = (TypedQuery<Atividade>) getEntityManagerRhour().createNamedQuery("listaSolicitacoesPorProjeto");
      query.setParameter("codProjeto", codProjeto);
      return query.getResultList();
   }

}
