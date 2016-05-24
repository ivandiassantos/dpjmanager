package la.foton.dpjmanager.service;

import java.util.List;
import la.foton.dpjmanager.entidades.cq.Atividade;


public interface AtividadeService
{
   List<Atividade> obtemPorProjetoSolicitacao(Long codProjeto, String idSolicitacao);
}
