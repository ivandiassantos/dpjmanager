package la.foton.dpjmanager.dao.impl;

import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import la.foton.dpjmanager.dao.NegociacaoDAO;
import la.foton.dpjmanager.entidades.Negociacao;

@Repository
public class NegociacaoDAOImpl extends DaoImpl<Negociacao> implements NegociacaoDAO{
	@SuppressWarnings("unchecked")
	@Override
	public List<Negociacao> listarNegociacoes(Long codigoIntegrante, Date dataInicio, Date dataFinal) {
		TypedQuery<Negociacao> query = (TypedQuery<Negociacao>) getEntityManagerRhour().createNamedQuery("listaNegociacoes");
		query.setParameter("codigoIntegrante", codigoIntegrante);
		query.setParameter("dataInicio", dataInicio);
		query.setParameter("dataFim", dataFinal);
		return query.getResultList();
	}
}
