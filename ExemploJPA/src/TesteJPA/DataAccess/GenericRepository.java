package TesteJPA.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import TesteJPA.DomainModel.IRepository;

public class GenericRepository<T> implements IRepository<T> {

	 private EntityManager manager;
	 private EntityTransaction transaction;
	
	 private Class type;
	
	public GenericRepository(Class t) {
		type = t;
	}
	
	protected EntityManager getManager() {
		if(manager == null){
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("TesteJPA"); 
			manager = factory.createEntityManager();
		}
		return manager;
	}
	
	protected EntityTransaction getTransaction() {
		if(transaction == null){
			transaction = getManager().getTransaction();
		}
		return transaction;
	}
	
	@Override
	public void Save(T obj) throws Exception {
		try {
			getTransaction().begin();
			getManager().persist(obj);
			getTransaction().commit();
		} catch (Exception e) {  
			getTransaction().rollback();  
	        throw e;  
	    }
		
	}

	@Override
	public void Delete(T obj)  throws Exception  {
		try {
			getTransaction().begin();
			getManager().remove(obj);
			getTransaction().commit();
		} catch (Exception e) {  
			getTransaction().rollback();  
	        throw e;  
	    }
	}

	@SuppressWarnings("unchecked")
	@Override
	public T Open(int k)  throws Exception   {
		return (T)getManager().find(type, k);
	}

	@Override
	public List<T> getList()  throws Exception  {

			CriteriaBuilder cb = getManager().getCriteriaBuilder();
			CriteriaQuery<T> crit = cb.createQuery(type);
			TypedQuery<T> tq = getManager().createQuery(crit); 
			return tq.getResultList();
	}

}
