package br.com.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.ProjetoCQDAO;
import br.com.dpjmanager.entidades.cq.ProjetoCQ;
import br.com.dpjmanager.service.ProjetoCQService;


/**
 * Serviço para obtenção de dados referentes a tabela de projetos do CQ.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
@Service("projetoCQService")
public class ProjetoCQServiceImpl implements ProjetoCQService
{

   @Autowired
   private ProjetoCQDAO projetoCQDAO;
   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.ProjetoCQService#listarPorSolicitacao(java.lang.String)
    */
   @Override
   public List<ProjetoCQ> listarPorSolicitacao(String numeroSolicitacao)
   {
      return projetoCQDAO.listarPorSolicitacao(numeroSolicitacao);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.ProjetoCQService#obtemPorId(java.lang.Long)
    */
   @Override
   public ProjetoCQ obtemPorId(Long id)
   {
      return projetoCQDAO.obtemPorId(id);
   }

}
