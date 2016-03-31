package la.foton.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import la.foton.dpjmanager.dao.AlocacaoDAO;
import la.foton.dpjmanager.entidades.Alocacao;

@Repository
public class AlocacaoDAOImpl extends DaoImpl<Alocacao> implements AlocacaoDAO {
	@SuppressWarnings("unchecked")
	@Override
	public List<Alocacao> listarAlocacao() {
		TypedQuery<Alocacao> query = (TypedQuery<Alocacao>) getEntityManagerRhour().createNamedQuery("listaAlocacoes");
		
		return query.getResultList();
	}
}
