package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "ORDEM_SERVICO")
public class OrdemServico implements Serializable
{
   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COD_ORDEM_SERVICO")
   @SequenceGenerator(name = "COD_ORDEM_SERVICO", sequenceName = "COD_ORDEM_SERVICO", initialValue =1, allocationSize = 1)
   @Column(name = "COD_ORDEM_SERVICO")
   private Long codOrdemServico;
   @Getter
   @Setter
   @Column(name = "NUMERO_ORDEM_SERVICO")
   private String numeroOrdemServico;
   @Getter
   @Setter
   @Column(name = "DATA_CADASTRO")
   @Temporal(TemporalType.DATE)
   private Date dataCadastro;
   @Getter
   @Setter
   @Column(name = "PONTO_FUNCAO_ESTIMADO")
   private Long pontoFuncaoEstimado;
   @Getter
   @Setter
   @Column(name = "PONTO_FUNCAO_DETALHADO")
   private Long pontoFuncaoDetalhado;

   @Column(name = "QTD_HORAS_REALIZADAS")
   private String qtdHorasRealizadas;
   
   
}
