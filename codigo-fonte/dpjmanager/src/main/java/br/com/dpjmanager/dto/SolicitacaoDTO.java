
package br.com.dpjmanager.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolicitacaoDTO
{

   private Long codSolicitacao;
   private String descricaoSolicitacao;
   private List<ProjetoDTO> projetosEnvolvidos;

}
