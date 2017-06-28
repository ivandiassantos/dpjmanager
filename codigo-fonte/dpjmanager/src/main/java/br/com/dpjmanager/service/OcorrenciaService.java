
package br.com.dpjmanager.service;

import java.util.List;
import br.com.dpjmanager.dto.OcorrenciaDTO;

/**
 * Classe de serviço para tratamento de ocorrências.
 * 
 * @author Junho/2017: Ivan Dias <DD>
 */
public interface OcorrenciaService
{

   /**
    * Lista as ocorrências de homologação.
    * 
    * @return
    */
   List<OcorrenciaDTO> listaOcorrenciasHomologacao();

}
