
package br.com.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.dpjmanager.dao.PacoteSolicitacaoDAO;
import br.com.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;
import br.com.dpjmanager.service.PacoteSolicitacaoService;

/**
 * Serviço para funcionalidades referentes a relação entre pacote e solicitação.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
@Service("pacoteSolicitacaoService")
public class PacoteSolicitacaoServiceImpl implements PacoteSolicitacaoService
{

   @Autowired
   private PacoteSolicitacaoDAO pacoteSolicitacaoDAO;

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.PacoteSolicitacaoService#incluirPacoteSolicitacao(br.com.dpjmanager.entidades.dpjmanager.PacoteSolicitacao)
    */
   @Override
   public void incluirPacoteSolicitacao(PacoteSolicitacao pacoteSolicitacao)
   {
      pacoteSolicitacaoDAO.salvar(pacoteSolicitacao);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.PacoteSolicitacaoService#obtemPorPacote(br.com.dpjmanager.entidades.dpjmanager.Pacote)
    */
   @Override
   public List<PacoteSolicitacao> obtemPorPacote(Long codPacote)
   {
      return pacoteSolicitacaoDAO.obtemPorPacote(codPacote);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.PacoteSolicitacaoService#removerPorCodigoPacote(java.lang.Long)
    */
   @Transactional(propagation = Propagation.REQUIRED, transactionManager = "transactionManagerDpjManager")
   @Override
   public void removerPorCodigoPacote(Long codPacote)
   {
      List<PacoteSolicitacao> listaPacoteSolicitacao = obtemPorPacote(codPacote);
      for (PacoteSolicitacao pacoteSolicitacao : listaPacoteSolicitacao)
      {
         pacoteSolicitacaoDAO.remover(pacoteSolicitacao);
      }
   }
}
