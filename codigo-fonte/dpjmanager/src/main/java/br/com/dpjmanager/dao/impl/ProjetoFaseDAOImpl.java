package br.com.dpjmanager.dao.impl;

import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.ProjetoFaseDAO;
import br.com.dpjmanager.entidades.dpjmanager.ProjetoFase;

/**
 * Classe para persistência do relacionamento entre projeto e fase.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
@Repository
public class ProjetoFaseDAOImpl extends DaoImpl implements ProjetoFaseDAO
{

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.ProjetoFaseDAO#incluirProjetoFase(br.com.dpjmanager.entidades.dpjmanager.ProjetoFase)
    */
   @Override
   public void incluirProjetoFase(ProjetoFase projetoFase)
   {
      getEntityManagerDpjManager().persist(projetoFase);
   }

}
