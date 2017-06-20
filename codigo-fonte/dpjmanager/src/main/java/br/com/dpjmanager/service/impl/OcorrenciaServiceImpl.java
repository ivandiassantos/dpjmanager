
package br.com.dpjmanager.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dpjmanager.dao.OcorrenciaDAO;
import br.com.dpjmanager.dto.OcorrenciaDTO;
import br.com.dpjmanager.service.OcorrenciaService;

/**
 * Classe de serviço para tratamento de ocorrências.
 * 
 * @author Junho/2017: Ivan Dias <DD>
 */
@Service("ocorrenciaService")
public class OcorrenciaServiceImpl implements OcorrenciaService
{

   @Autowired
   private OcorrenciaDAO ocorrenciaDAO;

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.service.OcorrenciaService#listaOcorrenciasHomologacao()
    */
   @Override
   public List<OcorrenciaDTO> listaOcorrenciasHomologacao()
   {
      return ocorrenciaDAO.listaOcorrenciasHomologacao();
   }

}
