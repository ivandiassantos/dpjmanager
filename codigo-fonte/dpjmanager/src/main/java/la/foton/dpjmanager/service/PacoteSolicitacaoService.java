
package la.foton.dpjmanager.service;

import java.util.List;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;
import la.foton.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;

public interface PacoteSolicitacaoService
{

   void incluirPacoteSolicitacao(PacoteSolicitacao pacoteSolicitacao);

   List<PacoteSolicitacao> obtemPorPacote(Pacote pacote);
}
