package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
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
@NamedQuery(name = Fase.QUERY_LISTAR_FASES, query = "select f from Fase f order by descricaoFase asc")
public class Fase implements Serializable
{
   private static final long serialVersionUID = 6816011832250542170L;
   public static final String QUERY_LISTAR_FASES = "listarFases";
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
