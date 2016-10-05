package br.com.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.UnidadeDAO;
import br.com.dpjmanager.entidades.dpjmanager.Unidade;

@Repository
public class UnidadeDAOImpl extends DaoImpl implements UnidadeDAO
{

   @Override
   public void incluir(Unidade unidade)
   {
      getEntityManagerDpjManager().persist(unidade);
   }

   @Override
   public void editar(Unidade unidade)
   {
      getEntityManagerDpjManager().merge(unidade);
   }

   @SuppressWarnings("unchecked")
   @Override
   public List<Unidade> listar()
   {
      Query query = getEntityManagerDpjManager().createNamedQuery(Unidade.QUERY_LISTAR_UNIDADES);
      return query.getResultList();
   }

   @Override
   public void excluir(Long codUnidade)
   {
      Unidade unidade = obtemPorId(codUnidade);
      getEntityManagerDpjManager().remove(unidade);
   }

   @Override
   public Unidade obtemPorId(Long codUnidade)
   {
      return getEntityManagerDpjManager().find(Unidade.class, codUnidade);
   }

}
