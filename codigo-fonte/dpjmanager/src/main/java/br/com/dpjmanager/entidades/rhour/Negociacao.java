
package br.com.dpjmanager.entidades.rhour;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "NEG")
@NamedQueries({
   @NamedQuery(
            name = "obtemSolicitacaoProjeto",
            query = "select neg from Negociacao neg join fetch neg.atividade atv join fetch neg.integrante "
               + "where atv.codAtividade in (select atv.codAtividade from Atividade atv where atv.atividadeMae.codAtividade "
               + "in(select atv.codAtividade from Atividade atv where atv.atividadeMae.codAtividade in (:codAtividade))) "
               + "and atv.projeto.codProjeto =:codProjeto"),
   @NamedQuery(
            name = "obtemSolicitacaoProjetoDescricaoAtividade",
            query = "select neg from Negociacao neg join fetch neg.atividade atv join fetch neg.integrante "
               + "where atv.codAtividade in (select atividade.codAtividade from Atividade atividade where atividade.atividadeMae.codAtividade "
               + "in(select solicitacao.codAtividade from Atividade solicitacao where solicitacao.atividadeMae.codAtividade in (:codAtividade))) "
               + "and atv.projeto.codProjeto =:codProjeto and atv.descricaoAtividade like (:descricaoAtividade)")
})
public class Negociacao implements Serializable
{

   private static final long serialVersionUID = -76430938041298388L;
   @Getter
   @Setter
   @Id
   @Column(name = "NEGSEQ")
   private Long codNegociacao;
   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "ITGCOD")
   private Integrante integrante;
   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "ATVCOD")
   private Atividade atividade;
   @Getter
   @Setter
   @Column(name = "NEGDAT")
   @Temporal(TemporalType.DATE)
   private Date dataNegociacao;
   @Getter
   @Setter
   @Column(name = "NEGHORPVS")
   private Long totalHorasPrevistas;
   @Getter
   @Setter
   @Column(name = "NEGDATFEC")
   @Temporal(TemporalType.DATE)
   private Date dataFechamento;
   @Getter
   @Setter
   @Column(name = "NEGHORALC")
   private Long totalHorasAlocadas;
}
