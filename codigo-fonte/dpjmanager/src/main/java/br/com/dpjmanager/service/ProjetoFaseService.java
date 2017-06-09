package br.com.dpjmanager.service;

import br.com.dpjmanager.entidades.dpjmanager.ProjetoFase;

/**
 * Classe de serviço para relacionamento entre projeto e fase.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
public interface ProjetoFaseService
{

   /**
    * Inclui o relacionamento entre projeto e fase.
    * 
    * @param projetoFase
    */
   void incluirProjetoFase(ProjetoFase projetoFase);
}
