package br.com.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.NegociacaoDAO;
import br.com.dpjmanager.entidades.rhour.Negociacao;
import br.com.dpjmanager.service.NegociacaoService;

@Service("negociacaoService")
public class NegociacaoServiceImpl implements NegociacaoService
{

   @Autowired
   private NegociacaoDAO negociacaoDAO;

   @Override
   public List<Negociacao> obtemPorSolicitacaoProjetoDisciplina(Long codProjeto, Long codSolicitacao, String descricaoAtividade)
   {
      return negociacaoDAO.obtemAtividadesPorSolicitacaoProjetoDisciplina(codProjeto, codSolicitacao, descricaoAtividade);
   }

   @Override
   public List<Negociacao> obtemPorSolicitacaoProjeto(Long codSolicitacao, Long codProjeto)
   {
      return negociacaoDAO.obtemPorSolicitacaoProjeto(codSolicitacao, codProjeto);
   }
}
