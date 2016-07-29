package br.com.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.ClassificacaoAtividadeDAO;
import br.com.dpjmanager.entidades.dpjmanager.ClassificacaoAtividade;

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

   @SuppressWarnings("unchecked")
   @Override
   public List<ClassificacaoAtividade> listaPorNomeDisciplina(String nomeDisciplina)
   {
      TypedQuery<ClassificacaoAtividade> query =
         (TypedQuery<ClassificacaoAtividade>) getEntityManagerDpjManager().createNamedQuery("listaPorNomeAtividade");
      query.setParameter("nomeDisciplina", nomeDisciplina);
      return query.getResultList();
   }

}
