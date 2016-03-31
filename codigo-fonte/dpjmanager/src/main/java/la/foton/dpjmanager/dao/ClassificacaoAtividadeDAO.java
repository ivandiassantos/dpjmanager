package la.foton.dpjmanager.dao;

import java.util.List;
import la.foton.dpjmanager.dao.Dao;
import la.foton.dpjmanager.entidades.ClassificacaoAtividade;


public interface ClassificacaoAtividadeDAO extends Dao<ClassificacaoAtividade>
{
   List<ClassificacaoAtividade> listaPorCodigoDisciplina(Long codigoDisciplina);
}
