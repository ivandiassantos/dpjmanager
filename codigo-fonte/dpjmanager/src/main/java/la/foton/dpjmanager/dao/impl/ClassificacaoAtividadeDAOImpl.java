
package la.foton.dpjmanager.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import la.foton.dpjmanager.dao.ClassificacaoAtividadeDAO;
import la.foton.dpjmanager.entidades.dpjmanager.ClassificacaoAtividade;

import org.springframework.stereotype.Repository;

@Repository
public class ClassificacaoAtividadeDAOImpl extends DaoImpl<ClassificacaoAtividade> implements ClassificacaoAtividadeDAO
{

   public ClassificacaoAtividadeDAOImpl()
   {
      super(ClassificacaoAtividade.class);
   }

   @SuppressWarnings("unchecked")
   @Override
   public List<ClassificacaoAtividade> listaPorCodigoDisciplina(Long codigoDisciplina)
   {
      TypedQuery<ClassificacaoAtividade> query =
         (TypedQuery<ClassificacaoAtividade>) getEntityManagerDpjManager().createNamedQuery("listaPorCodigoDisciplina");
      query.setParameter("codDisciplina", codigoDisciplina);
      return query.getResultList();
   }

}
