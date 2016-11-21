package br.com.dpjmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO para funcionalidades referentes a Solicitação.
 * 
 * @author Novembro/2016: Ivan Dias <DD>
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SolicitacaoDTO
{
   private String idSolicitacao;
   private String descricaoSolicitacao;
}
