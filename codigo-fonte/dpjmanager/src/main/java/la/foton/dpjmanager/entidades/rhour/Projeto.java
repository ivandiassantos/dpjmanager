package la.foton.dpjmanager.entidades.rhour;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PRJ")
@NamedQuery(name = "buscaPorCliente", query = "select prj from Projeto prj join fetch prj.listaAtividadesMaesProjeto atv "
   + "where prj.empresa.codEmpresa =:codCliente and atv.nivelAtividade = 1 and atv.indicadorAtividadeAtiva = 1 and "
         +"atv.atividadeMae.codAtividade = 0 order by prj.nomeProjeto asc")
@Getter
@Setter
public class Projeto implements Serializable {
	
	private static final long serialVersionUID = -2099968402833435291L;
	@Id
	@Column(name = "PRJCOD")
	private Long codProjeto;
	@Column(name = "PRJNOM")
	private String nomeProjeto;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPCOD")
	private Empresa empresa;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projeto")
	private List<Atividade> listaAtividadesMaesProjeto;
}
