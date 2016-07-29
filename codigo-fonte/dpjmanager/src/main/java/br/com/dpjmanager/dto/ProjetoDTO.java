package br.com.dpjmanager.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjetoDTO
{
   private Long codProjeto;
   private String nomeProjeto;
   private List<DetalhamentoDisciplinaDTO> listaDisciplinas;
}
