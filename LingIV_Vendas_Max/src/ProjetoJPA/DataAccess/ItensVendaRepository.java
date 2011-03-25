package ProjetoJPA.DataAccess;

import javax.persistence.*;
import ProjetoJPA.DomainModel.*;

public class ItensVendaRepository {

	private EntityManagerFactory Factory;
	private EntityManager manager;
	private EntityTransaction transaction;
	
	public ItensVendaRepository(){
		Factory = Persistence.createEntityManagerFactory("ProjetoJPA");
		manager = Factory.createEntityManager();
	}
	
	public void Save(ItensVenda obj) throws Exception{
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
	
	public void Delete(ItensVenda obj) throws Exception{
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
	
	public ItensVenda Open(int id){
		return manager.find(ItensVenda.class, id);
	}
}