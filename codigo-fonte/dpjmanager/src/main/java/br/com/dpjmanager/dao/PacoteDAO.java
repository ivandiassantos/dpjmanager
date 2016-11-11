
package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;

public interface PacoteDAO
{

   void salvar(Pacote pacote);

   List<Pacote> pesquisarPacotes(Pacote pacote);

   List<Pacote> listarPacotes();

   Long validaNomePacote(Pacote pacote);

   Pacote obtemPorCodigoPacote(Long codPacote);
}
