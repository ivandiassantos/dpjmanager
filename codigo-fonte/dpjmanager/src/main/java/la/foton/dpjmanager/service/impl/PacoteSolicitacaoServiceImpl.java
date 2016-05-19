
package la.foton.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import la.foton.dpjmanager.dao.PacoteSolicitacaoDAO;
import la.foton.dpjmanager.entidades.dpjmanager.Pacote;
import la.foton.dpjmanager.entidades.dpjmanager.PacoteSolicitacao;
import la.foton.dpjmanager.service.PacoteSolicitacaoService;

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
