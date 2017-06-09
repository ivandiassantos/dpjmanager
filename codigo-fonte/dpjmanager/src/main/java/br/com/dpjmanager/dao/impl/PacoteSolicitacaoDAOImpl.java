
package br.com.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.PacoteSolicitacaoDAO;
import br.com.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;

/**
 * Dao referente a persistência do relacionamento entre pacote e solicitação.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
@Repository
public class PacoteSolicitacaoDAOImpl extends DaoImpl implements PacoteSolicitacaoDAO
{

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.PacoteSolicitacaoDAO#salvar(br.com.dpjmanager.entidades.dpjmanager.PacoteSolicitacao)
    */
   @Override
   public void salvar(PacoteSolicitacao pacoteSolicitacao)
   {
      getEntityManagerDpjManager().persist(pacoteSolicitacao);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.PacoteSolicitacaoDAO#obtemPorPacote(br.com.dpjmanager.entidades.dpjmanager.Pacote)
    */
   @SuppressWarnings("unchecked")
   @Override
   public List<PacoteSolicitacao> obtemPorPacote(Long codPacote)
   {
      TypedQuery<PacoteSolicitacao> query =
         (TypedQuery<PacoteSolicitacao>) getEntityManagerDpjManager().createNamedQuery(PacoteSolicitacao.OBTEM_POR_COD_PACOTE);
      query.setParameter("codPacote", codPacote);
      return query.getResultList();
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.PacoteSolicitacaoDAO#remover(br.com.dpjmanager.entidades.dpjmanager.PacoteSolicitacao)
    */
   @Override
   public void remover(PacoteSolicitacao pacoteSolicitacao)
   {
      getEntityManagerDpjManager().remove(pacoteSolicitacao);
   }

}
