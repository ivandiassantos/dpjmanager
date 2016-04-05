package la.foton.dpjmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import la.foton.dpjmanager.dao.DisciplinaDAO;
import la.foton.dpjmanager.dto.DashBoardDisciplinaDTO;
import la.foton.dpjmanager.entidades.Disciplina;

@Service("disciplinaService")
public class DisciplinaServiceImpl implements DisciplinaService {
	@Autowired
	private DisciplinaDAO disciplinaDAO;

	@Override
	public List<Disciplina> listarDisciplinas() {
		return disciplinaDAO.listarDisciplinas();
	}

	@Override
	public List<DashBoardDisciplinaDTO> montaDashboardDisciplinaPorProjetoSolicitacao(Long codProjeto, Long codSolicitacao) {
		List<DashBoardDisciplinaDTO> listaDashBoardDisciplina = new ArrayList<DashBoardDisciplinaDTO>();
		return listaDashBoardDisciplina;
	}

}
