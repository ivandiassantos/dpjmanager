package br.com.dpjmanager.dao;

import br.com.dpjmanager.entidades.dpjmanager.Projeto;

/**
 * Classe DAO para operações relacionadas a entidade Projeto.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
public interface ProjetoDAO
{

   /**
    * Inclui um projeto.
    * 
    * @param projeto
    */
   void incluirProjeto(Projeto projeto);

   /**
    * Obtem o projeto pelo código do projeto no CQ.
    * 
    * @param codProjetoCQ
    * @return {@link Projeto}
    */
   Projeto obtemPorCodProjetoCQ(Long codProjetoCQ);
}
