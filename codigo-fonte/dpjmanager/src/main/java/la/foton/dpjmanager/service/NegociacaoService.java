package la.foton.dpjmanager.service;

import java.util.Date;
import java.util.List;
import la.foton.dpjmanager.entidades.Negociacao;

public interface NegociacaoService {
	List<Negociacao> listarNegociacoes(Long codigoIntegrante, Date dataInicio, Date dataFinal);
}
