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
@Table(name = "ARQUIVO_DASHBOARD_UNIDADE")
@NamedQueries({
   @NamedQuery(name = "listarArquivosDashboardUnidade", query = "select a from ArquivoDashboardUnidade a order by a.ordemExibicao asc"),
   @NamedQuery(name = "obtemArquivoDashboardUnidadePorOrdemExibicaoCodigo",
            query = "select a from ArquivoDashboardUnidade a order by a.ordemExibicao asc")
})
public class ArquivoDashboardUnidade implements Serializable
{
   private static final long serialVersionUID = -1044724518957940231L;

   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ARQ_DASHBOARD_UNIDADE")
   @SequenceGenerator(name = "SEQ_ARQ_DASHBOARD_UNIDADE", sequenceName = "SEQ_ARQ_DASHBOARD_UNIDADE", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_ARQ_DASHBOARD_UNIDADE")
   private Long codArquivoDashbardUnidade;
   @Getter
   @Setter
   @Column(name = "CAMINHO_ARQUIVO")
   private String caminhoArquivo;
   @Getter
   @Setter
   @Column(name = "ORDEM_EXIBICAO")
   private Integer ordemExibicao;

}
