package br.com.dpjmanager.entidades.dpjmanager;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Mapeamento da tabela Projeto
 * 
 * @author Outubro/2016: Antonio Jousivan <DD>
 */

@Entity
@Table(name = "PROJETO")
@NamedQuery(name = Projeto.QUERY_OBTEM_POR_CODIGO_PROJETO_CQ, query = "select p from Projeto p where p.codProjetoCQ =:codProjetoCQ")
public class Projeto implements Serializable
{
   private static final long serialVersionUID = -4932784086224411333L;

   public static final String QUERY_OBTEM_POR_CODIGO_PROJETO_CQ = "obtemPorCodigoProjetoCQ";

   @Id
   @Getter
   @Setter
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROJETO")
   @SequenceGenerator(name = "SEQ_PROJETO", sequenceName = "SEQ_PROJETO", initialValue = 1, allocationSize = 1)
   @Column(name = "COD_PROJETO")
   private Long codProjeto;

   @Getter
   @Setter
   @Column(name = "DESCRICAO_PROJETO")
   private String descricaoProjeto;

   @Getter
   @Setter
   @Column(name = "CQ_COD_PROJETO")
   private Long codProjetoCQ;

   @Getter
   @Setter
   @Column(name = "COD_CLIENTE")
   private Long codCliente;
   
   @Getter
   @Setter
   @OneToMany(mappedBy = "projeto", fetch = FetchType.LAZY)
   private List<ProjetoFase> fasesProjeto;

}
