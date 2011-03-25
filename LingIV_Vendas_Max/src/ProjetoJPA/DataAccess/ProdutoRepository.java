package ProjetoJPA.DataAccess;

import javax.persistence.*;
import ProjetoJPA.DomainModel.*;

public class ProdutoRepository {

	private EntityManagerFactory factory;
	private EntityManager manager;
	private EntityTransaction transaction;
	
	public ProdutoRepository(){
		factory = Persistence.createEntityManagerFactory("ProjetoJPA");
		manager = factory.createEntityManager();
	}
	
	public void Save(Produto obj) throws Exception{
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
	
	public void Delete(Produto obj) throws Exception{
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
	
	public Produto Open(int id) throws Exception{
		try{
			return manager.find(Produto.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}
	
}
