package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Mapeamento da tabela Projeto
 * 
 * @author Outubro/2016: Antonio Jousivan <DD>
 */

@Entity
@Table(name = "PROJETO")
public class Projeto implements Serializable
{

   /** @TODO Comentar atributo */
   private static final long serialVersionUID = -4932784086224411333L;

   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROJETO")
   @SequenceGenerator(name = "SEQ_PROJETO", sequenceName = "SEQ_PROJETO", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_PROJETO")
   private Long codProjeto;

   @Getter
   @Setter
   @Column(name = "DESCRICAO_PROJETO")
   private String descricaoProjeto;

}
