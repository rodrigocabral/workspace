package ProjetoJPA.DataAccess;

import javax.persistence.*;

import ProjetoJPA.DomainModel.*;

public class VendasRepository {
	
	private EntityManager manager;
	private EntityManagerFactory factory;
	private EntityTransaction transaction;
	
	public VendasRepository() {
		factory = Persistence.createEntityManagerFactory("ProjetoJPA"); 
		manager = factory.createEntityManager();
		
	}
	
	public void Save(Vendas obj) throws Exception {
		try {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(obj);
			transaction.commit();
		}
		catch(Exception ex){
			transaction.rollback();
			throw ex;
		}
	}
	
	public void Delete(Vendas obj) throws Exception {
		try {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(obj);
			transaction.commit();
		}
		catch(Exception ex){
			transaction.rollback();
			throw ex;
		}
	}
	
	public Vendas Open(int id) throws Exception {
		try {
			return manager.find(Vendas.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}

}
