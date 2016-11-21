
package br.com.dpjmanager.service.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.SolicitacaoDAO;
import br.com.dpjmanager.entidades.cq.Solicitacao;
import br.com.dpjmanager.service.PacoteSolicitacaoService;
import br.com.dpjmanager.service.SolicitacaoService;

/**
 * Serviço para funcionalidades referentes a solicitação.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
@Service("solicitacaoService")
public class SolicitacaoServiceImpl implements SolicitacaoService
{

   @Autowired
   private SolicitacaoDAO solicitacaoDAO;

   @Autowired
   private PacoteSolicitacaoService pacoteSolicitacaoService;

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.SolicitacaoService#listaSolicitacaoPorNome(java.lang.String, java.lang.String)
    */
   @Override
   public List<Solicitacao> listaSolicitacaoPorNome(String nomeSolicitacao, String solicitacoes)
   {
      String[] arraySolicitacoes = solicitacoes.replaceAll("[^0-9,a-zA-Z]", "").split(",");
      return solicitacaoDAO.listaSolicitacoesPorNome(nomeSolicitacao, Arrays.asList(arraySolicitacoes));
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.SolicitacaoService#obtemPorId(java.lang.String)
    */
   @Override
   public Solicitacao obtemPorId(String idSolicitacao)
   {
      return solicitacaoDAO.obtemPorId(idSolicitacao);
   }

   @Override
   public List<Solicitacao> listaPorCodPacote(Long codPacote)
   {
      return null;
   }
}
