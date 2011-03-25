package TesteJPA.Presentation;

import java.util.List;

import TesteJPA.DataAccess.ClienteRepository;
import TesteJPA.DomainModel.Cliente;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ClienteRepository repo = new ClienteRepository();
		
		Cliente cc = new Cliente();
		cc.setNome("Teste1");
		try {
			repo.Save(cc);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		for(Cliente c : repo.getTop10ByName())
			System.out.println(c.getNome());
		
		System.out.println("FIM");
		
		
	}

}
