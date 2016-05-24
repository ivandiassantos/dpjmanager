package la.foton.dpjmanager.entidades.cq;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ATIVIDADE")
public class Atividade implements Serializable
{
   private static final long serialVersionUID = -2589071232758843875L;
   @Id
   @Getter
   @Setter
   @Column(name = "DBID")
   private Long codAtividade;

   @Getter
   @Setter
   @Column(name = "IS_ACTIVE")
   private Integer ativo;

   @Getter
   @Setter
   @Column(name = "ID")
   private String idAtividade;

   @Getter
   @Setter
   @Column(name = "STATE")
   private Long estado;

   @Getter
   @Setter
   @Column(name = "VERSION")
   private Integer version;
   
   @Getter
   @Setter
   @Column(name = "LOCK_VERSION")
   private Integer versaoBloqueada;
   
   @Getter
   @Setter
   @Column(name = "LOCKED_BY")
   private Integer bloqueadoPor;

   @Getter
   @Setter
   @Column(name = "RATL_MASTERSHIP")
   private Integer ratlMastership;
   
   @Getter
   @Setter
   @Column(name = "IS_DUPLICATE")
   private Integer duplicado;
   
   @Getter
   @Setter
   @Column(name = "UNDUPLICATE_STATE")
   private Integer estadoNaoDuplicado;
   
   @Getter
   @Setter
   @Column(name = "HEADLINE")
   private String headLine;
   
   @Getter
   @Setter
   @Column(name = "OWNER")
   private Integer owner;
   
   @Getter
   @Setter
   @Column(name = "DESCRIPTION")
   private String descricao;
   
   @Getter
   @Setter
   @Column(name = "AM_PLANNED_START_DATE")
   @Temporal(TemporalType.DATE)
   private Date dataInicialPlanejada;
   
   @Getter
   @Setter
   @Column(name = "AM_PLANNED_END_DATE")
   @Temporal(TemporalType.DATE)
   private Date dataFinalPlanejada;
   
   @Getter
   @Setter
   @Column(name = "AM_PLANNED_WORK")
   private Long horasTrabalhoPlanejadas;
   
   @Getter
   @Setter
   @Column(name = "AM_PLANNED_REM_WORK")
   private Long horasTrabalhoFaltantes;
   
   @Getter
   @Setter
   @Column(name = "AM_PLANNED_DURATION")
   private Long duracaoHorasPlanejadas;
   
   @Getter
   @Setter
   @Column(name = "AM_PLANNED_REM_DURATION")
   private Long duracaoHorasPlanejadasFaltantes;
   
   @Getter
   @Setter
   @Column(name = "AM_ACTUAL_START_DATE")
   @Temporal(TemporalType.DATE)
   private Date dataInicioTrabalho;
   
   @Getter
   @Setter
   @Column(name = "AM_ACTUAL_END_DATE")
   @Temporal(TemporalType.DATE)
   private Date dataFinalTrabalho;
   
   @Getter
   @Setter
   @Column(name = "AM_ACTUAL_WORK")
   private Long horasRealizadas;
   
   @Getter
   @Setter
   @Column(name = "NOTE_ENTRY")
   private String notas;
   
   @Getter
   @Setter
   @Column(name = "NOTES_LOG")
   private String notasLog;
   
   @Getter
   @Setter
   @Column(name = "RESOLUTION")
   private String resolucao;
   
   @Getter
   @Setter
   @Column(name = "PROJETO")
   private Long projeto;
   
   @Getter
   @Setter
   @Column(name = "TIPO_ATIVIDADE")
   private String tipoAtividade;
   
   @Getter
   @Setter
   @Column(name = "SUBTIPO_ATIVIDADE")
   private String subTipoAtividade;
   
   @Getter
   @Setter
   @Column(name = "ATIVIDADE")
   private String atividade;
   
   @Getter
   @Setter
   @Column(name = "DESCRICAO_ATIVIDADE")
   private String descricaoAtividade;
   
   @Getter
   @Setter
   @Column(name = "EXECUTOR_ATIVIDADE")
   private Long executorAtividade;
   
   @Getter
   @Setter
   @Column(name = "BASELINE")
   private String baseline;
   
   @Getter
   @Setter
   @Column(name = "ATIVIDADE_CONCLUSAO")
   private String atividadeConclusao;
   
   @Getter
   @Setter
   @Column(name = "PERMISSAO_ACAO")
   private String permissaoAcao;
   
   @Getter
   @Setter
   @Column(name = "VERSAO")
   private String versao;
   
   @Getter
   @Setter
   @Column(name = "ATV_MAE")
   private String atividadeMae;
   
   @Getter
   @Setter
   @Column(name = "IDENTIFICADOR_ESCOPO")
   private String identificadorEscopo;
   
   @Getter
   @Setter
   @Column(name = "DATA_INICIO_ESTIMADO")
   @Temporal(TemporalType.DATE)
   private Date dataInicialEstimada;
   
   @Getter
   @Setter
   @Column(name = "DATA_FIM_ESTIMADO")
   @Temporal(TemporalType.DATE)
   private Date dataFinalEstimada;
   
   @Getter
   @Setter
   @Column(name = "TRABALHO_ESTIMADO")
   private Long trabalhoEstimado;

   @Getter
   @Setter
   @Column(name = "ITERACAO")
   private String iteracao;

   @Getter
   @Setter
   @Column(name = "TRABALHO_CONCLUSAO")
   private String trabalhoConclusao;

   @Getter
   @Setter
   @Column(name = "INDICADOR_MIGRACAO")
   private Long indicacaoMigracao;
   
   @Getter
   @Setter
   @Column(name = "NOME_ATIVIDADE")
   private String nomeAtividade;
   
   @Getter
   @Setter
   @Column(name = "CRIAR_ATIVIDADE_ASSOCIADA")
   private Long criarAtividadeAssociada;

   @Getter
   @Setter
   @Column(name = "INDICADOR_ESTIMADO")
   private Long indicadorEstimado;

   @Getter
   @Setter
   @Column(name = "INDICADOR_REALIZADO")
   private Long indicadorRealizado;

   @Getter
   @Setter
   @Column(name = "PRAPRAZO_ESTIMADO_INICIAL")
   @Temporal(TemporalType.DATE)
   private Date prazoEstimadoInicial;

   @Getter
   @Setter
   @Column(name = "PRAZO_ESTIMADO_FINAL")
   @Temporal(TemporalType.DATE)
   private Date prazoEstimadoFinal;

}
