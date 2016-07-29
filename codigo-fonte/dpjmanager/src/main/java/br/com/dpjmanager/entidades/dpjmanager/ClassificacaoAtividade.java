
package br.com.dpjmanager.entidades.dpjmanager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CLASSIFICACAO_ATIVIDADE")
@Getter
@Setter
@NamedQueries({
   @NamedQuery(name = "listaClassificacaoAtividade", query = "select ca from ClassificacaoAtividade ca join fetch ca.disciplina d "),
   @NamedQuery(name = "listaPorNomeAtividade",
            query = "select ca from ClassificacaoAtividade ca where ca.disciplina.descricaoDisciplina =:nomeDisciplina) ")

})
public class ClassificacaoAtividade
{

   @Id
   @Column(name = "COD_CLASSIFICACAO_ATIVIDADE")
   private Long codClassificacaoAtividade;
   @Column(name = "DESCRICAO_ATIVIDADE")
   private String descricaoAtividade;
   @Column(name = "DESCRICAO_DETALHE_ATIVIDADE")
   private String descricaoDetalheAtividade;
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "COD_DISCIPLINA")
   private Disciplina disciplina;
}