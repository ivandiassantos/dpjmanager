package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.cq.Solicitacao;


public interface SolicitacaoDAO
{

   List<Solicitacao> listaSolicitacoesPorNome(String nomeSolicitacao, List<String> listaIdsSolicitacoes);

   Solicitacao obtemPorId(String idSolicitacao);

}
