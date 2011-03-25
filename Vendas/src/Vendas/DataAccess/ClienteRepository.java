package Vendas.DataAccess;

import javax.persistence.*;

import Vendas.DomainModel.*;

public class ClienteRepository {
	
	private EntityManager manager;
	private EntityManagerFactory factory;
	private EntityTransaction transaction;
	
	public ClienteRepository() {
		factory = Persistence.createEntityManagerFactory("Vendas"); 
		manager = factory.createEntityManager();
		
	}
	
	public void Save(Cliente obj) throws Exception {
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
	
	public void Delete(Cliente obj) throws Exception {
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
	
	public Cliente Open(int id) throws Exception {
		try {
			return manager.find(Cliente.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}

}