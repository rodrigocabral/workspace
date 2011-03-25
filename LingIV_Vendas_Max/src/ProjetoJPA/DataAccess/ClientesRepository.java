package ProjetoJPA.DataAccess;

import javax.persistence.*;

import ProjetoJPA.DomainModel.*;

public class ClientesRepository {
	
	private EntityManager manager;
	private EntityManagerFactory factory;
	private EntityTransaction transaction;
	
	public ClientesRepository() {
		factory = Persistence.createEntityManagerFactory("ProjetoJPA"); 
		manager = factory.createEntityManager();
		
	}
	
	public void Save(Clientes obj) throws Exception {
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
	
	public void Delete(Clientes obj) throws Exception {
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
	
	public Clientes Open(int id) throws Exception {
		try {
			return manager.find(Clientes.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}

}
