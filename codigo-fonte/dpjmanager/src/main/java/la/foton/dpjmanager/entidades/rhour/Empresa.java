package la.foton.dpjmanager.entidades.rhour;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "EMP")
@NamedQuery(name = "buscaEmpresa", query = "select e from Empresa e ")
public class Empresa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5005192688969484048L;
	@Id
	@Column(name = "EMPCOD")
	private Long codEmpresa;
	@Column(name = "EMPNOMFAN")
	private String nomeFantasia;

	public Long getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(Long codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

}
