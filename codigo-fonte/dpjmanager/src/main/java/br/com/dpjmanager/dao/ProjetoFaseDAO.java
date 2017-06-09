package br.com.dpjmanager.dao;

import br.com.dpjmanager.entidades.dpjmanager.ProjetoFase;

/**
 * Classe para persistência do relacionamento entre projeto e fase.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
public interface ProjetoFaseDAO
{

   /**
    * Inclui o relacionamento entre projeto e fase.
    * 
    * @param projetoFase
    */
   void incluirProjetoFase(ProjetoFase projetoFase);
}
