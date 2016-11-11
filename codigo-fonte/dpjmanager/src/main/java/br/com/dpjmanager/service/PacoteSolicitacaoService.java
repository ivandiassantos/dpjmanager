
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;

public interface PacoteSolicitacaoService
{

   void incluirPacoteSolicitacao(PacoteSolicitacao pacoteSolicitacao);

   List<PacoteSolicitacao> obtemPorPacote(Pacote pacote);
}
