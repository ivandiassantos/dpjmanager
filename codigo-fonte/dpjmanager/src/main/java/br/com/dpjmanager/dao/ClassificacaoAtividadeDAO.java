package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.ClassificacaoAtividade;

public interface ClassificacaoAtividadeDAO extends Dao<ClassificacaoAtividade>
{

   List<ClassificacaoAtividade> listaClassificacaoAtividade();

   List<ClassificacaoAtividade> listaPorNomeDisciplina(String nomeDisciplina);

}
