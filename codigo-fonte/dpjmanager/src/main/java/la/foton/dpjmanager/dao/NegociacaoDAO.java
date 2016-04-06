package la.foton.dpjmanager.dao;

import java.util.Date;
import java.util.List;

import la.foton.dpjmanager.entidades.rhour.Negociacao;

public interface NegociacaoDAO extends Dao<Negociacao>{
	List<Negociacao> listarNegociacoes(Long codigoIntegrante, Date dataInicio, Date dataFinal);
}
