package la.foton.dpjmanager.service;

import java.util.List;

import la.foton.dpjmanager.dto.DashBoardDisciplinaDTO;
import la.foton.dpjmanager.entidades.Disciplina;


public interface DisciplinaService
{
   List<Disciplina> listarDisciplinas();
   List<DashBoardDisciplinaDTO> montaDashboardDisciplinaPorProjetoSolicitacao(Long codProjeto, Long codSolicitacao);
}
