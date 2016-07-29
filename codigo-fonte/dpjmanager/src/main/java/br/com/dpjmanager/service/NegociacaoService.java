package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.entidades.rhour.Negociacao;


public interface NegociacaoService
{

   List<Negociacao> obtemPorSolicitacaoProjetoDisciplina(Long codProjeto, Long codSolicitacao, String descricaoAtividade);

   List<Negociacao> obtemPorSolicitacaoProjeto(Long codSolicitacao, Long codProjeto);
}
