/*
 * Criação : 11/04/2016
 */

package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import lombok.Getter;
import lombok.Setter;

/**
 * Classe de mapeamento da tabela PACOTE.
 * 
 * @author Abril/2016: Ivan Dias <DD>
 */
@Entity
@Table(name = "PACOTE")
@NamedQueries({
   @NamedQuery(name = Pacote.QUERY_LISTAR_PACOTES, query = "select distinct(p) from Pacote p join fetch p.pacotesSolicitacao "),
   @NamedQuery(name = Pacote.QUERY_VALIDA_NOME_PACOTE,
            query = "select count(p) from Pacote p where upper(p.nomePacote) = upper(:nomePacote)"),
   @NamedQuery(name = Pacote.QUERY_BUSCA_QTD_PACOTE_POR_NOME_CODIGO,
            query = "select p from Pacote p where upper(p.nomePacote) = upper (:nomePacote) and p.codPacote =:codPacote")
})
public class Pacote implements Serializable
{

   public static final String QUERY_LISTAR_PACOTES = "listarPacotes";
   public static final String QUERY_VALIDA_NOME_PACOTE = "validaNomePacote";
   public static final String QUERY_BUSCA_QTD_PACOTE_POR_NOME_CODIGO = "buscaQtdPacotePorNomeCodigo";

   private static final long serialVersionUID = -6529390451947238448L;
   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PACOTE")
   @SequenceGenerator(name = "SEQ_PACOTE", sequenceName = "SEQ_PACOTE", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_PACOTE")
   private Long codPacote;
   @Getter
   @Setter
   @Column(name = "NOME_PACOTE")
   private String nomePacote;
   @Getter
   @Setter
   @Column(name = "DATA_CRIACAO")
   @Temporal(TemporalType.DATE)
   private Date dataCriacao;
   @Getter
   @Setter
   @Column(name = "DATA_INICIO")
   @Temporal(TemporalType.DATE)
   @DateTimeFormat(iso = ISO.DATE)
   private Date dataInicio;
   @Getter
   @Setter
   @Column(name = "DATA_FINAL")
   @Temporal(TemporalType.DATE)
   @DateTimeFormat(iso = ISO.DATE)
   private Date dataFinal;
   @Getter
   @Setter
   @OneToMany(mappedBy = "pacote", fetch = FetchType.LAZY)
   private List<PacoteSolicitacao> pacotesSolicitacao;

}
