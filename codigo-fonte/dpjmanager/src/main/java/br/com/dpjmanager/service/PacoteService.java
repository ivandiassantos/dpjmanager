
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.entidades.cq.Solicitacao;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.exception.BusinessException;

public interface PacoteService
{

   void incluirPacote(Pacote pacote, String solicitacoes) throws BusinessException;

   // List<PacoteDTO> pesquisarPacotes(Pacote pacote);
   void editarPacote(Pacote pacote, List<Solicitacao> listaSolicitacoes);

   List<Pacote> listarPacotes();

   Pacote obtemPacotePorCodigoPacote(Long codPacote);
}
