
package br.com.dpjmanager.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.SolicitacaoDAO;
import br.com.dpjmanager.entidades.cq.Solicitacao;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;
import br.com.dpjmanager.entidades.rhour.Atividade;
import br.com.dpjmanager.service.AtividadeService;
import br.com.dpjmanager.service.PacoteSolicitacaoService;
import br.com.dpjmanager.service.SolicitacaoService;

@Service("solicitacaoService")
public class SolicitacaoServiceImpl implements SolicitacaoService
{

   @Autowired
   private SolicitacaoDAO solicitacaoDAO;

   @Autowired
   private PacoteSolicitacaoService pacoteSolicitacaoService;

   @Autowired
   private AtividadeService atividadeService;

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
   public List<Atividade> listaPorPacote(Pacote pacote)
   {
      List<Atividade> listaSolicitacoes = new ArrayList<>();
      List<PacoteSolicitacao> listaPacoteSolicitacao = pacoteSolicitacaoService.obtemPorPacote(pacote);
      listaPacoteSolicitacao.forEach(pacoteSolicitacao -> listaSolicitacoes.add(atividadeService
               .obtemSolicitacoesPorIdSolicitacao(pacoteSolicitacao
               .getIdSolicitacao())));
      return listaSolicitacoes;
   }

}
