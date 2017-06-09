package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.entidades.cq.ProjetoCQ;

/**
 * Serviço para obtenção de dados referentes a tabela de projetos do CQ.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
public interface ProjetoCQService
{

   /**
    * Lista os projetos por solicitação.
    * 
    * @param numeroSolicitacao
    * @return {@link List<ProjetoCQ>}
    */
   List<ProjetoCQ> listarPorSolicitacao(String numeroSolicitacao);

   /**
    * Obtém o projeto cq pelo id.
    * 
    * @param id
    * @return {@link ProjetoCQ}
    */
   ProjetoCQ obtemPorId(Long id);
}
