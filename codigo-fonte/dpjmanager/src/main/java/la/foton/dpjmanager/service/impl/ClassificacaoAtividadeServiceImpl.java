
package la.foton.dpjmanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import la.foton.dpjmanager.dao.ClassificacaoAtividadeDAO;
import la.foton.dpjmanager.entidades.dpjmanager.ClassificacaoAtividade;
import la.foton.dpjmanager.service.ClassificacaoAtividadeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("classificacaoAtividadeService")
public class ClassificacaoAtividadeServiceImpl implements ClassificacaoAtividadeService
{

   @Autowired
   private ClassificacaoAtividadeDAO classificacaoAtividadeDAO;

   @Override
   public List<ClassificacaoAtividade> listaPorCodigoDisciplina(Long codigoDisciplina)
   {
      return classificacaoAtividadeDAO.listaPorCodigoDisciplina(codigoDisciplina);
   }

   @Override
   public List<String> obtemListaDescricaoAtividadePorCodigoDisciplina(Long codigoDisciplina)
   {
      List<String> listaDescricaoAtividade = new ArrayList<String>();
      List<ClassificacaoAtividade> listaClassificacaoAtividade = listaPorCodigoDisciplina(codigoDisciplina);
      for (ClassificacaoAtividade classificacaoAtividade : listaClassificacaoAtividade)
      {
         listaDescricaoAtividade.add(classificacaoAtividade.getDescricaoDetalheAtividade());
      }
      return listaDescricaoAtividade;
   }

}
