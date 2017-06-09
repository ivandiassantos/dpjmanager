package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.dpjmanager.Faturamento;

/**
 * Classe DAO para faturamento.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
public interface FaturamentoDAO
{

   /**
    * Inclui um faturamento.
    * 
    * @param faturamento
    */
   void incluirFaturamento(Faturamento faturamento);

   /**
    * Lista os faturamentos cadastrados.
    * 
    * @return {@link List<Faturamento>}
    */
   List<Faturamento> listar();
}
