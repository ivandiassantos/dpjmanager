package la.foton.dpjmanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import la.foton.dpjmanager.dao.DefeitoDAO;
import la.foton.dpjmanager.service.DefeitoService;

@Service("defeitoService")
public class DefeitoServiceImpl implements DefeitoService
{

   @Autowired
   private DefeitoDAO defeitoDAO;

   @Override
   public Long obtemQuantidadeDefeitosPorDisciplinaSolicitacao(Long codProjeto, String nomeDisciplina, String idSolicitacao)
   {
      return defeitoDAO.obtemQuantidadeDefeitosPorProjetoDisciplinaSolicitacao(codProjeto, nomeDisciplina, idSolicitacao);
   }

   @Override
   public Long obtemQuantidadeHorasGastasDefeitoPorProjetoDisciplinaSolicitacao(Long codProjeto, String nomeDisciplina, String idSolicitacao)
   {
      return defeitoDAO.obtemQuantidadeHorasGastasComDefeitoPorDisciplinaProjetoSolicitacao(codProjeto, nomeDisciplina, idSolicitacao);
   }

}
