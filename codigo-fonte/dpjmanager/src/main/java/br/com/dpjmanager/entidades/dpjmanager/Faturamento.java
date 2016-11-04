package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "FATURAMENTO")
public class Faturamento implements Serializable
{
   /** @TODO Comentar atributo */
   private static final long serialVersionUID = -9104918607178065012L;

   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FATURAMENTO")
   @SequenceGenerator(name = "SEQ_FATURAMENTO", sequenceName = "SEQ_FATURAMENTO", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_FATURAMENTO")
   private Long codFaturamento;

   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "COD_PACOTE", referencedColumnName = "COD_PACOTE")
   private Pacote pacote;

   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "COD_PROJETO", referencedColumnName = "COD_PROJETO")
   private Projeto projeto;

   @Getter
   @Setter
   @Column(name = "PONTO_FUNCAO_FATURADO")
   private Long pontoFuncaoFaturado;

   @Getter
   @Setter
   @Column(name = "DATA_CADASTRO")
   @Temporal(TemporalType.DATE)
   private Date dataCadastro;

   @Getter
   @Setter
   @Column(name = "VALOR_FATURADO")
   private BigDecimal valorFaturado;

   @Getter
   @Setter
   @Column(name = "DATA_RECEBIMENTO")
   @Temporal(TemporalType.DATE)
   private Date dataRecebimento;

   @Getter
   @Setter
   @Column(name = "VALOR_RECEBIMENTO")
   private BigDecimal valorRecebimento;

   @Getter
   @Setter
   @Column(name = "NUM_SOLICITACAO")
   private String numSolicitacao;
   
   @Getter
   @Setter
   @Column(name = "NUM_ORDEM_SERVICO")
   private String numOrdemServico;
   
   @Getter
   @Setter
   @Column(name = "NUM_NOTA_FISCAL")
   private String numNotaFiscal;
   
   @Getter
   @Setter
   @Column(name = "PONTO_FUNCAO_ESTIMADO")
   private String pontoFuncaoEstimado;
   
   @Getter
   @Setter
   @Column(name = "PONTO_FUNCAO_DETALHADO")
   private String pontoFuncaoDetalhado;
   
   @Getter
   @Setter
   @Column(name = "QTD_HORAS_REALIZADAS")
   private String qtdHorasRealizadas;
   
   

}
