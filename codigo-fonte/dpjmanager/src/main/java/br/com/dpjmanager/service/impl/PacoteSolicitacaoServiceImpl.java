
package br.com.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.PacoteSolicitacaoDAO;
import br.com.dpjmanager.entidades.dpjmanager.Pacote;
import br.com.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;
import br.com.dpjmanager.service.PacoteSolicitacaoService;

@Service("pacoteSolicitacaoService")
public class PacoteSolicitacaoServiceImpl implements PacoteSolicitacaoService
{

   @Autowired
   private PacoteSolicitacaoDAO pacoteSolicitacaoDAO;

   @Override
   public void incluirPacoteSolicitacao(PacoteSolicitacao pacoteSolicitacao)
   {
      pacoteSolicitacaoDAO.salvar(pacoteSolicitacao);
   }

   @Override
   public List<PacoteSolicitacao> obtemPorPacote(Pacote pacote)
   {
      return pacoteSolicitacaoDAO.obtemPorPacote(pacote);
   }

}
