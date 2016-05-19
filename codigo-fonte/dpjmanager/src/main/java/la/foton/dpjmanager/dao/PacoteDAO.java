
package la.foton.dpjmanager.dao;

import java.util.List;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;

public interface PacoteDAO extends Dao<Pacote>
{

   void salvar(Pacote pacote);

   List<Pacote> pesquisarPacotes(Pacote pacote);

   List<Pacote> listarPacotes();

   Long validaNomePacote(Pacote pacote);

   Pacote obtemPorCodigoPacote(Long codPacote);
}
