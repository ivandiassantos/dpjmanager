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
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import lombok.Getter;
import lombok.Setter;

/**
 * Classe de mapeamento da entidade Faturamento.
 * 
 * @author Dezembro/2016: Antônio Jousivan <DD>
 */
@Entity
@Table(name = "FATURAMENTO")
@NamedQuery(name = Faturamento.QUERY_LISTAR_FATURAMENTOS,
         query = "select f from Faturamento f join fetch f.pacote join fetch f.projeto ")
public class Faturamento implements Serializable
{
   private static final long serialVersionUID = -9104918607178065012L;
   
   public static final String QUERY_LISTAR_FATURAMENTOS = "listarFaturamentos";

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
   @NumberFormat(style = Style.CURRENCY, pattern = ",##0.00")
   private BigDecimal pontoFuncaoFaturado;

   @Getter
   @Setter
   @Column(name = "DATA_CADASTRO")
   @Temporal(TemporalType.DATE)
   @DateTimeFormat(iso = ISO.DATE)
   private Date dataCadastro;

   @Getter
   @Setter
   @Column(name = "VALOR_FATURADO")
   @NumberFormat(style = Style.CURRENCY, pattern = ",##0.00")
   private BigDecimal valorFaturado;

   @Getter
   @Setter
   @Column(name = "DATA_RECEBIMENTO")
   @Temporal(TemporalType.DATE)
   @DateTimeFormat(iso = ISO.DATE)
   private Date dataRecebimento;

   @Getter
   @Setter
   @Column(name = "VALOR_RECEBIMENTO")
   @NumberFormat(style = Style.CURRENCY, pattern = ",##0.00")
   private BigDecimal valorRecebimento;

   @Getter
   @Setter
   @Column(name = "NUM_SOLICITACAO")
   private String numeroSolicitacao;
   
   @Getter
   @Setter
   @Column(name = "NUM_ORDEM_SERVICO")
   private String numeroOrdemServico;
   
   @Getter
   @Setter
   @Column(name = "NUM_NOTA_FISCAL")
   private String numeroNotaFiscal;
   
   @Getter
   @Setter
   @Column(name = "PONTO_FUNCAO_ESTIMADO")
   @NumberFormat(style = Style.CURRENCY, pattern = ",##0.00")
   private BigDecimal pontoFuncaoEstimado;
   
   @Getter
   @Setter
   @Column(name = "PONTO_FUNCAO_DETALHADO")
   @NumberFormat(style = Style.CURRENCY, pattern = ",##0.00")
   private BigDecimal pontoFuncaoDetalhado;
   
   @Getter
   @Setter
   @Column(name = "QTD_HORAS_REALIZADAS")
   private String qtdHorasRealizadas;
}
