
package br.com.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.ClassificacaoAtividadeDAO;
import br.com.dpjmanager.entidades.dpjmanager.ClassificacaoAtividade;
import br.com.dpjmanager.service.ClassificacaoAtividadeService;

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

   @Override
   public List<ClassificacaoAtividade> listaPorNomeDisciplina(String nomeDisciplina)
   {
      return classificacaoAtividadeDAO.listaPorNomeDisciplina(nomeDisciplina);
   }
}
