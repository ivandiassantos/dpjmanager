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
 * Mapamento da tabela Fase
 * 
 * @author Outubro/2016: Antonio Jousivan
 */
@Entity
@Table(name = "FASE")
public class Fase implements Serializable
{

   /** @TODO Comentar atributo */
   private static final long serialVersionUID = 6816011832250542170L;
   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FASE")
   @SequenceGenerator(name = "SEQ_FASE", sequenceName = "SEQ_FASE", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_FASE")
   private Long codFase;
   @Getter
   @Setter
   @Column(name = "DESCRICAO_FASE")
   private String descricaoFase;

}
