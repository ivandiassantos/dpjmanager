package la.foton.dpjmanager.dao;

import java.util.List;
import la.foton.dpjmanager.entidades.cq.Projeto;

public interface ProjetoDAO extends Dao<Projeto>
{

   List<Projeto> obtemProjetosPorSolicitacao(String idSolicitacao);
}
