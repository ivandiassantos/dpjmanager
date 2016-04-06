package la.foton.dpjmanager.dao;

import java.util.List;

import la.foton.dpjmanager.entidades.rhour.Integrante;


public interface IntegranteDAO extends Dao<Integrante>
{
   List<Integrante> listaPorDescricaoAtividade(List<String> listaDescricoesAtividades);
}
