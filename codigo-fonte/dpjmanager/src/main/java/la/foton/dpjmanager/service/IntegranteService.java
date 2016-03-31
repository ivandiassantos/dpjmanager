package la.foton.dpjmanager.service;

import java.util.List;
import la.foton.dpjmanager.entidades.Integrante;


public interface IntegranteService
{
   List<Integrante> listaPorDisciplina(List<String> descricoesAtividades);
}
