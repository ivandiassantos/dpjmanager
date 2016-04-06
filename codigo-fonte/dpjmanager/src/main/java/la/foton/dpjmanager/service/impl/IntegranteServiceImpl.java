
package la.foton.dpjmanager.service.impl;

import java.util.List;

import la.foton.dpjmanager.dao.IntegranteDAO;
import la.foton.dpjmanager.entidades.rhour.Integrante;
import la.foton.dpjmanager.service.IntegranteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("integranteService")
public class IntegranteServiceImpl implements IntegranteService
{

   @Autowired
   private IntegranteDAO integranteDAO;

   @Override
   public List<Integrante> listaPorDisciplina(List<String> descricoesAtividades)
   {
      return integranteDAO.listaPorDescricaoAtividade(descricoesAtividades);
   }

}
