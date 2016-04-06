package la.foton.dpjmanager.entidades.cq;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ATIVIDADE")
public class AtividadeCQ implements Serializable{

	private static final long serialVersionUID = -3796389000128089744L;
	@Getter
	@Setter
	@Id
	@Column(name = "DBID")
	private Long codAtividade;
	@Getter
	@Setter
	@Column(name = "ID")
	private String idAtividade;
	@Getter
	@Setter
	@Column(name = "ATIVIDADE")
	private String descricaoAtividade;

}
