package la.foton.dpjmanager.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import la.foton.dpjmanager.dao.ProjetoDAO;
import la.foton.dpjmanager.entidades.rhour.Projeto;

import org.springframework.stereotype.Repository;

@Repository
public class ProjetoDAOImpl extends DaoImpl<Projeto> implements ProjetoDAO{
	
	public ProjetoDAOImpl() {
		super(Projeto.class);
	}
	
	@SuppressWarnings("unchecked")
   @Override
	public List<Projeto> listaPorCliente(Long codCliente)
	{
	   TypedQuery<Projeto> query = (TypedQuery<Projeto>) getEntityManagerRhour().createNamedQuery("buscaPorCliente");
	   query.setParameter("codCliente", codCliente);
	   return query.getResultList();
	}
	
}
