package la.foton.dpjmanager.service;

import java.util.List;
import la.foton.dpjmanager.entidades.ClassificacaoAtividade;


public interface ClassificacaoAtividadeService
{
   List<ClassificacaoAtividade> listaPorCodigoDisciplina(Long codigoDisciplina);
   
   List<String> obtemListaDescricaoAtividadePorCodigoDisciplina(Long codigoDisciplina);
}
