package Vendas.DataAccess;

import javax.persistence.*;

import Vendas.DomainModel.*;

public class VendasRepository {
	
	private EntityManager manager;//-- Gerenciador de entidade. É uma classe que vai gerar as consultas SQL. 
	private EntityManagerFactory factory;//-- É uma classe que prepara todo o caminho para o EntityManager.
	private EntityTransaction transaction;
	
	public VendasRepository() {
		factory = Persistence.createEntityManagerFactory("Vendas");
		manager = factory.createEntityManager();
		
	}
	
	public void Save(Venda obj) throws Exception{
		try{
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
	
	public void Delte(Venda obj) throws Exception{
		try{
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
	
	public Venda Open(int id) throws Exception{
		try{
			return manager.find(Venda.class, id);//Carrega os dados do banco cujo id é correspondente e carrega no obj
		}
		
		catch(Exception ex){
			throw ex;
		}
		
	}
	
	
	

}
