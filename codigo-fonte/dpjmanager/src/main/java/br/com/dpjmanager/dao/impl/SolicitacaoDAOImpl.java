
package br.com.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.SolicitacaoDAO;
import br.com.dpjmanager.entidades.cq.Solicitacao;

@Repository
public class SolicitacaoDAOImpl extends DaoImpl implements SolicitacaoDAO
{
   @SuppressWarnings("unchecked")
   @Override
   public List<Solicitacao> listaSolicitacoesPorNome(String nomeSolicitacao, List<String> listaIdsSolicitacoes)
   {
      TypedQuery<Solicitacao> query = (TypedQuery<Solicitacao>) getEntityManagerCQ().createNamedQuery(Solicitacao.QUERY_LISTA_POR_NOME);
      query.setParameter("nomeSolicitacao", "%" + nomeSolicitacao + "%");
      query.setParameter("listaIdsSolicitacoes", listaIdsSolicitacoes);
      return query.getResultList();
   }

   @Override
   public Solicitacao obtemPorId(String idSolicitacao)
   {
      Query query = getEntityManagerCQ().createNamedQuery(Solicitacao.QUERY_BUSCA_POR_ID);
      query.setParameter("idSolicitacao", idSolicitacao);
      return (Solicitacao) query.getSingleResult();
   }
}
