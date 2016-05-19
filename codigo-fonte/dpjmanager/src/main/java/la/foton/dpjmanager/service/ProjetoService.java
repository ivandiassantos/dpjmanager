package la.foton.dpjmanager.service;

import java.util.List;
import la.foton.dpjmanager.entidades.cq.Projeto;


public interface ProjetoService
{

   List<Projeto> listaPorIdSolicitacao(String idSolicitacao);
}
