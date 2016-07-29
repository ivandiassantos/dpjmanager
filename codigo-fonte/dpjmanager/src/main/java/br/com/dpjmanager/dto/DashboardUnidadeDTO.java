
package br.com.dpjmanager.dto;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DashboardUnidadeDTO
{
   private String nomePacote;
   private Date dataInicio;
   private Date dataFinal;
   private List<SolicitacaoDTO> listaSolicitacoes;

}
