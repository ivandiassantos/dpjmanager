package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.rhour.Projeto;

public interface ProjetoDAO extends Dao
{

   List<Projeto> obtemProjetosPorSolicitacao(String idSolicitacao);

   List<Projeto> listaPorSolicitacao(String nomeSolicitacao);
}
