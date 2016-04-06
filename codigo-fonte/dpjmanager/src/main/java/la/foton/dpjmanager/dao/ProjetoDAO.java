
package la.foton.dpjmanager.dao;

import java.util.List;

import la.foton.dpjmanager.entidades.rhour.Projeto;

public interface ProjetoDAO extends Dao<Projeto>
{
   List<Projeto> listaPorCliente(Long codCliente);
}
