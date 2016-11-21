package br.com.dpjmanager.dto;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO para funcionalidades referentes a Pacote.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
@Getter
@Setter
public class PacoteDTO
{

   private Long codPacote;
   private String nomePacote;
   private Date dataInicio;
   private Date dataFinal;
   private List<SolicitacaoDTO> solicitacoes;
}
