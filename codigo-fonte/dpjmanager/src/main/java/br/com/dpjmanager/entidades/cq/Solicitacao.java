
package br.com.dpjmanager.entidades.cq;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "SOLICITACAO")
@NamedQueries({
   @NamedQuery(
            name = "listaSolicitacaoPorNome",
            query = "select s from Solicitacao s where upper(s.idSolicitacao) like :nomeSolicitacao or "
               + "upper(s.descricaoSolicitacao) like :nomeSolicitacao and s.idSolicitacao not in (:listaIdsSolicitacoes) "),
   @NamedQuery(name = "buscaPorIdSolicitacao", query = "select s from Solicitacao s where s.idSolicitacao =:idSolicitacao ")
})
@EqualsAndHashCode
public class Solicitacao implements Serializable
{

   private static final long serialVersionUID = 8730084671765678243L;
   @Id
   @Getter
   @Setter
   @Column(name = "DBID")
   private Long codSolicitacao;
   @Getter
   @Setter
   @Column(name = "ID")
   private String idSolicitacao;
   @Getter
   @Setter
   @Column(name = "SOLICITACAO")
   private String descricaoSolicitacao;

}
