package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "UNIDADE")
@NamedQueries({
   @NamedQuery(name = Unidade.QUERY_LISTAR_UNIDADES, query = "select u from Unidade u order by u.descricaoUnidade")
})
public class Unidade implements Serializable
{
   public static final String QUERY_LISTAR_UNIDADES = "listarUnidades";
   private static final long serialVersionUID = -4139863367546874401L;
   
   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_UNIDADE")
   @SequenceGenerator(name = "SEQ_UNIDADE", sequenceName = "SEQ_UNIDADE", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_UNIDADE")
   private Long codUnidade;
   @Getter
   @Setter
   @Column(name = "DESCRICAO_UNIDADE")
   private String descricaoUnidade;
   @Getter
   @Setter
   @Column(name = "SIGLA_UNIDADE")
   private String siglaUnidade;
}
