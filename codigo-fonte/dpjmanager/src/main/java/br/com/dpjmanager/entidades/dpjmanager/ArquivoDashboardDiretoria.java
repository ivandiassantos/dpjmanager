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
@Table(name = "ARQUIVO_DASHBOARD_DIRETORIA")
@NamedQueries({
   @NamedQuery(name = "listarArquivosDashboardDiretoria", query = "select a from ArquivoDashboardDiretoria a order by a.ordemExibicao asc"),
   @NamedQuery(
            name = "obtemArquivoDashboardDiretoriaPorOrdemExibicaoCodigo",
            query = "select a from ArquivoDashboardDiretoria a where a.ordemExibicao =:ordemExibicao and a.codArquivoDashbardDiretoria =:codArquivoDashbardDiretoria")
})
public class ArquivoDashboardDiretoria implements Serializable
{
   private static final long serialVersionUID = 6738676390035154060L;

   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ARQ_DASHBOARD_DIRETORIA")
   @SequenceGenerator(name = "SEQ_ARQ_DASHBOARD_DIRETORIA", sequenceName = "SEQ_ARQ_DASHBOARD_DIRETORIA", initialValue = 1,
            allocationSize = 1)
   @Column(name = "COD_ARQ_DASHBOARD_DIRETORIA")
   private Long codArquivoDashbardDiretoria;
   @Getter
   @Setter
   @Column(name = "CAMINHO_ARQUIVO")
   private String caminhoArquivo;
   @Getter
   @Setter
   @Column(name = "ORDEM_EXIBICAO")
   private Integer ordemExibicao;

}
