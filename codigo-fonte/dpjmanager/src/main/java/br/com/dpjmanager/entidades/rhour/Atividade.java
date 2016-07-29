
package br.com.dpjmanager.entidades.rhour;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "ATV")
@NamedQueries({
   @NamedQuery(name = "listaPorIdSolicitacao", query = "select distinct a from Atividade a where a.nomeAtividade like (:nomeAtividade)"),
   @NamedQuery(
            name = "obtemAtividadesPorSolicitacaoProjeto",
            query = "select atv from Atividade atv join fetch atv.negociacao neg "
               + "where atv.codAtividade = neg.atividade.codAtividade and atv.codAtividade in ("
               + "select atv.codAtividade from Atividade atv where atv.atividadeMae.codAtividade in("
               + "select atv.codAtividade from Atividade atv where atv.atividadeMae.codAtividade in (:codAtividade))) "
               + "and atv.projeto.codProjeto =:codProjeto")
})
public class Atividade implements Serializable
{
   private static final long serialVersionUID = -5124653917644044921L;
   @Id
   @Getter
   @Setter
   @Column(name = "ATVCOD")
   private Long codAtividade;
   @Getter
   @Setter
   @Column(name = "ATVNOM")
   private String nomeAtividade;
   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "PRJCOD")
   private Projeto projeto;
   @Getter
   @Setter
   @Column(name = "ATVNIV")
   private Integer nivelAtividade;
   @Getter
   @Setter
   @Column(name = "ATVIDCATI")
   private Integer indicadorAtividadeAtiva;
   @Getter
   @Setter
   @Column(name = "ATVDSC")
   private String descricaoAtividade;
   @Getter
   @Setter
   @Column(name = "ATVPCT")
   private BigDecimal percentualContabilizadoBancoHoras;
   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "ATVCODMAE")
   private Atividade atividadeMae;
   @Getter
   @Setter
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "atividade")
   private List<Negociacao> negociacao;
}
