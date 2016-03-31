package la.foton.dpjmanager.dao;

import java.util.List;
import la.foton.dpjmanager.entidades.Disciplina;


public interface DisciplinaDAO extends Dao<Disciplina>
{
   List<Disciplina> listarDisciplinas();
}
