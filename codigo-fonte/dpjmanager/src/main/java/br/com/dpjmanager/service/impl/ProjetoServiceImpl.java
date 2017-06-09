package br.com.dpjmanager.service.impl;

import javax.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.dpjmanager.dao.ProjetoDAO;
import br.com.dpjmanager.entidades.dpjmanager.Projeto;
import br.com.dpjmanager.service.ProjetoService;

/**
 * Classe de serviço para funcionalidades referentes a projetos.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
@Service("projetoService")
public class ProjetoServiceImpl implements ProjetoService
{

   @Autowired
   private ProjetoDAO projetoDAO;

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.ProjetoService#incluirProjeto(br.com.dpjmanager.entidades.dpjmanager.Projeto)
    */
   @Transactional(propagation = Propagation.REQUIRED, transactionManager = "transactionManagerDpjManager")
   @Override
   public void incluirProjeto(Projeto projeto)
   {
      projetoDAO.incluirProjeto(projeto);
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.ProjetoService#obtemPorCodigoProjetoCQ(java.lang.Long)
    */
   @Override
   public Projeto obtemPorCodigoProjetoCQ(Long codProjetoCQ)
   {
      Projeto projeto = null;
      try{
         projeto = projetoDAO.obtemPorCodProjetoCQ(codProjetoCQ);
      }
      catch (NoResultException e)
      {
         throw e;
      }
      
      return projeto;

   }

}
