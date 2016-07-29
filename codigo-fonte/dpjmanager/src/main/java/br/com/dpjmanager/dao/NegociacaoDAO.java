package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.rhour.Negociacao;


public interface NegociacaoDAO
{

   List<Negociacao> obtemAtividadesPorSolicitacaoProjetoDisciplina(Long codProjeto, Long codSolicitacao, String descricaoAtividade);

   List<Negociacao> obtemPorSolicitacaoProjeto(Long codSolicitacao, Long codProjeto);
}
