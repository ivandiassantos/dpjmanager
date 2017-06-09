
package br.com.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.FaseDAO;
import br.com.dpjmanager.entidades.dpjmanager.Fase;
import br.com.dpjmanager.service.FaseService;

/**
 * Classe de serviço para as funcionalidades referentes a fase.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
@Service("faseService")
public class FaseServiceImpl implements FaseService
{

   @Autowired
   private FaseDAO faseDAO;

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.FaseService#listar()
    */
   @Override
   public List<Fase> listar()
   {
      return faseDAO.listar();
   }

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.FaseService#obtemPorId(java.lang.Long)
    */
   @Override
   public Fase obtemPorId(Long codFase)
   {
      return faseDAO.obtemPorId(codFase);
   }

}
