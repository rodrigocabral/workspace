package TesteJPA.DataAccess;


import java.util.List;

import TesteJPA.DomainModel.Cliente;
import TesteJPA.DomainModel.IClienteRepository;

public class ClienteRepository 
	extends GenericRepository<Cliente> 
	implements IClienteRepository 
{

	public ClienteRepository() {
		super(Cliente.class);
	}

	@Override
	public List<Cliente> getTop10ByName() {
		return getManager().createQuery("select c from Cliente c order by c.nome", Cliente.class)
		.setMaxResults(10).getResultList();
	}


}
