
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.ClassificacaoAtividade;

public interface ClassificacaoAtividadeService
{
   List<ClassificacaoAtividade> listaClassificacaoAtividade();

   List<ClassificacaoAtividade> listaPorNomeDisciplina(String nomeDisciplina);
}
