
package la.foton.dpjmanager.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import la.foton.dpjmanager.dao.PacoteDAO;
import la.foton.dpjmanager.entidades.cq.Solicitacao;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;
import la.foton.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;
import la.foton.dpjmanager.exception.BusinessException;
import la.foton.dpjmanager.service.PacoteService;
import la.foton.dpjmanager.service.PacoteSolicitacaoService;
import la.foton.dpjmanager.service.SolicitacaoService;

@Service("pacoteService")
public class PacoteServiceImpl implements PacoteService
{

   @Autowired
   private PacoteDAO pacoteDAO;
   @Autowired
   private PacoteSolicitacaoService pacoteSolicitacaoService;
   @Autowired
   private SolicitacaoService solicitacaoService;

   @Transactional(propagation = Propagation.REQUIRES_NEW, transactionManager = "transactionManagerDpjManager")
   @Override
   public void incluirPacote(Pacote pacote, String solicitacoes) throws BusinessException
   {
      validarNomePacote(pacote);
      String[] arraySolicitacoes = obtemArraySolicitacoes(solicitacoes);
      pacote.setDataCriacao(new Date());
      pacoteDAO.salvar(pacote);
      for (String idSolicitacao : arraySolicitacoes)
      {
         PacoteSolicitacao pacoteSolicitacao = new PacoteSolicitacao();
         pacoteSolicitacao.setDataInclusao(new Date());
         pacoteSolicitacao.setIdSolicitacao(idSolicitacao);
         pacoteSolicitacao.setPacote(pacote);
         salvaPacoteSolicitacao(pacoteSolicitacao);
      }
   }

   private void validarNomePacote(Pacote pacote) throws BusinessException
   {
      Long qtdRegistros = pacoteDAO.validaNomePacote(pacote);
      if (qtdRegistros > 0)
      {
         throw new BusinessException("nome_pacote_existente");
      }
   }

   private String[] obtemArraySolicitacoes(String solicitacoes)
   {
      String numerosSolicitacoes = solicitacoes.replaceAll("[^0-9a-zA-Z,]", "");
      return numerosSolicitacoes.split(",");
   }

   @Transactional(propagation = Propagation.NESTED, transactionManager = "transactionManagerDpjManager")
   private void salvaPacoteSolicitacao(PacoteSolicitacao pacoteSolicitacao)
   {
      pacoteSolicitacaoService.incluirPacoteSolicitacao(pacoteSolicitacao);
   }

   @Override
   public void editarPacote(Pacote pacote, List<Solicitacao> listaSolicitacoes)
   {

   }

   @Override
   public List<Pacote> listarPacotes()
   {
      return pacoteDAO.listarPacotes();
   }

   @Override
   public Pacote obtemPacotePorCodigoPacote(Long codPacote)
   {
      return pacoteDAO.obtemPorCodigoPacote(codPacote);
   }
}
