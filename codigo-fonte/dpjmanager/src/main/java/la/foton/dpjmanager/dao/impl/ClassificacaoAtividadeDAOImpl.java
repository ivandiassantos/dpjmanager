package la.foton.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import la.foton.dpjmanager.dao.ClassificacaoAtividadeDAO;
import la.foton.dpjmanager.entidades.dpjmanager.ClassificacaoAtividade;

@Repository
public class ClassificacaoAtividadeDAOImpl extends DaoImpl<ClassificacaoAtividade> implements ClassificacaoAtividadeDAO
{

   @SuppressWarnings("unchecked")
   @Override
   public List<ClassificacaoAtividade> listaClassificacaoAtividade()
   {
      TypedQuery<ClassificacaoAtividade> query =
         (TypedQuery<ClassificacaoAtividade>) getEntityManagerDpjManager().createNamedQuery("listaClassificacaoAtividade");
      return query.getResultList();
   }

}
