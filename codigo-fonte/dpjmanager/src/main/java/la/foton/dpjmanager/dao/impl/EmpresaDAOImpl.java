package la.foton.dpjmanager.dao.impl;

import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import la.foton.dpjmanager.dao.EmpresaDAO;
import la.foton.dpjmanager.entidades.Empresa;

@Repository
public class EmpresaDAOImpl extends DaoImpl<Empresa> implements EmpresaDAO{
	public EmpresaDAOImpl() {
		super(Empresa.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Empresa> listarEmpresa(){
		TypedQuery<Empresa> query = (TypedQuery<Empresa>) getEntityManagerRhour().createNamedQuery("buscaEmpresa");
		return query.getResultList();
	}
	
}
