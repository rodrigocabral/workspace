package TesteJPA.DomainModel;

import java.util.List;

public interface IRepository<T> {
	void Save(T obj) throws Exception;
	void Delete(T obj) throws Exception;
	T Open(int k) throws Exception;
	List<T> getList() throws Exception;
}
