package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.entidades.cq.ProjetoCQ;

/**
 * DAO para obtenção de dados referentes a tabela de projetos do CQ.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
public interface ProjetoCQDAO
{

   /**
    * Obtém a lista de projetos do CQ por solicitação.
    * 
    * @param numeroSolicitacao
    * @return {@link List<ProjetoCQ>}
    */
   List<ProjetoCQ> listarPorSolicitacao(String numeroSolicitacao);

   /**
    * Obtém um projeto CQ por id.
    * 
    * @param id
    * @return {@link ProjetoCQ}
    */
   ProjetoCQ obtemPorId(Long id);
}