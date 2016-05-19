
package la.foton.dpjmanager.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolicitacaoDTO
{

   private String idSolicitacao;
   private String descricaoSolicitacao;
   private List<String> projetosEnvolvidos;

}
