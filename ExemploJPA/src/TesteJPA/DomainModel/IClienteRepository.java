package TesteJPA.DomainModel;

import java.util.List;

public interface IClienteRepository extends IRepository<Cliente> {
	List<Cliente> getTop10ByName();
}
