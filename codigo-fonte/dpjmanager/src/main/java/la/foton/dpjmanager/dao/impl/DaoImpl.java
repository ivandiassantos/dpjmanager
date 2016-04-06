package la.foton.dpjmanager.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import la.foton.dpjmanager.dao.Dao;
import lombok.Getter;
import lombok.Setter;

public abstract class DaoImpl<ENTIDADE> implements Dao<ENTIDADE> {
	@Setter
	@Getter
	@PersistenceContext(unitName = "rhourPU")
	private EntityManager entityManagerRhour;
	@Setter
	@Getter
	@PersistenceContext(unitName = "dpjManagerPU")
	private EntityManager entityManagerDpjManager;
	@Setter
	@Getter
	@PersistenceContext(unitName = "cqPU")
	private EntityManager entityManagerCQ;
	private Class<ENTIDADE> classe;

	public DaoImpl(Class<ENTIDADE> classe) {
		this.classe = classe;
	}

	public DaoImpl() {

	}

	
}
