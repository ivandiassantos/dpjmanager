package br.com.dpjmanager.entidades.cq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Mapeamento da entidade Ordem de Serviço.
 * 
 * @author Dezembro/2016: Ivan Dias <DD>
 */
@Entity
@Table(name = "ORDEM_DE_SERVICO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrdemServico
{
   @Id
   @Column(name = "DBID")
   private Long codOrdemServico;
   @Column(name = "NUMERO")
   private String descricaoOrdemServico;
}
