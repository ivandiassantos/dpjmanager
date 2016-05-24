package la.foton.dpjmanager.dto;

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
   private List<SolicitacaoDTO> listaSolicitacoes;
}
