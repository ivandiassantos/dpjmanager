
package br.com.dpjmanager.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import br.com.dpjmanager.dao.OcorrenciaDAO;
import br.com.dpjmanager.dto.OcorrenciaDTO;

/**
 * Classe DAO para ocorrências.
 * 
 * @author Junho/2016: Ivan Dias <DD>
 */
@Repository
public class OcorrenciaDAOImpl extends DaoImpl implements OcorrenciaDAO
{

   /**
    * (Ver Javadoc da super classe)
    * 
    * @see br.com.dpjmanager.dao.OcorrenciaDAO#listaOcorrenciasHomologacao()
    */
   @Override
   public List<OcorrenciaDTO> listaOcorrenciasHomologacao()
   {
      List<OcorrenciaDTO> listaOcorrencias = new ArrayList<>();
      StringBuilder sql = new StringBuilder();
      sql.append("select projeto.name, sp.id, to_char(sp.assunto), estado.name as situacao, ");
      sql.append("TO_DATE(TO_CHAR(sp.data_abertura, 'DD/MM/YYYY'), 'DD/MM/YYYY') AS data_formatada  ");
      sql.append("from suporte_produtos sp ");
      sql.append("inner join statedef estado ");
      sql.append("on sp.state = estado.id ");
      sql.append("inner join repoproject projeto ");
      sql.append("on sp.produto = projeto.dbid ");
      sql.append("where sp.ambiente = 'Homologação' and  sp.id is not null ");
      Query query = getEntityManagerCQ().createNativeQuery(sql.toString());
      List resultado = query.getResultList();
      for (Object object : resultado)
      {
         Object[] dados = (Object[]) object;
         OcorrenciaDTO ocorrenciaDTO = new OcorrenciaDTO();
         ocorrenciaDTO.setNomeProjeto(String.valueOf(dados[0]));
         ocorrenciaDTO.setIdOcorrencia(String.valueOf(dados[1]));
         ocorrenciaDTO.setDescricao(String.valueOf(dados[2]));
         ocorrenciaDTO.setSituacao(String.valueOf(dados[3]));
         ocorrenciaDTO.setDataAbertura((Date) dados[4]);
         listaOcorrencias.add(ocorrenciaDTO);
      }
      return listaOcorrencias;
   }
}
