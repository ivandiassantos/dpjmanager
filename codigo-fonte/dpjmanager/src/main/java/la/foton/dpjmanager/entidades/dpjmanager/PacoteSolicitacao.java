/*
 * Criação : 11/04/2016
 */
package la.foton.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 * Classe de mapeamento da tabela PACOTE_SOLICITACAO.
 * 
 * @author Abril/2016: Ivan Dias <DD>
 */
@Entity
@Table(name = "PACOTE_SOLICITACAO")
public class PacoteSolicitacao implements Serializable
{

   /** @TODO Comentar atributo */
   private static final long serialVersionUID = 1045628425375221765L;

   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PACOTE_SOLICITACAO")
   @SequenceGenerator(name = "SEQ_PACOTE_SOLICITACAO", sequenceName = "SEQ_PACOTE_SOLICITACAO", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_PACOTE_SOLICITACAO")
   private Long codPacoteSolicitacao;

   @Getter
   @Setter
   @Column(name = "ID_SOLICITACAO")
   private String idSolicitacao;

   @Getter
   @Setter
   @Column(name = "DATA_ASSOCIACAO")
   @Temporal(TemporalType.DATE)
   private Date dataInclusao;

   @Getter
   @Setter
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "COD_PACOTE", referencedColumnName = "COD_PACOTE")
   private Pacote pacote;

}
