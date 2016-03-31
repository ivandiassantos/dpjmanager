
package la.foton.dpjmanager.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ITG")
@Getter
@Setter
@NamedQuery(name = "listaPorDisciplina", query = "select distinct(i) from Integrante i join fetch i.listaNegociacoes neg "
   + "join fetch neg.atividade atv where atv.projeto.codProjeto = 425 and atv.descricaoAtividade in (:listaDescricaoAtividade) "
   + "order by i.nomeIntegrante asc ")
public class Integrante implements Serializable
{

   private static final long serialVersionUID = -6177094886781902839L;
   @Id
   @Column(name = "ITGCOD")
   private Long codigoIntegrante;
   @Column(name = "ITGNOM")
   private String nomeIntegrante;
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "integrante")
   private List<Negociacao> listaNegociacoes;
}
