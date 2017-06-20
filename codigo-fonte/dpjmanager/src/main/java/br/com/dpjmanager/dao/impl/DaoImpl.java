
package br.com.dpjmanager.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lombok.Getter;
import lombok.Setter;

/**
 * Classe DAO base do projeto.
 * 
 * @author Agosto/2016: Ivan Dias <DD>
 */
public abstract class DaoImpl
{

   @Setter
   @Getter
   @PersistenceContext(unitName = "dpjManagerPU")
   private EntityManager entityManagerDpjManager;
   @Setter
   @Getter
   @PersistenceContext(unitName = "cqPU")
   private EntityManager entityManagerCQ;
}
