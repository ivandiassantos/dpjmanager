package br.com.dpjmanager.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetalhamentoAtividadeDTO
{

   private String nomeExecutor;
   private Date dataInicio;
   private Date dataFim;
   private Long quantidadeHoras;
   private String nomeAtividade;
}
