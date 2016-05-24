package la.foton.dpjmanager.dao;

import java.util.List;
import la.foton.dpjmanager.entidades.dpjmanager.ClassificacaoAtividade;

public interface ClassificacaoAtividadeDAO extends Dao<ClassificacaoAtividade>
{

   List<ClassificacaoAtividade> listaClassificacaoAtividade();
}
