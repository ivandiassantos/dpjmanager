package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.FaturamentoProjeto;


public interface FaturamentoProjetoDAO extends Dao
{

   List<FaturamentoProjeto> listar();

   void inserir(FaturamentoProjeto faturamentoProjeto);

   void editar(FaturamentoProjeto faturamentoProjeto);

   FaturamentoProjeto obtemPorId(Long codFaturamentoProjeto);
}
