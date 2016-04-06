package la.foton.dpjmanager.entidades.rhour;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import org.apache.commons.lang3.StringUtils;

@Entity
@Table(name = "NEG")
@Getter
@Setter
@EqualsAndHashCode
@NamedQuery(name = "listaNegociacoes", query = "select neg from Negociacao neg "
		                                     + "join fetch neg.integrante itg "
		                                     + "join fetch neg.atividade atv "
		                                     + "where itg.codigoIntegrante =:codigoIntegrante "
		                                     + "and neg.dataNegociacao between :dataInicio and :dataFim "
		                                     + "order by neg.dataFechamento desc ")
public class Negociacao implements Serializable{
	
	private static final long serialVersionUID = 4512532561178847959L;
	@Id
	@Column(name = "NEGSEQ")
	private Long sequencialNegociacao;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITGCOD")
	private Integrante integrante;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATVCOD")
	private Atividade atividade;
	@Column(name = "NEGDAT")
	@Temporal(TemporalType.DATE)
	private Date dataNegociacao;
	@Column(name = "NEGHORPVS")
	private Long totalHorasPrevistas;
	@Column(name = "NEGHORALC")
	private Long totalHorasAlocadas;
	@Column(name = "NEGDATFEC")
	@Temporal(TemporalType.DATE)
	private Date dataFechamento;
	
	public String getTotalHorasRealizadas(){
		int quantidadeCaracteres = 0;
		if(totalHorasAlocadas > 0 && totalHorasAlocadas > 9999){
			quantidadeCaracteres = 5;
		}else{
			quantidadeCaracteres = 4;
		}
		String horaFormatada = StringUtils.leftPad(totalHorasAlocadas.toString(), quantidadeCaracteres, '0');
		StringBuilder hora = new StringBuilder(horaFormatada);
		return hora.insert(horaFormatada.length() - 2, ":").toString();
	}
	public String getTotalHorasPrevisao(){
		int quantidadeCaracteres = 0;
		if(totalHorasPrevistas > 0 && totalHorasPrevistas > 9999){
			quantidadeCaracteres = 5;
		}else{
			quantidadeCaracteres = 4;
		}
		String horaFormatada = StringUtils.leftPad(totalHorasPrevistas.toString(), quantidadeCaracteres, '0');
		StringBuilder hora = new StringBuilder(horaFormatada);
		return hora.insert(horaFormatada.length() - 2, ":").toString();
	}
}
