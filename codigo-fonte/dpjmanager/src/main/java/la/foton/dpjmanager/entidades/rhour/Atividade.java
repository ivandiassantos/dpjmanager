package la.foton.dpjmanager.entidades.rhour;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ATV")
@Getter
@Setter
@NamedQueries({
	@NamedQuery(name = "listaSolicitacoesPorProjeto", query = "select atv from Atividade atv join fetch atv.projeto prj "
		+ "where prj.codProjeto =:codProjeto and atvniv = 2")
})
public class Atividade implements Serializable {

	private static final long serialVersionUID = -8111856128074808247L;
	@Id
	@Column(name = "ATVCOD")
	private Long codAtividade;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATVCODMAE")
	private Atividade atividadeMae;
	@Column(name = "ATVNOM")
	private String nomeAtividade;
	@Column(name = "ATVDSC")
	private String descricaoAtividade;
	@Column(name = "ATVNIV")
	private Integer nivelAtividade;
	@Column(name = "ATVIDCATI")
	private Integer indicadorAtividadeAtiva;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRJCOD")
	private Projeto projeto;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atividade")
	private List<Negociacao> listaNegociacoes;
}
