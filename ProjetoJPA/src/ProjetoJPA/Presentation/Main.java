package ProjetoJPA.Presentation;

import ProjetoJPA.DomainModel.*;
import ProjetoJPA.DataAccess.*;;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ClientesRepository repo = new ClientesRepository();
		Cliente obj = new Cliente();
		obj.setNome("Rodrigo");
		try {
			repo.Save(obj);
			obj.addTelefone("32212011");
			obj.addTelefone("32222222");
			repo.Save(obj);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
