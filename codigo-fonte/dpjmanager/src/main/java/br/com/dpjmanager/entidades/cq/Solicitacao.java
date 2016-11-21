
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
            name = Solicitacao.QUERY_LISTA_POR_NOME,
            query = "select s from Solicitacao s where upper(s.idSolicitacao) like :nomeSolicitacao or "
               + "upper(s.descricaoSolicitacao) like :nomeSolicitacao and s.idSolicitacao not in (:listaIdsSolicitacoes) "),
   @NamedQuery(name = Solicitacao.QUERY_BUSCA_POR_ID, query = "select s from Solicitacao s where s.idSolicitacao =:idSolicitacao ")
})
@EqualsAndHashCode
public class Solicitacao implements Serializable
{

   public static final String QUERY_LISTA_POR_NOME = "listaPorNome";
   public static final String QUERY_BUSCA_POR_ID = "buscaPorId";
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
