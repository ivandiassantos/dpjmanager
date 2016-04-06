package la.foton.dpjmanager.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import la.foton.dpjmanager.dao.DisciplinaDAO;
import la.foton.dpjmanager.entidades.dpjmanager.Disciplina;

import org.springframework.stereotype.Repository;

@Repository
public class DisciplinaDAOImpl extends DaoImpl<Disciplina> implements DisciplinaDAO
{

   public DisciplinaDAOImpl() {
      super(Disciplina.class);
   }
   
   @SuppressWarnings("unchecked")
   @Override
   public List<Disciplina> listarDisciplinas()
   {
      TypedQuery<Disciplina> query = (TypedQuery<Disciplina>) getEntityManagerDpjManager().createNamedQuery("listaDisciplinas");
      return query.getResultList();
   }

}
