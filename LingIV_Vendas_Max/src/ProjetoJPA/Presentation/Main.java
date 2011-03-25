package ProjetoJPA.Presentation;

import ProjetoJPA.DomainModel.*;

import ProjetoJPA.DataAccess.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*ClientesRepository repo = new ClientesRepository();
		Clientes obj = new Clientes();
		obj.setNome("blá blá");
		try {
			repo.Save(obj);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}*/
		ProdutoRepository prepo = new ProdutoRepository();
		Produto pobj = new Produto();
		pobj.setNome("Melancia");
		System.out.println("Gravo nome");
		//pobj.setPrecoUnitario(2);
		try{
			prepo.Save(pobj);
			System.out.println("gravou no banco");
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}

}
