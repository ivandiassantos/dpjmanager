package br.com.dpjmanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.ProjetoFaseDAO;
import br.com.dpjmanager.entidades.dpjmanager.ProjetoFase;
import br.com.dpjmanager.service.ProjetoFaseService;


/**
 * Classe de serviço para relacionamento entre projeto e fase.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
@Service("projetoFaseService")
public class ProjetoFaseServiceImpl implements ProjetoFaseService
{

   @Autowired
   private ProjetoFaseDAO projetoFaseDAO;
   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.ProjetoFaseService#incluirProjetoFase(br.com.dpjmanager.entidades.dpjmanager.ProjetoFase)
    */
   @Override
   public void incluirProjetoFase(ProjetoFase projetoFase)
   {
      projetoFaseDAO.incluirProjetoFase(projetoFase);
   }

}
