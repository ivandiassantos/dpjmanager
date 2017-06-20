
package br.com.dpjmanager.dao;

import java.util.List;
import br.com.dpjmanager.dto.OcorrenciaDTO;

/**
 * Interface DAO para ocorrências.
 * 
 * @author Junho/2016: Ivan Dias <DD>
 */
public interface OcorrenciaDAO
{

   /**
    * Lista as ocorrências de homologação cadastradas.
    * 
    * @return
    */
   List<OcorrenciaDTO> listaOcorrenciasHomologacao();
}
