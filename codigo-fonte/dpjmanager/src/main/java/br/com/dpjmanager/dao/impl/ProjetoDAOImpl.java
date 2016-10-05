package br.com.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.ProjetoDAO;
import br.com.dpjmanager.entidades.rhour.Projeto;

@Repository
public class ProjetoDAOImpl extends DaoImpl implements ProjetoDAO
{
   @Override
   public List<Projeto> obtemProjetosPorSolicitacao(String idSolicitacao)
   {
      return null;
   }

   @SuppressWarnings("unchecked")
   @Override
   public List<Projeto> listaPorSolicitacao(String nomeSolicitacao)
   {
      TypedQuery<Projeto> query = (TypedQuery<Projeto>) getEntityManagerRhour().createNamedQuery("listaPorSolicitacao");
      query.setParameter("nomeSolicitacao", nomeSolicitacao + "%");
      return query.getResultList();
   }
   
}
