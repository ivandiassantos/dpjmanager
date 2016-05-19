
package la.foton.dpjmanager.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import la.foton.dpjmanager.dao.SolicitacaoDAO;
import la.foton.dpjmanager.entidades.cq.Solicitacao;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;
import la.foton.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;
import la.foton.dpjmanager.service.PacoteSolicitacaoService;
import la.foton.dpjmanager.service.SolicitacaoService;

@Service("solicitacaoService")
public class SolicitacaoServiceImpl implements SolicitacaoService
{

   @Autowired
   private SolicitacaoDAO solicitacaoDAO;

   @Autowired
   private PacoteSolicitacaoService pacoteSolicitacaoService;

   @Override
   public List<Solicitacao> listaSolicitacaoPorNome(String nomeSolicitacao, String solicitacoes)
   {
      String[] arraySolicitacoes = solicitacoes.replaceAll("[^0-9,a-zA-Z]", "").split(",");
      return solicitacaoDAO.listaSolicitacoesPorNome(nomeSolicitacao, Arrays.asList(arraySolicitacoes));
   }

   @Override
   public Solicitacao buscaPorCodigoSolicitacao(Long codSolicitacao)
   {
      return solicitacaoDAO.buscaPorCodigoSolicitacao(codSolicitacao);
   }

   @Override
   public Solicitacao buscaPorIdSolicitacao(String idSolicitacao)
   {
      return solicitacaoDAO.buscaPorIdSolicitacao(idSolicitacao);
   }

   @Override
   public List<Solicitacao> listaPorPacote(Pacote pacote)
   {
      List<Solicitacao> listaSolicitacoes = new ArrayList<>();
      List<PacoteSolicitacao> listaPacoteSolicitacao = pacoteSolicitacaoService.obtemPorPacote(pacote);
      listaPacoteSolicitacao.forEach(pacoteSolicitacao -> listaSolicitacoes.add(solicitacaoDAO.buscaPorIdSolicitacao(pacoteSolicitacao
               .getIdSolicitacao())));
      return listaSolicitacoes;
   }

}
