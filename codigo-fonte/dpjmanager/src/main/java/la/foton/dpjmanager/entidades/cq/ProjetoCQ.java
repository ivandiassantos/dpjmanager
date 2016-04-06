package la.foton.dpjmanager.entidades.cq;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "REPOPROJECT")
public class ProjetoCQ implements Serializable{
	
	private static final long serialVersionUID = -495961354525336566L;
	
	@Id
	@Getter
	@Setter
	@Column(name = "DBID")
	private Long codProjeto;
	@Getter
	@Setter
	@Column(name = "NAME")
	private String nomeProjeto;
}
