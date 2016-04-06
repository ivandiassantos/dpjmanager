package la.foton.dpjmanager.service;

import java.util.List;

import la.foton.dpjmanager.entidades.rhour.Atividade;

public interface AtividadeService {
	List<Atividade> listaSolicitacoesPorProjeto(Long codProjeto);
}
