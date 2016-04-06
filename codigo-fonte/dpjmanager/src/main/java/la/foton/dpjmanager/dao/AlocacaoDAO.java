package la.foton.dpjmanager.dao;

import java.util.List;

import la.foton.dpjmanager.entidades.rhour.Alocacao;

public interface AlocacaoDAO extends Dao<Alocacao> {
	List<Alocacao> listarAlocacao();
}
