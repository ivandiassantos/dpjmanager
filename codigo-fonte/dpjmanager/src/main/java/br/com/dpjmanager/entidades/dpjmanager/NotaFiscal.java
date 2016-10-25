package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "NOTA_FISCAL")
public class NotaFiscal implements Serializable
{

   /** @TODO Comentar atributo */
   private static final long serialVersionUID = -6992753208232084941L;

   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_NOTA_FISCAL")
   @SequenceGenerator(name = "SEQ_NOTA_FISCAL", sequenceName = "SEQ_NOTA_FISCAL", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_NOTA_FISCAL")
   private Long codNotaFiscal;

   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "COD_ORDEM_SERVICO", referencedColumnName = "COD_ORDEM_SERVICO")
   private OrdemServico ordemServico;

   @Getter
   @Setter
   @Column(name = "NUMERO_NOTA_FISCAL")
   private String numeroNotaFiscal;

   @Getter
   @Setter
   @Column(name = "DATA_EMISSAO")
   @Temporal(TemporalType.DATE)
   private Date dataEmissao;

   @Getter
   @Setter
   @Column(name = "DATA_CADASTRO")
   @Temporal(TemporalType.DATE)
   private Date dataCadastro;

   @Getter
   @Setter
   @Column(name = "VALOR_NOTA_FISCAL")
   private Long valorNotaFiscal;

}
