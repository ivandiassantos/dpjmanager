package la.foton.dpjmanager.entidades.rhour;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class AlocacaoPK implements Serializable{
	
	private static final long serialVersionUID = 5403791995131972605L;
	
	@Column(name = "NEGSEQ")
	private Long sequencialNegociacao;
	@Column(name = "ALCDAT")
	@Temporal(TemporalType.DATE)
	private Date dataAlocacao;
	@Column(name = "ALCHORINI")
	private Long horaInicioAlocacao;
	
	
}
