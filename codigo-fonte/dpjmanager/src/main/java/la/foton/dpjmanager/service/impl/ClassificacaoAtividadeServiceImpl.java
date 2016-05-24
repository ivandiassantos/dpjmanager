package la.foton.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import la.foton.dpjmanager.dao.ClassificacaoAtividadeDAO;
import la.foton.dpjmanager.entidades.dpjmanager.ClassificacaoAtividade;
import la.foton.dpjmanager.service.ClassificacaoAtividadeService;

@Service("classificacaoAtividadeService")
public class ClassificacaoAtividadeServiceImpl implements ClassificacaoAtividadeService
{

   @Autowired
   private ClassificacaoAtividadeDAO classificacaoAtividadeDAO;

   @Override
   public List<ClassificacaoAtividade> listaClassificacaoAtividade()
   {
      return classificacaoAtividadeDAO.listaClassificacaoAtividade();
   }

}
