package la.foton.dpjmanager.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetalhamentoDisciplinaDTO
{

   private String nomeDisciplina;
   private String totalHorasPlanejadas;
   private String totalHorasRealizadas;
   private Long quantidadeDefeitos;
   private Long quantidadeHorasGastasDefeitos;
}
