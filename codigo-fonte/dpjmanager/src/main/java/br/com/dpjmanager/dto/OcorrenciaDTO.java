
package br.com.dpjmanager.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO para tratamento de ocorrências.
 * 
 * @author Junho/2017: Ivan Dias <DD>
 */
@Getter
@Setter
public class OcorrenciaDTO
{

   private String nomeProjeto;
   private String idOcorrencia;
   private String descricao;
   private String situacao;
   private Date dataAbertura;

}
