
package br.com.dpjmanager.service.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.SolicitacaoDAO;
import br.com.dpjmanager.entidades.cq.Solicitacao;
import br.com.dpjmanager.service.SolicitacaoService;

@Service("solicitacaoService")
public class SolicitacaoServiceImpl implements SolicitacaoService
{

   @Autowired
   private SolicitacaoDAO solicitacaoDAO;

   @Override
   public List<Solicitacao> listaSolicitacaoPorNome(String nomeSolicitacao, String solicitacoes)
   {
      String[] arraySolicitacoes = solicitacoes.replaceAll("[^0-9,a-zA-Z]", "").split(",");
      return solicitacaoDAO.listaSolicitacoesPorNome(nomeSolicitacao, Arrays.asList(arraySolicitacoes));
   }
}
