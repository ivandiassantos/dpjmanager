
package la.foton.dpjmanager.dao;

import java.util.List;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;
import la.foton.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;

public interface PacoteSolicitacaoDAO
{

   void salvar(PacoteSolicitacao pacoteSolicitacao);

   List<PacoteSolicitacao> obtemPorPacote(Pacote pacote);
}
