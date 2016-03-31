package la.foton.dpjmanager.dao;

import java.util.List;
import la.foton.dpjmanager.entidades.Atividade;

public interface AtividadeDAO extends Dao<Atividade>{
	List<Atividade> listaSolicitacoesPorProjeto(Long codProjeto);
}
