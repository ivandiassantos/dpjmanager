
package la.foton.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import la.foton.dpjmanager.dao.SolicitacaoDAO;
import la.foton.dpjmanager.entidades.cq.Solicitacao;

@Repository
public class SolicitacaoDAOImpl extends DaoImpl<Solicitacao> implements SolicitacaoDAO
{

   public SolicitacaoDAOImpl()
   {
      super(Solicitacao.class);
   }

   @SuppressWarnings("unchecked")
   @Override
   public List<Solicitacao> listaSolicitacoesPorNome(String nomeSolicitacao, List<String> listaIdsSolicitacoes)
   {
      TypedQuery<Solicitacao> query = (TypedQuery<Solicitacao>) getEntityManagerCQ().createNamedQuery("listaSolicitacaoPorNome");
      query.setParameter("nomeSolicitacao", "%" + nomeSolicitacao + "%");
      query.setParameter("listaIdsSolicitacoes", listaIdsSolicitacoes);
      return query.getResultList();
   }

   @Override
   public Solicitacao buscaPorCodigoSolicitacao(Long codSolicitacao)
   {
      Solicitacao solicitacao = getEntityManagerCQ().find(Solicitacao.class, codSolicitacao);
      return solicitacao;
   }

   @SuppressWarnings("unchecked")
   @Override
   public Solicitacao buscaPorIdSolicitacao(String idSolicitacao)
   {
      TypedQuery<Solicitacao> query = (TypedQuery<Solicitacao>) getEntityManagerCQ().createNamedQuery("buscaPorIdSolicitacao");
      query.setParameter("idSolicitacao", idSolicitacao);
      return query.getSingleResult();
   }
}
