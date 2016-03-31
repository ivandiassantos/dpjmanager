package la.foton.dpjmanager.dao;

import java.util.List;
import la.foton.dpjmanager.entidades.Integrante;


public interface IntegranteDAO extends Dao<Integrante>
{
   List<Integrante> listaPorDescricaoAtividade(List<String> listaDescricoesAtividades);
}
