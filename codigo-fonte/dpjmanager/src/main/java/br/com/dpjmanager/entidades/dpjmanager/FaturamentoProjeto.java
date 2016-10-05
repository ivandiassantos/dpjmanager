package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "FATURAMENTO_PROJETO")
@NamedQueries({
   @NamedQuery(name = FaturamentoProjeto.QUERY_LISTA_FATURAMENTO_PROJETO, query = "select f from FaturamentoProjeto f ")
})
public class FaturamentoProjeto implements Serializable
{

   public static final String QUERY_LISTA_FATURAMENTO_PROJETO = "listaFaturamentoProjeto";
   private static final long serialVersionUID = 2148119094942737065L;
   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FATURAMENTO_PROJETO")
   @SequenceGenerator(name = "SEQ_FATURAMENTO_PROJETO", sequenceName = "SEQ_FATURAMENTO_PROJETO", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_FATURAMENTO_PROJETO")
   private Long codFaturamentoProjeto;
   @Getter
   @Setter
   @Column(name = "MES_ANO_FATURAMENTO_PROJETO")
   private String mesAnoFaturamentoProjeto;
   @Getter
   @Setter
   @Column(name = "VALOR_META_ACUMULADA")
   private BigDecimal valorMetaAcumulada;
   @Getter
   @Setter
   @Column(name = "VALOR_ACUMULADO")
   private BigDecimal valorAcumulado;

}
