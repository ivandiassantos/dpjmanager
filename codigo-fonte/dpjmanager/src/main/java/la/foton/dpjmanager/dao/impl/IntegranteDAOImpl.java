package la.foton.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import la.foton.dpjmanager.dao.IntegranteDAO;
import la.foton.dpjmanager.entidades.Integrante;

@Repository
public class IntegranteDAOImpl extends DaoImpl<Integrante> implements IntegranteDAO
{
   public IntegranteDAOImpl(){
      super(Integrante.class);
   }
   
   @SuppressWarnings("unchecked")
   @Override
   public List<Integrante> listaPorDescricaoAtividade(List<String> listaDescricoesAtividades)
   {
      TypedQuery<Integrante> query = (TypedQuery<Integrante>) getEntityManagerRhour().createNamedQuery("listaPorDisciplina");
      query.setParameter("listaDescricaoAtividade", listaDescricoesAtividades);
      return query.getResultList();
   }
}
