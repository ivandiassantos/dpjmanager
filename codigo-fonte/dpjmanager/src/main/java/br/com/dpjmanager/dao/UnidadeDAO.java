package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.Unidade;


public interface UnidadeDAO extends Dao
{

   void incluir(Unidade unidade);

   void editar(Unidade unidade);

   List<Unidade> listar();

   void excluir(Long codUnidade);

   Unidade obtemPorId(Long codUnidade);
}
