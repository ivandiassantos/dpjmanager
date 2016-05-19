
package la.foton.dpjmanager.service;

import java.util.List;
import la.foton.dpjmanager.entidades.cq.Solicitacao;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;
import la.foton.dpjmanager.exception.BusinessException;

public interface PacoteService
{

   void incluirPacote(Pacote pacote, String solicitacoes) throws BusinessException;

   // List<PacoteDTO> pesquisarPacotes(Pacote pacote);
   void editarPacote(Pacote pacote, List<Solicitacao> listaSolicitacoes);

   List<Pacote> listarPacotes();

   Pacote obtemPacotePorCodigoPacote(Long codPacote);
}
