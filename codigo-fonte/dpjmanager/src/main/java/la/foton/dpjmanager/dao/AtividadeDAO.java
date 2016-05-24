package la.foton.dpjmanager.dao;

import java.util.List;
import la.foton.dpjmanager.entidades.cq.Atividade;

public interface AtividadeDAO extends Dao<Atividade>
{

   List<Atividade> obtemPorProjetoSolicitacao(Long codProjeto, String idSolicitacao);
}
