
package br.com.dpjmanager.entidades.rhour;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "RCR")
public class RelacaoAtividadeCQNegociacao implements Serializable
{

   /** @TODO Comentar atributo */
   private static final long serialVersionUID = 8700754917228439783L;
   @Getter
   @Setter
   @Id
   @Column(name = "RCRSEQ")
   private Long codRelacaoAtividadeCQNegociacao;
   @Getter
   @Setter
   @Column(name = "CQDBID")
   private Long codAtividadeCQ;
   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "NEGSEQ")
   private Negociacao negociacao;
   @Getter
   @Setter
   @Column(name = "CQID")
   private String idAtividadeCQ;
}
