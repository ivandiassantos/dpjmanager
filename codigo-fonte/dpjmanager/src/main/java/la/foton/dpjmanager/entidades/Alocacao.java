package la.foton.dpjmanager.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ALC")
@Getter
@Setter
public class Alocacao implements Serializable{
	
	private static final long serialVersionUID = -8539694965829928015L;
	@EmbeddedId
	private AlocacaoPK alocacaoPK;
	@Column(name = "ALCHORFIM")
	private Long horaTerminoAlocacao;
	@Column(name = "ALCOBS")
	private String observacaoAlocacao;
}
