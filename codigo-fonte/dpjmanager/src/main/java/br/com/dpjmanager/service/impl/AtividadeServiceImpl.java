
package br.com.dpjmanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.AtividadeDAO;
import br.com.dpjmanager.entidades.rhour.Atividade;
import br.com.dpjmanager.service.AtividadeService;

@Service("atividadeService")
public class AtividadeServiceImpl implements AtividadeService
{
   @Autowired
   private AtividadeDAO atividadeDAO;

   // @Override
   // public List<Atividade> obtemPorProjetoSolicitacao(Long codProjeto, String idSolicitacao)
   // {
   // return atividadeDAO.obtemPorProjetoSolicitacao(codProjeto, idSolicitacao);
   // }
   @Override
   public Atividade obtemSolicitacoesPorIdSolicitacao(String idSolicitacao)
   {
      return atividadeDAO.obtemSolicitacaoPorIdSolicitacao(idSolicitacao);
   }

   @Override
   public Atividade obtemAtividadePorId(Long codAtividade)
   {
      return atividadeDAO.obtemPorId(codAtividade);
   }
}
