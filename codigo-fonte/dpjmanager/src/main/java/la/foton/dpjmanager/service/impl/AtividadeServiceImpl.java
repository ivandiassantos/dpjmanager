package la.foton.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import la.foton.dpjmanager.dao.AtividadeDAO;
import la.foton.dpjmanager.entidades.cq.Atividade;
import la.foton.dpjmanager.service.AtividadeService;

@Service("atividadeService")
public class AtividadeServiceImpl implements AtividadeService
{
   @Autowired
   private AtividadeDAO atividadeDAO;

   @Override
   public List<Atividade> obtemPorProjetoSolicitacao(Long codProjeto, String idSolicitacao)
   {
      return atividadeDAO.obtemPorProjetoSolicitacao(codProjeto, idSolicitacao);
   }

}
