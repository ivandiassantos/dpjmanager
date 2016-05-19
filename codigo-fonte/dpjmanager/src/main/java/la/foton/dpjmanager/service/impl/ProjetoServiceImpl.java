package la.foton.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import la.foton.dpjmanager.dao.ProjetoDAO;
import la.foton.dpjmanager.entidades.cq.Projeto;
import la.foton.dpjmanager.service.ProjetoService;

@Service("projetoService")
public class ProjetoServiceImpl implements ProjetoService
{

   @Autowired
   private ProjetoDAO projetoDAO;

   @Override
   public List<Projeto> listaPorIdSolicitacao(String idSolicitacao)
   {
      return projetoDAO.obtemProjetosPorSolicitacao(idSolicitacao);
   }

}
