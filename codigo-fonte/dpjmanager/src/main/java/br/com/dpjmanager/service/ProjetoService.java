package br.com.dpjmanager.service;

import br.com.dpjmanager.entidades.dpjmanager.Projeto;

/**
 * Classe de serviço para funcionalidades referentes a projetos.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
public interface ProjetoService
{

   /**
    * Inclui um projeto.
    * 
    * @param projeto
    */
   void incluirProjeto(Projeto projeto);

   /**
    * Obtém o projeto pelo código do projeto no CQ.
    * 
    * @param codProjetoCQ
    * @return {@link Projeto}
    */
   Projeto obtemPorCodigoProjetoCQ(Long codProjetoCQ);
}
