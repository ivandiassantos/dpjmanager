package br.com.dpjmanager.entidades.cq;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Mapeamento da tabela Projeto
 * 
 * @author Dezembro/2016: Ivan Dias<DD>
 */

@Entity
@Table(name = "REPOPROJECT")
@NoArgsConstructor
@AllArgsConstructor
public class ProjetoCQ implements Serializable
{
   private static final long serialVersionUID = -4932784086224411333L;

   @Id
   @Getter
   @Setter
   @Column(name = "DBID")
   private Long codProjeto;

   @Getter
   @Setter
   @Column(name = "NAME")
   private String descricaoProjeto;

}
