package br.com.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.NegociacaoDAO;
import br.com.dpjmanager.entidades.rhour.Negociacao;

@Repository
public class NegociacaoDAOImpl extends DaoImpl<Negociacao> implements NegociacaoDAO
{

   @SuppressWarnings("unchecked")
   @Override
   public List<Negociacao> obtemAtividadesPorSolicitacaoProjetoDisciplina(Long codProjeto, Long codSolicitacao,
      String descricaoAtividade)
   {
      TypedQuery<Negociacao> query =
         (TypedQuery<Negociacao>) getEntityManagerRhour().createNamedQuery("obtemSolicitacaoProjetoDescricaoAtividade");
      query.setParameter("codAtividade", codSolicitacao);
      query.setParameter("codProjeto", codProjeto);
      query.setParameter("descricaoAtividade", "%" + descricaoAtividade + "%");
      return query.getResultList();
   }

   @SuppressWarnings("unchecked")
   @Override
   public List<Negociacao> obtemPorSolicitacaoProjeto(Long codSolicitacao, Long codProjeto)
   {
      TypedQuery<Negociacao> query =
         (TypedQuery<Negociacao>) getEntityManagerRhour().createNamedQuery("obtemSolicitacaoProjeto");
      query.setParameter("codAtividade", codSolicitacao);
      query.setParameter("codProjeto", codProjeto);
      return query.getResultList();
   }

}
