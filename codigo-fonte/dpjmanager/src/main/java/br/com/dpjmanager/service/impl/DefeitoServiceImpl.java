
package br.com.dpjmanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.DefeitoDAO;
import br.com.dpjmanager.service.DefeitoService;

@Service("defeitoService")
public class DefeitoServiceImpl implements DefeitoService
{

   @Autowired
   private DefeitoDAO defeitoDAO;

   @Override
   public Long obtemQuantidadeDefeitosPorDisciplinaSolicitacao(String nomeDisciplina, String idSolicitacao)
   {
      return defeitoDAO.obtemQuantidadeDefeitosPorProjetoDisciplinaSolicitacao(nomeDisciplina, idSolicitacao);
   }

   @Override
   public Long obtemQuantidadeHorasGastasDefeitoPorProjetoDisciplinaSolicitacao(String nomeDisciplina, String idSolicitacao)
   {
      return defeitoDAO.obtemQuantidadeHorasGastasComDefeitoPorDisciplinaProjetoSolicitacao(nomeDisciplina, idSolicitacao);
   }

}
