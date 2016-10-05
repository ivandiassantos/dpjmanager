package br.com.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.FaturamentoProjetoDAO;
import br.com.dpjmanager.entidades.dpjmanager.FaturamentoProjeto;

@Repository
public class FaturamentoProjetoDAOImpl extends DaoImpl implements FaturamentoProjetoDAO
{

   @SuppressWarnings("unchecked")
   @Override
   public List<FaturamentoProjeto> listar()
   {
      Query query = getEntityManagerDpjManager().createNamedQuery(FaturamentoProjeto.QUERY_LISTA_FATURAMENTO_PROJETO);
      return query.getResultList();
   }

   @Override
   public void inserir(FaturamentoProjeto faturamentoProjeto)
   {
      getEntityManagerDpjManager().persist(faturamentoProjeto);
   }

   @Override
   public void editar(FaturamentoProjeto faturamentoProjeto)
   {
      getEntityManagerDpjManager().merge(faturamentoProjeto);
   }

   @Override
   public FaturamentoProjeto obtemPorId(Long codFaturamentoProjeto)
   {
      return getEntityManagerDpjManager().find(FaturamentoProjeto.class, codFaturamentoProjeto);
   }
}
