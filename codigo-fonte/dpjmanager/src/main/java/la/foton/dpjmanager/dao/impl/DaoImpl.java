package la.foton.dpjmanager.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import la.foton.dpjmanager.dao.Dao;

public abstract class DaoImpl<ENTIDADE> implements Dao<ENTIDADE> {

	@PersistenceContext(unitName = "rhourPU")
	private EntityManager entityManagerRhour;
	@PersistenceContext(unitName = "dpjManagerPU")
   private EntityManager entityManagerDpjManager;
	private Class<ENTIDADE> classe;
	
	public DaoImpl(Class<ENTIDADE> classe) {
		this.classe = classe;
	}
	
	public DaoImpl() {
		
	}
	
	
   public EntityManager getEntityManagerDpjManager()
   {
      return entityManagerDpjManager;
   }
   
   public EntityManager getEntityManagerRhour()
   {
      return entityManagerRhour;
   }
}
