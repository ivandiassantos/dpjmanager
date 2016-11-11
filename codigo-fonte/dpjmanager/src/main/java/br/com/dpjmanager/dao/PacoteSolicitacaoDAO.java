
package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;

public interface PacoteSolicitacaoDAO
{

   void salvar(PacoteSolicitacao pacoteSolicitacao);

   List<PacoteSolicitacao> obtemPorPacote(Pacote pacote);
}
