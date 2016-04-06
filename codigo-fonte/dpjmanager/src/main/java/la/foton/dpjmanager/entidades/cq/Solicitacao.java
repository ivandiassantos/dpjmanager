package la.foton.dpjmanager.entidades.cq;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "SOLICITACAO")
public class Solicitacao implements Serializable{
	
	private static final long serialVersionUID = 8730084671765678243L;
	@Id
	@Getter
	@Setter
	@Column(name = "DBID")
	private Long codSolicitacao;
	@Getter
	@Setter
	@Column(name = "ID")
	private String idSolicitacao;
	@Getter
	@Setter
	@Column(name = "SOLICITACAO")
	private String descricaoSolicitacao;
}
