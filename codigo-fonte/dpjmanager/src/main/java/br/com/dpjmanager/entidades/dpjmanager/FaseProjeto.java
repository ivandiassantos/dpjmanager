package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Mapeamento da tabela de fases do projeto.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
@Entity
@Table(name = "FASE_PROJETO")
@NoArgsConstructor
@AllArgsConstructor
public class FaseProjeto implements Serializable
{

   private static final long serialVersionUID = -5864394926698033725L;

   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FASE_PROJETO")
   @SequenceGenerator(name = "SEQ_FASE_PROJETO", sequenceName = "SEQ_FASE_PROJETO", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_FASE_PROJETO")
   private Long codFaseProjeto;
   @Getter
   @Setter
   @Column(name = "DESCRICAO_FASE_PROJETO")
   private String descricaoFaseProjeto;

}
